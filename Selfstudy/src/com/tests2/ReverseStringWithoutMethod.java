package com.tests2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseStringWithoutMethod {
/*
 *  How do you reverse a string in Java?
 * 
 * */
	
	public static void main(String[] args) { // Reverse using String concatenation
		Scanner sc = new Scanner(System.in);
		String s1  = sc.nextLine();
		String out = "";
		
		for(char c: s1.toCharArray())
			out = c + out;
		System.out.println(out);
	}
	public static void main2(String[] args) { // Reverse using StringBuilder
		Scanner sc = new Scanner(System.in);
		String s1  = sc.nextLine();
		StringBuilder sbr = new StringBuilder();
	
		for(char c: s1.toCharArray())
			sbr.insert(0, c);
		
		System.out.println(sbr.toString());
	}
	public static void main0(String[] args) { // Reverse using loop of List
		Scanner sc = new Scanner(System.in);
		String s1  = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		List<Character> lst = new ArrayList<Character>();
		
		for(char c : s1.toCharArray())
			lst.add(0, c);
		
		for(char c : lst)
			sb.append(c);
		
		System.out.println(sb.toString());
	}

}
