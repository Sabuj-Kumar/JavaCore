package com.demo.print;

public class DataTypeAndVariableDemo {

	public static final String CONSTANT_VARIABLE = "DB";
	public static void main(String[] args) {
		// ******** Start Declaring Data Type *******
		
		byte byteNumber;
		short shortNumber;
		int intNumber;
		long longNumber;
		
		// Declaring Floating Types.
		float floatNumber;
		double doubleNumber;
		
		// Declaring Character Types.
		char charAlpabet;
		
		//Declaring Boolean Types.
		boolean booleanType;
		
		//  Start Initialization
		
		byteNumber = 120; //129 compilation error range -128 to 127
		shortNumber = 30000;// -32768 to 32767
		intNumber = 2147483641;
		longNumber = 9223372036854775800L;
		charAlpabet = 'A';
		booleanType = true;
		floatNumber = 9.87654f;
		doubleNumber = 9.1234567890d;
		
		//Display Values
		System.out.println(byteNumber);
		System.out.println(shortNumber);
		System.out.println(intNumber);
		System.out.println(longNumber);
		System.out.println(charAlpabet);
		System.out.println(booleanType);
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		System.out.println(CONSTANT_VARIABLE);
		// ******** End Declaring Data Type *******
	}

}
