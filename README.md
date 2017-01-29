## Synopsis

An assignment to test Java skill

### Problem

Write a Java application. It should take the lengths of the triangle's three sides as input, and return whether the triangle is equilateral, isosceles or scalene.

### Installation

Prerequisitions:
 
1. Java JDK version at least 1.5
2. Windows OS

How to compile in Windows

```
make
```

How to run the application

```
cd dist
java -cp VerifyTriangle.jar verifytriangle.VerifyTriangle
```

### Design decisions

The algorithm to verify a triangle is straightforward. Assumed that the sides of the triangle are a, b, c:

```
	Sort to find min side. Assume that a >= b >= c
	if(c <= 0 || c <= |a - b|) {
		return INVALID_TRIANGLE
	} else if(a == b == c) {
		return EQUILATERAL
	} else if(a==b || b==c || c==a) {
		return ISOSCELES
	} else {
		return SCALENE
	}
```

To avoid multiple conditional branches, I decide to map between a particular shape of the triangle to a validation rule. Then we check the rule one by one until one is satisfied.
Note that the checking order is important due to the prior condition to applied a rule, e.g. to be a triangle, it must NOT be an invalid triangle first. 
I use Factory design pattern to return a validation rule given the type to check

I implemented a light-weight unit testing framework in Java.
All test cases are included in the AppTest class. A test runner will execute all the test cases by using Java reflection to invoke the AppTest class methods, which are test cases
We simulate the cycle of unit test:

1. Setup, which is equivalent to instantiate a new instance of the AppTest class.
2. Run method under test, which is equivalent to invoke a method of the AppTest class, providing its prefix is "test".
3. Assert the test result. Not only it informs us if the test case is passed or not, it also prints the actual vs expected result in case of the failure.

I could have used JUnit testing framework and Maven. However, if we distribute JAR file to a machine without Maven/Dependency library, we have to compile the JAR file statistically.
It is not really neccessary; we could implement our own unit testing framework by using Java reflection. 

### Tests

There are 4 groups of test cases:

1. Invalid triangle:
2. Equilateral triangle.
3. Isosceles triangle.
4. Scalene triangle.

After compiling the JAR file:

```
cd dist
java -cp VerifyTriangle.jar test.TestRunner
```

### License

Free