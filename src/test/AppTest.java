package test;

import verifytriangle.model.Shape;
import verifytriangle.model.Triangle;
import verifytriangle.Verifier;

/**
 * The test suite
 * @author vanvu
 */
public class AppTest {
    // Object under test
    private final Verifier v = new Verifier();
    
    public TestResult testNegativeDimensionShouldReturnInvalid1() {
        Triangle t = new Triangle(1, -1, 2);
        return new TestResult(t, Shape.INVALID, v.verify(t));
    }
    
    public TestResult testNegativeDimensionShouldReturnInvalid2() {
        Triangle t = new Triangle(1, -1, -2);
        return new TestResult(t, Shape.INVALID, v.verify(t));
    }
    
    public TestResult testNegativeDimensionShouldReturnInvalid3() {
        Triangle t = new Triangle(-1, -1, -2);
        return new TestResult(t, Shape.INVALID, v.verify(t));
    }
    
    public TestResult testZeroDimensionShouldReturnInvalidTriangle1() {
        Triangle t = new Triangle(1, 1, 0);
        return new TestResult(t, Shape.INVALID, v.verify(t));
    }
    
    public TestResult testZeroDimensionShouldReturnInvalidTriangle2() {
        Triangle t = new Triangle(0, 1, 0);
        return new TestResult(t, Shape.INVALID, v.verify(t));
    }
    
    public TestResult testZeroDimensionShouldReturnInvalidTriangle3() {
        Triangle t = new Triangle(0, 0, 0);
        return new TestResult(t, Shape.INVALID, v.verify(t));
    }
    
    public TestResult testViolateTriangleInequalityShouldReturnInvalidTriangle1() {
        Triangle t = new Triangle(1, 1, 2);
        return new TestResult(t, Shape.INVALID, v.verify(t));
    }
    
    public TestResult testViolateTriangleInequalityShouldReturnInvalidTriangle2() {
        Triangle t = new Triangle(1, 2, 4);
        return new TestResult(t, Shape.INVALID, v.verify(t));
    }
    
    public TestResult testWithOverflowIntegerShouldReturnInvalidTriangle() {
        Triangle t = new Triangle(2, Float.MAX_VALUE - 1, 2);
        return new TestResult(t, Shape.INVALID, v.verify(t));
    }
    
    public TestResult testWithOverflowIntegerShouldReturnInvalidTriangle1() {
        Triangle t = new Triangle(Float.MAX_VALUE, Float.MAX_VALUE / 2, 2);
        return new TestResult(t, Shape.INVALID, v.verify(t));
    }
    
    public TestResult testWithOverflowIntegerShouldReturnInvalidTriangle2() {
        Triangle t = new Triangle(Float.MAX_VALUE, Float.MAX_VALUE / 2, Float.MAX_VALUE / 2);
        return new TestResult(t, Shape.INVALID, v.verify(t));
    }
    
    public TestResult testAllEqualSidesShouldReturnEquilateralTriangle() {
        Triangle t = new Triangle(1, 1, 1);
        return new TestResult(t, Shape.EQUILATERAL, v.verify(t));
    }
    
    public TestResult testTwoEqualSidesShouldReturnIsoscelesTriangle() {
        Triangle t = new Triangle(3, 2, 2);
        return new TestResult(t, Shape.ISOSCELES, v.verify(t));
    }
    
    public TestResult testNoEqualSidesShouldReturnScaleneTriangle() {
        Triangle t = new Triangle(2, 3, 4);
        return new TestResult(t, Shape.SCALENE, v.verify(t));
    }
    
    public TestResult testRightAngledTrinagleShouldReturnScaleneTriangle() {
        Triangle t = new Triangle(3, 4, 5);
        return new TestResult(t, Shape.SCALENE, v.verify(t));
    }
    
    public TestResult testWithOverflowIntegerShouldReturnScaleneTriangle2() {
        Triangle t = new Triangle(Float.MAX_VALUE / 2, Float.MAX_VALUE / 3, Float.MAX_VALUE / 4);
        return new TestResult(t, Shape.SCALENE, v.verify(t));
    }
}
