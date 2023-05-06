package com.demo.series;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0,b = 1,c,n;
		
		System.out.print("Enter the length of fibonacci series: ");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		sc.close();
		
		for(int index = 0; index < n; index++) {
			
			System.out.print(a + " ");
			
			c = b;
			b = a;
			a  = b + c;	
		}
	}

}
