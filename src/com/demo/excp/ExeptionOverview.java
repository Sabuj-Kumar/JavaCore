package com.demo.excp;

public class ExeptionOverview {

	public static void main(String[] args) {
		int a = 20,b = 0;
		System.out.println( a + " + " + b + " = " +(a + b));
		System.out.println( a + " - " + b + " = " +(a - b));
		System.out.println( a + " * " + b + " = " +(a * b));
		try {
			System.out.println( a + " / " + b + " = " +(a / b));
		}
		catch(Exception e) {
			System.out.println("Error is " + e.getMessage());
		}
	}

}
