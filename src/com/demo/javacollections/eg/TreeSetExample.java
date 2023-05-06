package com.demo.javacollections.eg;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		
		names.add("John");
		names.add("Arun");
		names.add("Jane");
		names.add("Deepika");
		names.add("Jim");
		
		names.add("John");
		
		System.out.println("Checking auto remove duplicate and ascending order names: " + names);
	
		System.out.println("The size of the TreeSet is: " + names.size());
		
		System.out.println("Is Jim in the TreeSet?: " + names.contains("Jim"));
		
		names.remove("Jane");
		System.out.println("After removing an element, the names are: " + names);

	}

}
