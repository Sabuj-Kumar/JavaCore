package com.demo.javacollections.eg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseListExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println("Original List "+numbers);
		
		Collections.reverse(numbers);
		
		System.out.println("Sorted List "+numbers);
	}

}
