package verifytriangle.rules;

import verifytriangle.model.Triangle;

/**
 * Interface for all rules to validate the shape of triangle
 * @author vanvu
 */
public interface ValidationRule {
    /**
     * Method to validate the shape of a triangle
     * @param t: a triangle
     * @return true if the triangle satisfies the rule to have a particular shape
     */
    boolean validate(Triangle t);
}
