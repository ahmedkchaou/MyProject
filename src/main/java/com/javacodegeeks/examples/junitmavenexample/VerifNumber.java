package com.javacodegeeks.examples.junitmavenexample;

public class VerifNumber implements IVerifNumber {

	public int verif(int i) {
		
		
		for (i=0; i<=4; i++)
		{
		System.out.println("Le nombre est: "+i);
		}
		return i;
	}
	
}
