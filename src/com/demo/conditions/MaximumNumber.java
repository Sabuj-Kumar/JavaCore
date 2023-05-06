package com.demo.conditions;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ,b ,c;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the first number: ");
		a = sc.nextInt();
		System.out.print("enter the second number: ");
		b = sc.nextInt();
		System.out.print("enter the third number: ");
		c = sc.nextInt();
		
		if(a > b) {
			if(a > c) {
				System.out.print("Maximum number = " + a);
			}else {
				System.out.print("Maximum number = " + c);
			}
		}else {
			if(b > c) {
				System.out.print("Maximum number = " + b);
			}else {
				System.out.print("Maximum number = " + c);
			}
		}
	}

}
