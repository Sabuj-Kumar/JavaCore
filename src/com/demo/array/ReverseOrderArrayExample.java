package com.demo.array;

import java.util.Scanner;

public class ReverseOrderArrayExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :  ");

		int n = sc.nextInt();

		int numbers[] = new int[n];

		for (int index = 0; index < n; index++) {

			System.out.print("Enter number :  " + (index + 1) + " : ");
			numbers[index] = sc.nextInt();
		}

		System.out.print("Print the collected Number : ");
		for (int index = 0; index < n; index++) {

			System.out.print(numbers[index] + " ");
		}
		System.out.println();
		System.out.print("Print the collected Reverse Number : ");
		for (int index = n-1; index >= 0; index--) {

			System.out.print(numbers[index] + " ");
		}
	}

}
