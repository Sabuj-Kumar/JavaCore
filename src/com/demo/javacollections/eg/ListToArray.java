package com.demo.javacollections.eg;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Integer[] array = list.toArray(new Integer[list.size()]);
		
		for (Integer element : array) {
			System.out.println(element);
		}

	}

}
