package com.demo.conditions;

import java.util.Scanner;

public class WeekDayCalculation {

	public static void main(String[] args) {
		int dayNmber;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the day number: ");
		dayNmber = sc.nextInt();
		
		switch(dayNmber) {
		 	
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			case 8:
				System.out.println("Sunday");
				break;
				
			default:
				System.out.println("Invalid day numbe. It should be in 1 to 7");
		}
		

	}

}
