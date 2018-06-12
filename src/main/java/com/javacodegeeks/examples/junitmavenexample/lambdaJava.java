package com.javacodegeeks.examples.junitmavenexample;

public class lambdaJava {

	public static void main(String[] args) {

		lambdaJava tester = new lambdaJava();
		
		MethodeOperation somme = (int a, int b) -> a+b;
		MethodeOperation sous = (int a,int b) -> a-b;
		MethodeOperation div = (int a, int b) -> a / b;
		
		MethodeString affiche = (String val) -> val;
	
		  System.out.println("10 + 5 = " + tester.operate(10, 5, somme));
		  System.out.println("10-5 =" + tester.operate(10, 5, sous));
		  System.out.println("10/2= "+ tester.operate(10, 2, div));
		  
		  System.out.println("Hello " +tester.valeurString ("KCHAOU",affiche));

	}
	
	private String valeurString(String string, MethodeString affiche) {
		
		return affiche.value(string);
	}

	private int operate(int i, int j, MethodeOperation op) {
		
		return op.operation(i, j);
	}

	interface MethodeOperation 
	{
		int operation (int x, int y);
	}
	

	interface MethodeString{
		
		String value (String val);
	}

	
}
