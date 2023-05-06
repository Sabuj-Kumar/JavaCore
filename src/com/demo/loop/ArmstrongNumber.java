package com.demo.loop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int n,r,t,s = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you number :  ");
		n = sc.nextInt();
		t = n;
		
		while(n>0) {
			r = n % 10;
			s += (r * r * r);
			n/=10;
		}

		if(s == t)System.out.println("It is an Armstrong number.");
		else System.out.println("It is Not an Armstrong number.");
	}

}
