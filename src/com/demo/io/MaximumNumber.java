package com.demo.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MaximumNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int num1,num2;
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("Enter First Number : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number : ");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.println("Maximum Number : " + (num1 > num2? num1:num2));
	}

}
