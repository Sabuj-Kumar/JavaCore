package com.demo.clsobj;

public class RactangleFg {
	
	int length,width;
	
	RactangleFg(int len,int wid){
		
		length = len;
		width = wid;
	}
	public void displayAre() {
		int area = length * width;
		
		System.out.println("area = "+area);
	}
	
}
