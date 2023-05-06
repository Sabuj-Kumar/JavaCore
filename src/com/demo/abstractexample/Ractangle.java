package com.demo.abstractexample;

import java.util.Scanner;

public class Ractangle extends ShapeCalculator {

	@Override
	void area() {

		float length, width;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Length : ");

		length = sc.nextFloat();
		
		System.out.println("Enter Width : ");
		
		width = sc.nextFloat();
		
		sc.close();

		System.out.println("Ractangle Area : " + length * width);
	}

}
