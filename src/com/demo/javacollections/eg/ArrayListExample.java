package com.demo.javacollections.eg;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Jhon");
		name.add("Jimi");
		name.add("jene");
		name.add("Jhon");
		
		System.out.println("All name is : "+name);
		
		System.out.println("First Name : " + name.get(0));
		System.out.println("Second Name : " + name.get(1));
		System.out.println("Third Name : " + name.get(2));
		System.out.println("Third Name : " + name.get(3));
		
		name.remove(3);
		
		System.out.println( "After removing an element, the names are "+name);
		
		System.out.println( "The Size of the array list is :  "+name.size());
	}

}
