package com.demo.method;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {

		double fahrenheit;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter temperature in fahrenheit :  "); 
		fahrenheit = sc.nextDouble();
		sc.close();
		
		double celsius = getCelsiusFromFahrenheit(fahrenheit);
		
		System.out.println(fahrenheit + " Degree Fahrenheit = " + celsius + " Degree Calsius.");
		
	}

	public static double getCelsiusFromFahrenheit(double temperature) {
		
		return (temperature - 32 ) * 5 / 9;
	}
}
