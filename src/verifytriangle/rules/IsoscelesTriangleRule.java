package verifytriangle.rules;

import verifytriangle.model.Triangle;

/**
 * Rule to validate isosceles triangle
 * @author vanvu
 */
public class IsoscelesTriangleRule implements ValidationRule {

    @Override
    public boolean validate(Triangle t) {
        return (t.hasAtLeastTwoEqualSides());
    } 
}
