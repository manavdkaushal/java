package com.tests;


import java. util. Scanner;
/*
 
 Write a Java Program to reverse a string without using String inbuilt function.
  
 * */

public class StringReverse {

	public static void main(String[] args) {
		String sample    = "Hello World";
		String sampleRvs = "dlroW olleH";
		
		String revStr = reverseString(sample);
		System.out.println(revStr.equals(sampleRvs) ? "Correct " : "Incorrect" );
		
		
		revStr = reverseString1(sample);
		System.out.println(revStr.equals(sampleRvs) ? "Correct " : "Incorrect" );
		
	}
	
	public void doThis() {
		AssertionExample ae = new AssertionExample();
	}
	
	
	public static String reverseString(String abc) {
		StringBuffer sb = new StringBuffer();
		if( abc != null ) {
			for(int i=abc.length()-1; i>=0; i--) {
				sb.append(abc.charAt(i));
			}
		}		
		return sb.toString();
	}
	
	public static String reverseString1(String abc) {
		StringBuilder sb = null;
		if( abc != null ) {
			sb = new StringBuilder(abc);
		}		
		return sb.reverse().toString();
	}

	
	class AssertionExample{
		public AssertionExample() {
			Scanner scanner = new Scanner( System.in );
			System. out. print("Enter ur age ");
			int value = scanner. nextInt();
			assert value>=18:" Not valid";
			System. out. println("value is "+value);	
		}
	}
		
}
