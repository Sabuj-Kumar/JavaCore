package com.demo.inhariteg;

public class BedRoom extends Room {

	public int bedCount;
	
	BedRoom(float L, float W) {
		super(L, W);
	}
	
	public void bedCount() {
		System.out.println("Bed count is " + bedCount);
	}
}
