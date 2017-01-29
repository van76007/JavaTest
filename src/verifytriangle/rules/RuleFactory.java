/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifytriangle.rules;

import verifytriangle.model.Shape;

/**
 *
 * @author vanvu
 */
public class RuleFactory {
    
    /**
     * 
     * @param shape a particular type of triangle, i.e. equilateral, isosceles, scalene
     * @return a rule to validate if the triangle has this type
     */
    public static ValidationRule getTriangleValidationRule(Shape shape) {
        if (Shape.INVALID == shape) {
            return new InvalidTriangleRule();
        }
        
        if (Shape.EQUILATERAL == shape) {
            return new EquilateralTriangleRule();
        }
        
        if (Shape.ISOSCELES == shape){
            return new IsoscelesTriangleRule();
        }
        
        if (Shape.SCALENE == shape) {
            return new ScaleneTriangleRule();
        }
        
        return null;
    }
}
