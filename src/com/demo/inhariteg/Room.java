package com.demo.inhariteg;

public class Room {

	private float length;
	private float width;
	
	Room(float L,float W){
		length = L;
		width = W;
	}
	
	public void displayArea() {
		System.out.println("The Area is : " + length * width);
	}
}
