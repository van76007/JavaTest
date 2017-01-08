/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifytriangle.model;


/**
 *
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
    
    public float getMinSide() {
        float min = a < b ? a : b;
        return (min < c ? min : c);
    }
    
    public float getMaxSide() {
        float max = a > b ? a : b;
        return (max > c ? max : c);
    }
    
    public float getSumOfAllSides() {
        return (a + b + c);
    }
    
    public boolean hasAtLeastTwoEqualSides() {
        return (a==b || b==c || c==a);
    }
    
    public boolean hasAllSidesEqual() {
        return (a==b && b==c);
    }
    
    @Override
    public String toString() {
        return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
    }
}
