package verifytriangle;

import verifytriangle.model.Triangle;
import verifytriangle.model.Shape;
import static java.lang.System.out;

/**
 * A Java application to build a triangle from the user input and verify its shape
 * To run:
 *          java -cp VerifyTriangle.jar verifytriangle.VerifyTriangle
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
