/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import verifytriangle.model.Shape;
import verifytriangle.model.Triangle;
import verifytriangle.Verifier;

/**
 *
 * @author vanvu
 */
public class AppTest {
    
    private final Verifier v = new Verifier();
    
    public TestResult testNegativeDimensionShouldReturnInvalid() {
        Triangle t = new Triangle(1,-1,2);
        return new TestResult(t, Shape.INVALID, v.verify(t));
    }
    
    public TestResult testZeroDimensionShouldReturnInvalidTriangle() {
        Triangle t = new Triangle(1,1,0);
        return new TestResult(t, Shape.INVALID, v.verify(t));
    }
    
    public TestResult testViolateTriangleInequalityShouldReturnInvalidTriangle1() {
        Triangle t = new Triangle(1,1,2);
        return new TestResult(t, Shape.INVALID, v.verify(t));
    }
    
    public TestResult testViolateTriangleInequalityShouldReturnInvalidTriangle2() {
        Triangle t = new Triangle(1,2,4);
        return new TestResult(t, Shape.INVALID, v.verify(t));
    }
    
    public TestResult testAllEqualSidesShouldReturnEquilateralTriangle() {
        Triangle t = new Triangle(1,1,1);
        return new TestResult(t, Shape.EQUILATERAL, v.verify(t));
    }
    
    public TestResult testTwoEqualSidesShouldReturnIsoscelesTriangle() {
        Triangle t = new Triangle(3,2,2);
        return new TestResult(t, Shape.ISOSCELES, v.verify(t));
    }
    
    public TestResult testNoEqualSidesShouldReturnScaleneTriangle() {
        Triangle t = new Triangle(2,3,4);
        return new TestResult(t, Shape.SCALENE, v.verify(t));
    }
    
    
}
