package com.demo.loop;

import java.util.Scanner;

public class MaxMinCalculator {

	public static void main(String[] args) {
		
		int min = 0, max = 0, num = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter How many number ? : ");
		
		count = sc.nextInt();
		
		for(int index = 0; index < count; index++) {
			
			System.out.print("Enter number "+index + " : ");
			
			num = sc.nextInt();
			
			if(index  == 0) {
				max = min = num;
			}
			else {
				if(num > max) max = num;
				else if(min > num)min = num;
			}
		}
		System.out.println("Maximum number is " + max);
		System.out.println("minmum number is " + min);
		
	}

}
