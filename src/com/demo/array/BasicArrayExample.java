package com.demo.array;

public class BasicArrayExample {

	public static void main(String[] args) {
		
		// int salary[];
		
		int[] salary;
		
		salary = new int[5];
		
		salary[0] = 100;
		salary[1] = 200;
		salary[2] = 300;
		salary[3] = 400;
		salary[4] = 500;
		
		
		for(int index = 0; index < salary.length;index++) {
			System.out.println(salary[index]);
		}
		
	}

}
