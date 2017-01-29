package verifytriangle.model;

import verifytriangle.rules.*;

/**
 * Mapping between a particular shape of the triangle to its validation rule
 * @author vanvu
 */
public enum Shape {
    
    INVALID {
        @Override
        public String toPrintableFormat() {
            return "an invalid triangle";
        }
    },

    EQUILATERAL {
        @Override
        public String toPrintableFormat() {
            return "an equilateral triangle";
        }
    },

    ISOSCELES {
        @Override
        public String toPrintableFormat() {
            return "an isosceles triangle";
        }
    },
    
    SCALENE {
        @Override
        public String toPrintableFormat() {
            return "a scalene triangle";
        }
    };
    
    /**
     * Method to build the informative message about the shape of the triangle
     * @return the informative message
     */
    public abstract String toPrintableFormat();
}
