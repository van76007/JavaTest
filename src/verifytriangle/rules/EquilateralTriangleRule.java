package verifytriangle.rules;

import verifytriangle.model.Triangle;

/**
 * Rule to verify if this is an equilateral triangle
 * @author vanvu
 */
public class EquilateralTriangleRule implements ValidationRule {
    
    /**
     * 
     * @param t a triangle
     * @return true if the triangle is equilateral triangle
     */
    @Override
    public boolean validate(Triangle t) {
        return (t.getA() == t.getB() && t.getB() == t.getC());
    } 
}
