/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import static java.lang.System.out;

/**
 *
 * @author vanvu
 */
public class TestRunner {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("test.AppTest");
            Object o = cls.newInstance();
            int numberOfTestCases = 0;
            int numberOfFailedTestCases = 0;
            Method[] allMethods = cls.getDeclaredMethods();
	    for (Method m : allMethods) {
                String methodName = m.getName();
		if (!methodName.startsWith("test")) {
		    continue;
		}
                
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
            
            if(numberOfFailedTestCases == 0){
                out.format("All %d test cases passed\n", numberOfTestCases);
            } else {
                out.format("%d test cases run. %d failed\n", numberOfTestCases, numberOfFailedTestCases);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
	    out.println(ex.getLocalizedMessage());
	}
    }
}