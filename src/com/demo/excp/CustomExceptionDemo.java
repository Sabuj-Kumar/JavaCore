package com.demo.excp;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		
		int len = 20,width = -3;
		
		try {
			if(len < 0 || width < 0) {
				throw new NagetiveValue("length or width can not be nagetive.");
			}
		}catch(NagetiveValue e) {
			System.out.println("Error is " + e.getMessage());
		}

	}

}
