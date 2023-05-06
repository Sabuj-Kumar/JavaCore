package com.demo.innercls;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outerClass= new OuterClass();
		
		outerClass.displayOuterMassage();
		
		OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
		innerClass.displayInnerMassage();
	}

}
