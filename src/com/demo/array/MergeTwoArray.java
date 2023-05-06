package com.demo.array;

import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {

		int n, m;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first array size :  ");

		n = sc.nextInt();

		System.out.println("Enter the Second array size :  ");

		m = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[m];
		int c[] = new int[n + m];

		System.out.println("Enter the First array list :  ");

		for (int index = 0; index < n; index++) {

			System.out.print("Enter the Number " + (index + 1) + " :  ");
			a[index] = sc.nextInt();
		}

		System.out.println();
		System.out.println("Enter the Second array list :  ");

		for (int index = 0; index < m; index++) {

			System.out.print("Enter the Number " + (index + 1) + " :  ");
			b[index] = sc.nextInt();
		}

		// merge array
		for (int index = 0; index < n + m; index++) {

			if (index < n) {
				c[index] = a[index];
			} else {
				c[index] = b[index - n];
			}
		}

		//print merge array
		
		for (int index = 0; index < n + m; index++) {

			System.out.print("merge array " + (index + 1) + " :  " + c[index] + " ");
		}
	}

}
