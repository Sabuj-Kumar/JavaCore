package com.demo.abstractexample;

import java.util.Scanner;

public class Circel extends ShapeCalculator{

	@Override
	void area() {
		
		float radius;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius : ");
		
		radius = sc.nextFloat();
		
		sc.close();
		
		System.out.println("Circle Area : " + 3.14 * radius * radius);
		
	}

}
