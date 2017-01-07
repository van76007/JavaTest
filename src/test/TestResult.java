/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import verifytriangle.model.Shape;
import verifytriangle.model.Triangle;

/**
 *
 * @author vanvu
 */
public class TestResult {
    private final Triangle t;
    private final Shape expectedResult;
    private final Shape actualResult;
    private boolean isPassed;
    
    public TestResult(Triangle t, Shape expectedResult, Shape actualResult) {
        this.t = t;
        this.expectedResult = expectedResult;
        this.actualResult = actualResult;
        if (actualResult == expectedResult) {
            this.isPassed = true;
        }
    }
    
    public boolean getIsPassed() {
        return this.isPassed;
    }
    
    public String toPrintableFormat() {
        StringBuilder sb = new StringBuilder(t.toString());
        if(expectedResult == actualResult) {
            sb.append(" return true.");
        } else {
            sb.append(" return false");
            sb.append(". Expected result is: ").append(expectedResult.toString());
            sb.append(". Actual result is: ").append(actualResult.toString());
        }
        return sb.toString();
    }
}
