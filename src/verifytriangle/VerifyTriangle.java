/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifytriangle;

import verifytriangle.model.Triangle;
import verifytriangle.model.Shape;
import static java.lang.System.out;

/**
 *
 * @author vanvu
 */
public class VerifyTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle t = new TriangleBuilder().buildTriangleFromUserInput();
        Shape s = new Verifier().verify(t);
        out.format("%s is %s", t.toString(), s.toPrintableFormat());
    }
    
}
