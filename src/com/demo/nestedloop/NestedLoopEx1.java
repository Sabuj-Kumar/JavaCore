package com.demo.nestedloop;

import java.util.Scanner;

public class NestedLoopEx1 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How Many Line You Want To Print :  ");
		
		n = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}
