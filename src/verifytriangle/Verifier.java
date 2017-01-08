/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifytriangle;

import verifytriangle.model.Triangle;
import verifytriangle.model.Shape;

/**
 *
 * @author vanvu
 */
public class Verifier {
    
    public Shape verify(Triangle t) {
        Shape result = Shape.INVALID;
        for(Shape s : Shape.values()) {
            if(Shape.SCALENE == s || s.getRule().validate(t)) {
                result = s;
                break;
            }
        }
        return result;
    }
}
