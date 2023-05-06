package com.demo.javacollections.eg;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> numbers = new Stack<Integer>();
		
		numbers.push(1);
		numbers.push(2);
		numbers.push(3);
		numbers.push(4);
		numbers.push(5);
		
		System.out.println("Stack: "+numbers);
		
		System.out.println("Top Element is : "+numbers.peek());
		
		System.out.println("Stack is same after peeking an element : "+numbers);
		
		System.out.println("Poped element : "+numbers.pop());
		System.out.println("Poped element: "+numbers.pop());
		
		System.out.println("After poping elements "+numbers);
		
	}

}
