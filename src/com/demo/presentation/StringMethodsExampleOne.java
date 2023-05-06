package com.demo.presentation;

import java.util.Scanner;

public class StringMethodsExampleOne {

	public static void  main(String[] args) {
		String firstName,lastName;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		
		firstName = sc.nextLine();
		
		System.out.print("Enter last name: ");
		
		lastName = sc.nextLine();
		
		sc.close();
		
		String result = getFormatedValue(firstName) + " " + getFormatedValue(lastName);
		
		System.out.print(result);
	}
	
	public static String getFormatedValue(String value) {
		
		if(value != null) {
			
			value = value.trim();
			value = value.substring(0,1).toUpperCase().concat(value.substring(1).toLowerCase());
			return value;
		}
		return "";
	}
}
