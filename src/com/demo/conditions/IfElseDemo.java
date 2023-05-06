package com.demo.conditions;
import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		int a  = 10;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		a  = sc.nextInt();
		if(a == 0) {
			System.out.println("this is zero number");
		}
		else if(a > 0) {
			System.out.println("This number is positive");
		}else {
			System.out.println("this number is nagetive");
		}
	}

}
