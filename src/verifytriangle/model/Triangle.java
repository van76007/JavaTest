package verifytriangle.model;


/**
 * Model of a triangle
 * @author vanvu
 */
public class Triangle {
    private float a;
    private float b;
    private float c;
    
    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /**
     * Calculate min side of the triangle
     * @return min dimension of the triangle
     */
    public float getMinSide() {
        float min = a < b ? a : b;
        return (min < c ? min : c);
    }
    
    /**
     * Calculate max side of the triangle
     * @return max dimension of the triangle
     */
    public float getMaxSide() {
        float max = a > b ? a : b;
        return (max > c ? max : c);
    }
    
    /**
     * Calculate sum of all sides of the triangle
     * @return sum of all sides of the triangle
     */
    public float getSumOfAllSides() {
        return (a + b + c);
    }
    
    /**
     * Check if the triangle has at least 2 equal sides
     * @return true if there are 2 equal sides
     */
    public boolean hasAtLeastTwoEqualSides() {
        return (a==b || b==c || c==a);
    }
    
    /**
     * Check if the triangle has all equal sides
     * @return true if all sides are equal
     */
    public boolean hasAllSidesEqual() {
        return (a==b && b==c);
    }
    
    @Override
    public String toString() {
        return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
    }
}
