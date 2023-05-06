package com.demo.series;

import java.util.Scanner;

public class SeriesDemo3 {

	public static void main(String[] args) {
		
		int n, k = 4;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter How Many Number :  ");
		
		n = sc.nextInt();
		
		sc.close();
		for(int index = 0; index < n; index++) {
			
			System.out.print(k + " ");
			
			k *= 3;
		}
	}

}
