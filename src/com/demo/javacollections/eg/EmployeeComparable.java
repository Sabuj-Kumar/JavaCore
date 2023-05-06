package com.demo.javacollections.eg;

import java.util.Comparator;

public class EmployeeComparable implements Comparator<Employee>{

	@Override
	public int compare(Employee empOne, Employee empTwo) {
		
		return (empOne.empSalary<empTwo.empSalary ? -1
				: (empOne.empSalary==empTwo.empSalary ? 0 : 1));
	}
}
