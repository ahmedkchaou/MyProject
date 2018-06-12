package com.javacodegeeks.examples.junitmavenexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.AttributedString;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTestSuccessful {
	private static ICalculator calculator;
	private static IVerifNumber verifnumber;
	
	Calculator calc = new Calculator();
	
	

	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
		verifnumber= new VerifNumber();
	}

	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}

	@After
	public void afterEachTest() {
		System.out.println("This is exceuted after each Test");
	}

	@Test
	public void testSum() {
		
		calc.setaTest(5);
		int result = calculator.sum(3, calc.getaTest() );

		assertEquals(8, result);
	}

	@Test
	public void testDivison() {
		try {
			int result = calculator.divison(10, 2);

			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.divison(10, 0);
	}

	
	@Test
	public void testEqual() {
		boolean result = calculator.equalIntegers(21, 20);

		assertFalse(result);
	}

	
	@Test(expected = Exception.class)
	public void testSubstraction() throws Exception {
		//int result = 10 - 11;
		calculator.subtraction(3, 5);

		//assertEquals(8, result);
		//assertTrue(result == -1);
	}
	
	@Test
	public void testVerifNumber() {
		int result = verifnumber.verif(5);

		assertEquals(5, result);
	}
}