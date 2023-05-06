package com.demo.javacollections.eg;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> studentGrades = new LinkedHashMap<String, Integer>();
		
		studentGrades.put("John", 90);
		studentGrades.put("Jane", 85);
		studentGrades.put("Jim", 80);
		
		System.out.println("John's grade is: " + studentGrades.get("John"));
		System.out.println("Jane's grade is: " + studentGrades.get("Jane"));
		System.out.println("Jim's grade is: " + studentGrades.get("Jim"));
	
		System.out.println("Is Jack's grade present?: " + studentGrades.containsKey("Jack"));
		
		System.out.println("Is 90 present?: " + studentGrades.containsValue(90));
	
		studentGrades.remove("Jane");
		System.out.println("After removing an element, the grades are: " + studentGrades);

		System.out.println("The elements of the LinkedHashMap are: " + studentGrades);
	}

}
