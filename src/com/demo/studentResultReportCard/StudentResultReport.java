package com.demo.studentResultReportCard;

import java.util.Scanner;

public class StudentResultReport {

	private static final String FULL_MARK = "out of 100";
	private static final String TOTAL_MARK = "out of 500";
	private static final String OUTSTANDING = "Otstanding";
	private static final String EXCELLENT = "Excellant";
	private static final String VERY_GOOD = "Very Good";
	private static final String GOOD = "Good";
	private static final String AVERAGE = "Average";
	private static final String FAIL = "Fail";

	public static void main(String[] args) {

		int mathMark, phyMark, chamMark, engMark, comMark, totalMark;

		float percentageMark;

		String grade = "";

		Scanner sc = new Scanner(System.in);

		String firstName, lastName, fullName;

		System.out.println("Enter Student's First Name :  ");

		firstName = sc.nextLine();

		System.out.println("Enter Student's Last Name :  ");

		lastName = sc.nextLine();

		fullName = nameFormat(firstName) + " " + nameFormat(lastName);

		mathMark = getValidMarks("Math",sc);

		phyMark = getValidMarks("Physics",sc);

		chamMark = getValidMarks("Chemistry",sc);

		engMark = getValidMarks("English",sc);

		comMark = getValidMarks("Computer",sc);

		sc.close();
		
		totalMark = mathMark + phyMark + chamMark + engMark + comMark;

		percentageMark = percentageCalculation(totalMark);

		grade = getGrade(percentageMark);

		System.out.println("**** Better Hands-On Experience Club ****");
		System.out.println("Student Name: " + fullName);
		System.out.println("**** Subject Wise Marks Details ****");
		System.out.println("-----------------------------------------------------");

		System.out.println("Math : " + mathMark + " " + FULL_MARK);
		System.out.println("Physics : " + phyMark + " " + FULL_MARK);
		System.out.println("Chemistry : " + chamMark + " " + FULL_MARK);
		System.out.println("English : " + engMark + " " + FULL_MARK);
		System.out.println("Computer : " + comMark + " " + FULL_MARK);

		System.out.println("-----------------------------------------------------");

		System.out.println("Total = " + totalMark + " " + TOTAL_MARK);
		System.out.println("Percentage = " + percentageMark + "%");
		System.out.println("Grade: : " + grade);
	}

	public static String nameFormat(String name) {

		if (name != null) {
			name = name.trim();

			name = name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());

			return name;
		}

		return "";
	}

	public static int getValidMarks(String sub,Scanner sc) {
		
		int mark = 0;
		
		
		System.out.println("Enter mark of " + sub + ": ");
		
		mark = sc.nextInt();
		
		
		if (!checkValidNumber(mark)) {
			
			System.out.println("Please try again with proper mark between 0 to 100 range");
			
			return getValidMarks(sub,sc);
			
		} else {
			return mark;
		}
	}

	public static boolean checkValidNumber(int mark) {

		if (mark >= 0 && mark <= 100) {

			return true;
		}

		return false;
	}

	public static float percentageCalculation(int totalMark) {

		float percentage = (float)totalMark / 500;

		return percentage * 100;
	}

	public static String getGrade(float percentageMark) {

		int percentage = (int) percentageMark;

		String grade = switch (percentage / 10) {
		case 10:
		case 9:
			yield OUTSTANDING;
		case 8:
			yield EXCELLENT;
		case 7:
			yield VERY_GOOD;
		case 6:
			yield GOOD;
		case 5:
		case 4:
			yield AVERAGE;
		default:
			yield FAIL;
		};

		return grade;
	}

}
