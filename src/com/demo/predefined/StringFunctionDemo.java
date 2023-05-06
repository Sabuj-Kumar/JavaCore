package com.demo.predefined;

public class StringFunctionDemo {

	public static void main(String[] args) {
		
		String name = "sabuj kuamr";
		
		//return character value of specific index;
		//System.out.print(name.charAt(6));
		
		//Concatenation two string 
		//System.out.print(name.concat(" tarofdar"));
		
		//compare string
		//System.out.print(name.equals("sabuj"));
		
		//compare string ignore case
		//System.out.print(name.equalsIgnoreCase("sabuj Kuamr"));
		
		//check empty string
		//System.out.print(name.isEmpty());
		
		//string length
		//System.out.print(name.length());
		
		//replace
		//System.out.print(name.replace("s","t"));
		
		//sub string
		//System.out.print(name.substring(4,8));
		
		// string upper case 
		//System.out.print(name.toUpperCase());
		
		// string lower case 
		//System.out.print(name.toLowerCase());
		
		// string delete space from begging and end using trim
		// System.out.print(name.trim());
		
		// string prefix
		//System.out.print(name.startsWith("sabuj"));
		
		// int and float value convert to string
		
		int a = 3;
		float b = 3.3f;
		
		String s = String.valueOf(a);
		String ss = String.valueOf(b);
	}

}
