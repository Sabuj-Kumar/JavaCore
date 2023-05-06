package com.demo.method;

import java.util.Scanner;

public class FindMaxMinNumber {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number :  ");
		a = sc.nextInt();
		
		System.out.print("Enter the second number :  ");
		b = sc.nextInt();
		
		sc.close();
		
		int max = findMaxNumber(a,b);
		int min = findMinNumber(a,b);
		
		printMaxMinNumber(max,min);
	}
	
	public static int findMaxNumber(int a,int b) {
		
		return a > b ? a:b;
	}
	
	public static int findMinNumber(int a,int b) {
		
		return a > b? b:a;
	}

	public static void printMaxMinNumber(int max,int min) {
		System.out.println("Max Number : " + max);
		System.out.println("Min Number : " + min);
	}
}
