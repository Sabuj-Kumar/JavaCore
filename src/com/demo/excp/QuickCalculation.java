package com.demo.excp;

public class QuickCalculation {

	public static void main(String[] args) {
		
		int a = 10,b = 0;
		
		try {
			QuickCalculationText obj = new QuickCalculationText();
			obj.getSum(a, b);
			System.out.println("test done ");
		}
		catch(ArithmeticException e) {
			System.out.println("Error massege : " + e.getMessage());
		}
	}

}
