package verifytriangle.rules;

import verifytriangle.model.Triangle;

/**
 * Rule to validate scalene triangle
 * @author vanvu
 */
public class ScaleneTriangleRule implements ValidationRule {
    
    /**
     * 
     * @param t a triangle
     * @return true if the triangle is a scalene triangle
     */
    @Override
    public boolean validate(Triangle t) {
        if (!t.isValid()) {
            return false;
        }
        return (t.getA() != t.getB() && t.getB() != t.getC() && t.getC() != t.getA());
    }
}
