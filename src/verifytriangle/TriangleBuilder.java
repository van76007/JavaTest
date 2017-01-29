package verifytriangle;

import verifytriangle.model.Triangle;
import static java.lang.System.out;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A class to build a triangle from the user's input
 * @author vanvu
 */
public class TriangleBuilder {
    public Triangle buildTriangleFromUserInput() {
        out.println("Please enter three dimensions of the triangle:");
        
        Scanner scanner = new Scanner(System.in);
        float[] dimensions = new float[3];
        int i = 0;
        
        while(i<3) {
            try {
                dimensions[i] = scanner.nextFloat();
                out.println("Read " + dimensions[i]);
                i++;
            } catch(InputMismatchException ex) {
                out.println("Please enter a number");
                scanner.nextLine();
            }
        }
        
        out.println("Verifying...");
        return (new Triangle(dimensions[0], dimensions[1], dimensions[2]));
    }
}
