package com.demo.method;

import java.util.Scanner;

public class PerDaySalary {

	public static void main(String[] args) {
		
		double markSalary,thomasSalary,jonSalary;
		Scanner sc = new Scanner(System.in);
		
		inputSalary("mark");
		markSalary = sc.nextDouble();
		printPerDaySalary("mark",markSalary);
		
		inputSalary("thomas");
		thomasSalary = sc.nextDouble();
		printPerDaySalary("thomas",thomasSalary);
		
	    inputSalary("jon");
		jonSalary = sc.nextDouble();
		printPerDaySalary("jon",jonSalary);
		
		sc.close();
	}
	
	public static void inputSalary(String name) {
		
		System.out.print("Enter the "+name + " Monthly Salary :  "); 
	}
	
	public static void printPerDaySalary(String Name,double monthlySalary) {
		
		System.out.println(Name + " per day salary : " + (monthlySalary/30.0)); 
	}

}
