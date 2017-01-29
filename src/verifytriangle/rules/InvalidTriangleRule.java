package verifytriangle.rules;

import verifytriangle.model.Triangle;

/**
 * Rule to confirm that this is not a triangle
 * @author vanvu
 */
public class InvalidTriangleRule implements ValidationRule {
    
    /**
     * 
     * @param t a triangle
     * @return true if the triangle is invalid, i.e. its sides does not satisfy the triangle inequality
     */
    @Override
    public boolean validate(Triangle t) {
        t.setValid(testTriangleInequality(t.getA(), t.getB(), t.getC()));
        return (!t.isValid());
    }
    
    /**
     * 
     * @param a a side of the triangle
     * @param b a side of the triangle
     * @param c a side of the triangle
     * @return true if three sides of the triangle satisfies the triangle inequality:
     *              1. min side > 0
     *              2. Assume a>=b>=c. We should have c > | a-b |
     *                 Note that we do not compare a < b+c due to potential integer overflow
     */
    private boolean testTriangleInequality(float a, float b, float c) {
        float min;
        float[] remaining = new float[2];
        
        if (a > b) {
            min = b;
            remaining[0] = a;
        } else {
            min = a;
            remaining[0] = b;
        }
        
        if (min > c) {
            remaining[1] = min;
            min = c;
        } else {
            remaining[1] = c;
        }
        
        if (min <=0 ) {
            return false;
        } else {
            return (min > Math.abs(remaining[0] - remaining[1]));
        }
    }
}
