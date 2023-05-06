package com.demo.str;

public class MutableDemo {

	public static void main(String[] args) {
		
		/*
		 * String name = "Sabuj";
		 * 
		 * System.out.println("My name is "+name);
		 * 
		 * name.concat(" Kumar");
		 * 
		 * System.out.println("My name with middle name is "+name);
		 */
		
		/*
		 * StringBuffer sbf = new StringBuffer("Sabuj");
		 * System.out.println("My name with middle name is "+sbf);
		 * 
		 * sbf.append(" Kumar"); System.out.println("My name with middle name is "+sbf);
		 */
		
		StringBuilder sbf = new StringBuilder("Sabuj");
		System.out.println("My name with middle name is "+sbf);
		
		sbf.append(" Kumar");
		System.out.println("My name with middle name is "+sbf);
	}

}
