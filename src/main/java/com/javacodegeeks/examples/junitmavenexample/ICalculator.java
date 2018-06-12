package com.javacodegeeks.examples.junitmavenexample;

public interface ICalculator {
	
	
	int sum(int a, int b);

	int subtraction(int a, int b) throws Exception;
	
	//sum je termine mes travaux prob53
	int multiplication(int a, int b);

	int divison(int a, int b) throws Exception;

	boolean equalIntegers(int a, int b);
}