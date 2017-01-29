package verifytriangle;

import verifytriangle.model.Triangle;
import verifytriangle.model.Shape;
import verifytriangle.rules.RuleFactory;

/**
 * An implementation of the algorithm to verify the shape of a triangle
 * @author vanvu
 */
public class Verifier {
    
    public Shape verify(Triangle t) {
        Shape result = Shape.INVALID;
        for(Shape s : Shape.values()) {
            // No need to check the SCALENE rule as all the other rules fail is the guarantee that this is a scalene triangle
            if(Shape.SCALENE == s || RuleFactory.getTriangleValidationRule(s).validate(t)) {
                result = s;
                break;
            }
        }
        return result;
    }
}
