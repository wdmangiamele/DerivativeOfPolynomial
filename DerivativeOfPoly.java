import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class DerivativeOfPoly {
    public static void main(String[] args){
        DerivativeOfPoly dop = new DerivativeOfPoly();
        Scanner scanner = new Scanner(System.in);
        //takes in polynomial
        System.out.print("Enter a polynomial in \"0x^0\" format: ");
        String poly = scanner.nextLine();
        double startTime = System.nanoTime();
        System.out.println("\nDerivative of this polynomial is: "+dop.calc(poly));
        final double endTime = System.nanoTime();
        final double duration = (endTime - startTime)/100000000;
        NumberFormat formatter = new DecimalFormat("###.#####");
        String f = formatter.format(duration);

        System.out.println("\nProgram Runtime: "+f+" seconds");
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