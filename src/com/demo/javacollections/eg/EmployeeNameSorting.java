package com.demo.javacollections.eg;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeNameSorting {

	public static void main(String[] args) {
		
		ArrayList<String> lstOfEmployees = new ArrayList<String>();
		
		lstOfEmployees.add("Sivam");
		lstOfEmployees.add("Arun");
		lstOfEmployees.add("Rakesh");
		lstOfEmployees.add("Deep");
		lstOfEmployees.add("Soham");
		
		Collections.sort(lstOfEmployees);
		
		System.out.println("Display Employees in ascending order: " + lstOfEmployees);
	}

}
