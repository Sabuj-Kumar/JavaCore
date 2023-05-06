package com.demo.recursion;

import java.util.Scanner;

public class RecursionSumExample {

	public static void main(String[] args) {

		int a;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter summision number :  "); 
		a = sc.nextInt();
		sc.close();
		
		System.out.println("Total sum = " + sum(a));
	}

	public static int sum(int a) {
		
		if(a==0)return 0;
		return a + sum(a - 1);
	}
}
