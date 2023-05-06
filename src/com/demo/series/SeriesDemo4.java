package com.demo.series;

import java.util.Scanner;

public class SeriesDemo4 {

	public static void main(String[] args) {
		int n,sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the how many number :  ");
		n = sc.nextInt();
		
		for(int index = 1; index <= n; index++) {
			
			sum += (index * (index+1));
		}
		
		System.out.println(sum);
	}

}
