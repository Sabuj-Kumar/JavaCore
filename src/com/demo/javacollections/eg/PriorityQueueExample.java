package com.demo.javacollections.eg;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
	
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

		priorityQueue.add(10);
		priorityQueue.add(30);
		priorityQueue.add(20);
		priorityQueue.add(5);
		priorityQueue.add(40);
		
		System.out.println("Elements in the priority queue: " + priorityQueue);
		
		int removedElement = priorityQueue.remove();
		
		System.out.println("Remove element:"+removedElement);
		
		System.out.println("Elements in the priority queue after removal: " + priorityQueue);
		
		int head = priorityQueue.peek();
		
		System.out.println("Element at the head of the priority queue : "+head);
	}
}
