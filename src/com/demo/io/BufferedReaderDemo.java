package com.demo.io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("Enter Name : ");
		String name = br.readLine();
		
		System.out.println("Enter Age : ");
		float age = Float.parseFloat(br.readLine());
		
		System.out.println("Enter Roll No : ");
		int roll = Integer.parseInt(br.readLine());
		
		System.out.println("Is in Class One ? : ");
		boolean ans = Boolean.parseBoolean(br.readLine());
	
		System.out.println("Name "+ name);
		System.out.println("Age"+ age);
		System.out.println("Roll No "+roll);
		System.out.println("Is in Class One "+ans);
		
	}

}
