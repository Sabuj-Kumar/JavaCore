package com.demo.javacollections.eg;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
		
		arrayDeque.addFirst(2);
		arrayDeque.addLast(3);
		arrayDeque.addFirst(1);
		arrayDeque.addLast(4);
		
		System.out.println("contents of deque: "+arrayDeque);
		
		int firstElement = arrayDeque.getFirst();
		int lastElement = arrayDeque.getLast();
		
		System.out.println("First Elements : "+firstElement);
		System.out.println("Last Elements : "+lastElement);
		
		arrayDeque.removeFirst();
		arrayDeque.removeLast();
		
		System.out.println("contents of deque after removal from first and last : "+arrayDeque);
		
		boolean containTwo = arrayDeque.contains(2);
		boolean containFive = arrayDeque.contains(5);
		
		System.out.println("Deque contain 2 : "+containTwo);
		System.out.println("Deque contain 2 : "+containFive);
	}
}
