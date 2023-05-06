package com.demo.presentation;

import java.util.Scanner;

public class MathFunctionDemo {

	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);
		sc.close();
		
		int retVal1 = Math.max(19, 20);
		//System.out.println(retVal1);
		
		int retVal2 = Math.min(19, 20);
		//System.out.println(retVal2);
		
		double retVal3 = Math.sqrt(20);
		//System.out.println(retVal3);
		
		double retVal4 = Math.pow(3, 2);
		//System.out.println(retVal4);
		
		double retVal5 = Math.random();
		//System.out.println(retVal5);
		
		int retVal6 = Math.multiplyExact(3, 4);
		//System.out.println(retVal6);
		
		int retVal7= Math.subtractExact(3, 4);
		//System.out.println(retVal7);

	}

}
