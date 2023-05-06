package com.demo.javacollections.eg;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> name = new HashSet<String>();
		
		name.add("John");
		name.add("Jim");
		name.add("Jane");
		
		name.add("John");
		
		System.out.println("Checking duplicate element coming 2 times or not: " + name);
		
		System.out.println("The size of the HashSet is: " + name.size());
	
		System.out.println("Is Jim in the HashSet?: " + name.contains("Jim"));
		
		name.remove("Jane");
		System.out.println("After removing Jane, the names are: " + name);
	}

}
