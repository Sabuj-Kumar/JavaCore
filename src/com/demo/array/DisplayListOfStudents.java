package com.demo.array;

public class DisplayListOfStudents {

	public static void main(String[] args) {
		
		
		/*
		 * String students[];
		 * students = new String[5];
		 * students[0] = "Sabuj"; students[1] = "Kumar"; students[2] = "Tarofdar";
		 * students[3] = "Tutol"; students[4] = "Dada";
		 */
		
		String students[] = {"Sabuj","Kumar","Tarofdar","Totul","Dada"};
		
		for(int index = 0; index < students.length;index++) {
			System.out.println(students[index]);
		}
		
		students[3]= "Sourav";

		for(int index = 0; index < students.length;index++) {
			System.out.println(students[index]);
		}
	}

}
