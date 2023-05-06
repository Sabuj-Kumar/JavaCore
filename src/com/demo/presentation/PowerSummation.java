package com.demo.presentation;

import java.util.Scanner;

public class PowerSummation {

	public static void main(String[] args) {
		
		int n,t,sum = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number : ");
		n = sc.nextInt();
		
		System.out.print("Enter how many time : ");
		t = sc.nextInt();
		
		sc.close();

		for(int index = 0; index < t; index++) {
			
			sum += Math.pow(n, index);
		}
		
		System.out.println("sum = " + sum);
	}

}
