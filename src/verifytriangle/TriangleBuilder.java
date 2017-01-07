/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifytriangle;

import verifytriangle.model.Triangle;
import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
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
