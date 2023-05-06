package com.demo.javacollections.eg;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> studentGrades = new TreeMap<String, Integer>();
		
		studentGrades.put("John", 90);
		studentGrades.put("Jane", 85);
		studentGrades.put("Jim", 80);
		studentGrades.put("Arun", 10);
		studentGrades.put("Aakash", 20);
		studentGrades.put("Sandip", 30);
	
		System.out.println(studentGrades);
		
		System.out.println("John's grade is: " + studentGrades.get("John"));
		System.out.println("Jane's grade is: " + studentGrades.get("Jane"));
		System.out.println("Jim's grade is: " + studentGrades.get("Jim"));
		
		System.out.println("Is Jack's grade present?: " + studentGrades.containsKey("Jack"));
		
		System.out.println("Is 90 present?: " + studentGrades.containsValue(90));
		
		studentGrades.remove("Jane");
		System.out.println("After removing Jane, the grades are: " + studentGrades);
		
		System.out.println("The first key in the TreeMap is: " + studentGrades.firstKey());
		System.out.println("The last key in the TreeMap is: " + studentGrades.lastKey());
	}

}
