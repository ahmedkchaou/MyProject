package com.javacodegeeks.examples.junitmavenexample;

public class Calculator implements ICalculator {

	public int aTest;
	
	public int getaTest() {
		return aTest;
	}


	public void setaTest(int aTest) {
		this.aTest = aTest;
	}


//test somme with new branch

	public int sum(int a, int b)   {
		
		return a + b;
	}

	
	public int subtraction(int a, int b) throws Exception {
		
		if (b > a) {
			throw new Exception("subtraction error");
		}
		return a - b;
	}

	
	public int multiplication(int a, int b) {
		return a * b;
	}

	
	public int divison(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Divider can't be zero");
		}

		return a / b;
	}

	
	public boolean equalIntegers(int a, int b) {
		boolean result = false;

		if (a == b) {
			result = true;
		}

		return result;
	}
}