package verifytriangle.rules;

import verifytriangle.model.Triangle;

/**
 * Rule to confirm that this is not a triangle
 * @author vanvu
 */
public class InvalidTriangleRule implements ValidationRule {

    @Override
    public boolean validate(Triangle t) {
        return (t.getMinSide() <= 0 || 2*t.getMaxSide() >= t.getSumOfAllSides());
    }
}
