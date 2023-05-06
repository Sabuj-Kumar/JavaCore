package com.demo.loop;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		int n;
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for prime check :  ");
		n = sc.nextInt();
		sc.close();
		
		for(int index = 2; index <= n/2; index++) {
			
			if((n % index) == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("This is prime number.");
		}else {
			System.out.println("This is Not prime number.");
		}
	}

}
