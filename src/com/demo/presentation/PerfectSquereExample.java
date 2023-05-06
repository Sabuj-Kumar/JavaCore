package com.demo.presentation;

import java.util.Scanner;

public class PerfectSquereExample {

	public static void main(String[] args) {
		
		
		double sqrtDouble = 0.0;
		int sqrtInt = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter number to check perfect square : " );
		num = sc.nextInt();
		sc.close();
		
		sqrtDouble = Math.sqrt(num);
		
		sqrtInt = (int) Math.sqrt(num);
		
		
		if(sqrtDouble == sqrtInt) {
			System.out.print( num + " is perfect square." );
		}else {
			System.out.print( num + " is not perfect square." );
		}
	}

}
