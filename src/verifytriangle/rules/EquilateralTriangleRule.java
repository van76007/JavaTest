package verifytriangle.rules;

import verifytriangle.model.Triangle;

/**
 * Rule to verify if this is an equilateral triangle
 * @author vanvu
 */
public class EquilateralTriangleRule implements ValidationRule {

    @Override
    public boolean validate(Triangle t) {
        return (t.hasAllSidesEqual());
    } 
}
