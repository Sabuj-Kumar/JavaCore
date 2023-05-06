package com.demo.javacollections.eg;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

	public static void main(String[] args) {
		
		Deque<Integer> deque = new LinkedList<Integer>();
		
		deque.addFirst(1);
		deque.addFirst(2);
		deque.addFirst(3);
		
		System.out.println("Element in the deque: "+deque);
		
		int removeElement = deque.removeFirst();
		
		System.out.println("Remove element from the front : "+removeElement);
		
		System.out.println("Element of deque after removal : "+deque);

		deque.addLast(4);
		deque.addLast(5);
		
		System.out.println("Element in the deque after adding to the end : "+deque);
		
		removeElement = deque.removeLast();
		
		System.out.println("Remove element from the end : "+removeElement);
		
		System.out.println("Element of deque after removal : "+deque);
	}

}
