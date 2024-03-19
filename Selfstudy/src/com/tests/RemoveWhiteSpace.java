package com.tests;

/*
  
 Write a Java Program to remove all white spaces from a string with using replace().
 Write a Java Program to remove all white spaces from a string without using replace()

*/
public class RemoveWhiteSpace {
	public static void main(String args[]) {
		String s = " This is the String to remove white   spaces .";
		
		System.out.println(s.replaceAll(" ", ""));
		
		System.out.println("----------------------------");
		StringBuffer sb = new StringBuffer();
		char[] ca = s.toCharArray();
		
		
		for(Character c : ca) {
			if(c != ' ')
				sb.append(c);
		}
		System.out.println(sb.toString());
	}
}
