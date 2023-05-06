package com.demo.javacollections.eg;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> studentNameWithRoll = new HashMap<Integer,String>();
		
		studentNameWithRoll.put(1, "John");
		studentNameWithRoll.put(2, "Jane");
		studentNameWithRoll.put(3, "Jim");
		
		System.out.println("Roll Number 1 Student name is: " + studentNameWithRoll.get(1));
		System.out.println("Roll Number 2 Student name is: " + studentNameWithRoll.get(2));
		System.out.println("Roll Number 3 Student name is: " + studentNameWithRoll.get(3));
		
		System.out.println("Is Roll Number 4 present?: " + studentNameWithRoll.containsKey(4));
		
		System.out.println("Is Jane present?: " + studentNameWithRoll.containsValue("Jane"));
		
		studentNameWithRoll.remove(2);
		
		System.out.println("After removing Roll Number 2, Students are: " + studentNameWithRoll);
		
		System.out.println("The size of the HashMap is: " + studentNameWithRoll.size());
	}
}
