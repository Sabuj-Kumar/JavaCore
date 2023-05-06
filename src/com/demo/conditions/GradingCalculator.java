package com.demo.conditions;

import java.util.Scanner;

public class GradingCalculator {

	public static void main(String[] args) {

		int marks = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		
		marks = sc.nextInt();
		
		String retVal = switch(marks/10) {
			
			case 10:
			case 9:
				yield "Excelant";
				
			case 8:
				yield "Very Good";
				
			case 7:
			case 6:	
				yield "Good";
				
			default: 
				yield "Fail";
		};
		
		System.out.println(retVal);
		
	}

}
