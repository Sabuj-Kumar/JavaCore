package com.demo.io;
import java.util.Scanner;

public class SomeOfThreeNumber {

	public static void main(String[] args) {
		
		int a,b,c,sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		b = sc.nextInt();
		System.out.println("Enter Third Number: ");
		c = sc.nextInt();
		
		sum = a + b + c ;
		System.out.print("Sum = "+sum);
	}

}
