package verifytriangle.rules;

import verifytriangle.model.Triangle;

/**
 * Rule to validate scalene triangle
 * @author vanvu
 */
public class ScaleneTriangleRule implements ValidationRule {

    @Override
    public boolean validate(Triangle t) {
        return (t.getMinSide() > 0 && 2*t.getMaxSide() < t.getSumOfAllSides() && !t.hasAtLeastTwoEqualSides());
    }
}
