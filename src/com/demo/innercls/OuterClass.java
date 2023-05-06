package com.demo.innercls;

public class OuterClass {

	public void displayOuterMassage() {
		
		System.out.println("Display Outer Class.");
	}
	
	public class InnerClass{
		
		public void displayInnerMassage() {
			
			System.out.println("Display Inner Class.");
		}
	}
	
}
