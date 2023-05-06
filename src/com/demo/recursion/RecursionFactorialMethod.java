package com.demo.recursion;

import java.util.Scanner;

public class RecursionFactorialMethod {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		n = sc.nextInt();
		sc.close();
		
		System.out.println("Factorial number is : " + calculateFactorial(n));

	}

	public static int calculateFactorial(int num) {
		
		if(num <= 1) return 1;
		else return num * calculateFactorial(num-1); 
	}
}
