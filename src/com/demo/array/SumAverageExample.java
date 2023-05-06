package com.demo.array;

import java.util.Scanner;

public class SumAverageExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :  ");
		
		int n = sc.nextInt();
		int sum = 0;
		float avg = 0.0f;
		
		int numbers[] = new int[n];
		
		for(int index = 0; index < n; index++) {
			
			System.out.println("Enter the number :  ");
			numbers[index] = sc.nextInt();
			
			sum += numbers[index];
		}
		sc.close();
		System.out.println("Total Sum :  "+sum);
		
		avg = (float)sum/n;
		
		System.out.println("Average :  "+avg);
	}

}
