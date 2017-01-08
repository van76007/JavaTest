package test;

import verifytriangle.model.Shape;
import verifytriangle.model.Triangle;

/**
 * Model of result of a test case
 * @author vanvu
 */
public class TestResult {
    // Test parameter
    private final Triangle t;
    // Expected result of a test case
    private final Shape expectedResult;
    // Actual result of a test case
    private final Shape actualResult;
    // Status of the test case: OK/KO
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
    
    /**
     * Method to build informative message about an execution of the test case
     * @return:
     *          0. Test inputs
     *          1. Status: Passed/Not passed
     *          2. If Not passed: What is the actual result vs expected result 
     */
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
