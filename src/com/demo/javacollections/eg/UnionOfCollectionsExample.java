package com.demo.javacollections.eg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class UnionOfCollectionsExample {

	public static void main(String[] args) {
		
		Collection<Integer> collection1 = new ArrayList<>();
		
		collection1.add(10);
		collection1.add(20);
		collection1.add(30);
		collection1.add(40);
		
		Collection<Integer> collection2 = new ArrayList<>();
		
		collection2.add(30);
		collection2.add(40);
		collection2.add(50);
		collection2.add(60);
		
		Set<Integer> union = new HashSet<>(collection1);
		
		union.addAll(collection2);
		
		System.out.println("Elements in either collection1 or collection2: " + union);
	}

}
