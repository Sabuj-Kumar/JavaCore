package com.demo.loop;

import java.util.Scanner;

public class LcmHcfCalculator {

	public static void main(String[] args) {
		
		int a,b,p,lcm,hcf;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number :  ");
		
		a = sc.nextInt();
		
		System.out.print("Enter the second number :  ");

		b = sc.nextInt();
		
		sc.close();
		
		p = a * b;
		
		while(a != b) {
			
			if( a > b ) {
				a -= b;
			}else {
				b -= a;
			}
		}
		hcf = a;
		
		lcm = p / hcf;
		
		System.out.println("Highest common factor : "+hcf);
		
		System.out.println("Longest common multiple : "+lcm);
	}

}
