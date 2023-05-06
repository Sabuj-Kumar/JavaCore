package com.demo.javacollections.eg;

import java.util.Arrays;
import java.util.List;

public class ArrayToListExample {

	public static void main(String[] args) {
		
		String[] words = { "hello", "world", "java" };
		List<String> wordList = Arrays.asList(words);

		System.out.println("Array: " + Arrays.toString(words));
		System.out.println("List: " + wordList);
	}

}
