package com.demo.excp;

import javax.naming.NamingException;

public class DifferentExectionDemo {

	public static void main(String[] args) {
		int a = 20,b = 0;
		
		System.out.println( a + " * " + b + " = " +(a * b));
		/*
		 * try { System.out.println( a + " / " + b + " = " +(a / b)); }
		 * catch(ArithmeticException e) {
		 * 
		 * System.out.println("Error is " + e.getMessage()); }
		 */
		/*
		 * String name = "Sabuj"; try{ int i = Integer.parseInt(name); }
		 * catch(NumberFormatException e) { System.out.println("Error is " +
		 * e.getMessage()); }
		 */
		 
		/*
		 * String name = null; try{ name.charAt(1); } catch(NullPointerException e) {
		 * System.out.println("Error is " + e.getMessage()); }
		 */
		 int[] array = new int[3] ;
		
		 try{ 
			 int value = array[4];
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("Error is " + e.getMessage());
		 }
	}

}
