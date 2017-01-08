package verifytriangle.model;

import verifytriangle.rules.*;

/**
 * Mapping between a particular shape of the triangle to its validation rule
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
    
    /**
     * Method to get the rule to validate a triangle
     * @return a validation rule
     */
    public abstract ValidationRule getRule();
    /**
     * Method to build the informative message about the shape of the triangle
     * @return 
     */
    public abstract String toPrintableFormat();
}
