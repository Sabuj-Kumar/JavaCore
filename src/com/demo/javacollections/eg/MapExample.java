package com.demo.javacollections.eg;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String,Integer> studentsGrades = new HashMap<String,Integer>();
		
		studentsGrades.put("John", 90);
		studentsGrades.put("Jane", 85);
		studentsGrades.put("Jim", 80);
		
		System.out.println("John's grade is : " + studentsGrades.get("John")); 
		System.out.println("Jane's grade is : " + studentsGrades.get("Jane"));
		System.out.println("Jim's grade is : " + studentsGrades.get("Jim"));
		
		System.out.println("Is Jack's grade present?: "+ studentsGrades.containsKey("Jack"));
	
		System.out.println("Is 90's is present : " + studentsGrades.containsValue(90));
		
		studentsGrades.remove("Jane");
		
		System.out.println("After removing an element, the grades are: " + studentsGrades);
		
		System.out.println("The size of the HashMap is: " + studentsGrades.size());
	}
}
