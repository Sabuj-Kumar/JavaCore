package com.demo.nestingmethod;

public class NestingMethodExample {
	
	public void displayMassage(String name) {
		System.out.println("Hello "+name);
		welcomeMassage(name);
	}
	public void welcomeMassage(String name) {
		System.out.println("Hello "+name + " This is nesting method. ");
	}
}
