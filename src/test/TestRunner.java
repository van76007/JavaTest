package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import static java.lang.System.out;

/**
 * An application to simulate execution of unit testing
 * To run:
 *          java -cp VerifyTriangle.jar test.TestRunner
 * @author vanvu
 */
public class TestRunner {
    public static void main(String[] args) {
        int numberOfTestCases = 0;
        int numberOfFailedTestCases = 0;
        try {
            Class<?> cls = Class.forName("test.AppTest");
            Object o = cls.newInstance();    
            
            Method[] allMethods = cls.getDeclaredMethods();
	    for (Method m : allMethods) {
                String methodName = m.getName();
		if (!methodName.startsWith("test")) {
		    // Skip test setup/tear down/helper methods, only run test cacses
                    continue;
		}
                
                out.println("\nRunning test case...");
                try {
		    m.setAccessible(true);
		    Object testResult = m.invoke(o, (Object[])null);
                    TestResult t = (TestResult) testResult;
                    if (!t.getIsPassed()) {
                        numberOfFailedTestCases++;
                    }
		    out.format("Test case %s with %s%n", methodName, t.toPrintableFormat());
                    numberOfTestCases++;
		} catch (InvocationTargetException ex) {
                    out.println(ex.getLocalizedMessage());
                }
            }
        } catch (ClassNotFoundException | ClassCastException | InstantiationException | IllegalAccessException ex) {
	    out.println(ex.getLocalizedMessage());
	}
        
        if(numberOfFailedTestCases == 0){
            out.format("All %d test cases passed\n", numberOfTestCases);
        } else {
            out.format("%d test cases run. %d failed\n", numberOfTestCases, numberOfFailedTestCases);
        }
    }
}
