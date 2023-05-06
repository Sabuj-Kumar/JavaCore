package com.demo.excp;

public class MultipleExceptin {

	public static void main(String[] args) {
		
		int[] array = new int[3] ;
		
		 try{ 
			 array[0] = 20;
			 array[1] = 0;
			 array[2] = array[0]/array[1];
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("Error is " + e.getMessage());
		 }
		 catch(NumberFormatException e) {
			 System.out.println("Error is " + e.getMessage());
		 }catch(ArithmeticException e) { 
			 System.out.println("Error is " + e.getMessage());
		 }catch(Exception e) { 
			 System.out.println("Error is " + e.getMessage());
		 }
	}

}
