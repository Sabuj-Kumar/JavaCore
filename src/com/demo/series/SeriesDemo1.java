package com.demo.series;

import java.util.Scanner;

public class SeriesDemo1 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many numbers :  ");
		
		n = sc.nextInt();
		
		sc.close();
		
		for(int index = 1; index <= n; index++) {
			System.out.print(index * index + " ");
		}
	}
}
