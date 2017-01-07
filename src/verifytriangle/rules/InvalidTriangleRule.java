/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifytriangle.rules;

import verifytriangle.model.Triangle;

/**
 *
 * @author vanvu
 */
public class InvalidTriangleRule implements ValidationRule {

    @Override
    public boolean validate(Triangle t) {
        return (t.getMinSide() <= 0 || 2*t.getMaxSide() >= t.getSumOfAllSides());
    }
}
