package com.demo.javacollections.eg;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Integer> numbers = new LinkedList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println("Queue: "+numbers);
		
		int removeElement = numbers.remove();
		
		System.out.println("Remove element : "+removeElement);
		
		System.out.println("Element of queue after removal : "+numbers);
		
		int head = numbers.peek();
		
		System.out.println("Element at front of the Queue : "+ head);
	}
}
