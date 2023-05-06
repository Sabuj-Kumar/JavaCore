package com.demo.nestedloop;

import java.util.Scanner;

public class DoubleNestedLoop {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many lin you want to print : ");
		n = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < (2 * i ) - 1;  j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
