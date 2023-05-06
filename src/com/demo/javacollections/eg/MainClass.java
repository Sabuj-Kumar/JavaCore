package com.demo.javacollections.eg;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Employee> lstOfEmployees = new ArrayList<Employee>();
		
		Employee emp1 = new Employee();
		emp1.empName = "Sivam";
		emp1.empSalary = 1000.00f;

		lstOfEmployees.add(emp1);

		Employee emp2 = new Employee();
		emp2.empName = "Arun";
		emp2.empSalary = 5000.00f;
		
		lstOfEmployees.add(emp2);

		Employee emp3 = new Employee();
		emp3.empName = "Rakesh";
		emp3.empSalary = 2000.00f;

		lstOfEmployees.add(emp3);

		Employee emp4 = new Employee();
		emp4.empName = "Deep";
		emp4.empSalary = 1500.00f;
		
		lstOfEmployees.add(emp4);
	
		Employee emp5 = new Employee();
		emp5.empName = "Soham";
		emp5.empSalary = 4000.00f;

		lstOfEmployees.add(emp5);
		
		Collections.sort(lstOfEmployees, new EmployeeComparable());
		
		System.out.println(lstOfEmployees.toString());
	}
}
