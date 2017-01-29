package verifytriangle.rules;

import verifytriangle.model.Triangle;

/**
 * Rule to validate isosceles triangle
 * @author vanvu
 */
public class IsoscelesTriangleRule implements ValidationRule {
    
    /**
     * 
     * @param t a triangle
     * @return true if the triangle is an isosceles triangle
     */
    @Override
    public boolean validate(Triangle t) {
        if (!t.isValid()) {
            return false;
        }
        return (t.getA() == t.getB() || t.getB() == t.getC() || t.getC() == t.getA());
    } 
}
