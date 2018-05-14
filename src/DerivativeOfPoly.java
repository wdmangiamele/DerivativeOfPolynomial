import java.util.Scanner;
public class DerivativeOfPoly {
    public static void main(String[] args){
        DerivativeOfPoly dop = new DerivativeOfPoly();
        Scanner scanner = new Scanner(System.in);
        //takes in polynomial
        System.out.print("Enter a polynomial in \"0x^0\" format: ");
        String poly = scanner.nextLine();
        System.out.println("\nDerivative of this polynomial is: "+dop.calc(poly));
    }

    private String calc(String poly){
        String[] parts = poly.split("(x\\^)");
        //set exponent and multiply base (parts[0]) by exponent
        int exponent = Integer.parseInt(parts[1]);
        int baseMultiplied= Integer.parseInt(parts[0])*exponent;
        //if the exponent is 2, don't return the x^1
        if(exponent==2)
            return baseMultiplied + "x";
        //subtract 1 from exponent
        exponent--;
        return baseMultiplied+"x^"+exponent;
    }
}