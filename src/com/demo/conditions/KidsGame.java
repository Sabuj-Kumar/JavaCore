package com.demo.conditions;
import java.util.Scanner;

public class KidsGame {

	public static void main(String[] args) {
		
		String alpha;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value form a to e : ");
		alpha = sc.next();
		
		switch(alpha) {
		
			case "a":
				System.out.println("Apple");
				break;
			case "b":
				System.out.println("Ball");
				break;
			case "c":
				System.out.println("Cat");
				break;
			case "d":
				System.out.println("Dog");
				break;
			case "e":
				System.out.println("Egg");
				break;
			default:
				System.out.println("Invalid Character");
		
				
		}

	}

}
