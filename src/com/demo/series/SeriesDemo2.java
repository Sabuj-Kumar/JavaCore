package com.demo.series;

import java.util.Scanner;

public class SeriesDemo2 {

	public static void main(String[] args) {
		
		int n,k = 7;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		sc.close();
		
		for(int index = 0; index < n; index++) {
			
			System.out.print(k);
			k += 12;
		}
	}

}
