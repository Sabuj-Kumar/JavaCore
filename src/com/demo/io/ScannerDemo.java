package com.demo.io;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		System.out.println("What is you name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("What is you age");
		//int age = sc.nextInt();
		float age = sc.nextFloat();
		System.out.println(age);
		
		System.out.println("is 25 > 20 ?");
		//int age = sc.nextInt();
		boolean ans = sc.nextBoolean();
		System.out.println(ans);
	}

}
