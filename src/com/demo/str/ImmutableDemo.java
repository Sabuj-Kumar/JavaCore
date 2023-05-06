package com.demo.str;

public class ImmutableDemo {

	public static void main(String[] args) {
		
		String name = "Sabuj";
		
		System.out.println("My name is "+name);

		name.concat(" Kumar");
		
		System.out.println("My name with middle name is "+name);
		
		name = name.concat(" Kumar");
		
		System.out.println("My name with middle name is "+name);
	}

}
