package com.demo.array;

import java.util.Scanner;

public class StudentMaxMInAvgAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many student you want :  ");
		
		float sum = 0, avg,max = 0,min = 0;
		int minIndex = 0,maxIndex = 0;
		int n = sc.nextInt();
		
		int roll[] = new int[n];
		float age[] = new float[n];
		
		for(int index = 0; index < n; index++) {
			
			System.out.println("Enter Student's roll no. ");
			roll[index ] = sc.nextInt();
			System.out.println("Enter Student's age ");
			age[index ] = sc.nextFloat();
			
			if(index == 0) {
				min = age[index];
				max = age[index];
			}else if(age[index] > max) {
				max = age[index];
				maxIndex = index;
			}else if(age[index] < min) {
				min = age[index];
				minIndex = index;
			}
			
			sum += age[index];
		}

		avg = (float)sum/n;
		
		System.out.println();
		System.out.println("Student roll and age -> : ");
		
		for(int index = 0; index < n; index++) {
			System.out.println("Roll no : " + roll[index] + " Age : " + age[index]);
		}
		
		System.out.println();
		System.out.println("Roll no : " + roll[maxIndex] + " is older then other students ans his/her age is " + age[maxIndex]);
		System.out.println("Roll no : " + roll[minIndex] + " is younger then other students ans his/her age is " + age[minIndex]);
		
		System.out.println();
		System.out.println("Average Student age is :  " + avg);
		
	}

}
