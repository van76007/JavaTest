package verifytriangle.model;

import java.math.BigDecimal;


/**
 * Model of a triangle
 * @author vanvu
 */
public class Triangle {
    private float a;
    private float b;
    private float c;
    // Boolean value which is true when 3 sides satisfy the triangle inequality
    public boolean valid;
    
    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public float getA() {
        return a;
    }
    
    public float getB() {
        return b;
    }
    
    public float getC() {
        return c;
    }
    
    public void setValid(boolean v) {
        this.valid = v;
    }
    
    public boolean isValid() {
        return this.valid;
    }
    
    @Override
    public String toString() {
        return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
    }
}
