/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifytriangle.model;

import verifytriangle.rules.*;

/**
 *
 * @author vanvu
 */
public enum Shape {
    
    INVALID {
        @Override
        public InvalidTriangleRule getRule() {
            return new InvalidTriangleRule();
        }
        
        @Override
        public String toPrintableFormat() {
            return "an invalid triangle";
        }
    },

    EQUILATERAL {
        @Override
        public EquilateralTriangleRule getRule() {
            return new EquilateralTriangleRule();
        }
        
        @Override
        public String toPrintableFormat() {
            return "an equilateral triangle";
        }
    },

    ISOSCELES {
        @Override
        public IsoscelesTriangleRule getRule() {
            return new IsoscelesTriangleRule();
        }
        
        @Override
        public String toPrintableFormat() {
            return "an isosceles triangle";
        }
    },
    
    SCALENE {
        @Override
        public ScaleneTriangleRule getRule() {
            return new ScaleneTriangleRule();
        }
        
        @Override
        public String toPrintableFormat() {
            return "a scalene triangle";
        }
    };

    public abstract ValidationRule getRule();
    public abstract String toPrintableFormat();
}
