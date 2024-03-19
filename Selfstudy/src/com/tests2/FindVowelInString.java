package com.tests2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindVowelInString {
/*
 *  Write a Java program to check if a vowel is present in a string.
 * 
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String str  = sc.nextLine().toLowerCase();
		Pattern pat = Pattern.compile("a|e|i|o|u");
		Matcher mat = pat.matcher(str);
		
		System.out.println(mat.find());
		
		
	}
	
	
	public static void main0(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String str  = sc.nextLine().toLowerCase();
		
		boolean b = str.contains("a") ? true : 
						str.contains("e") ? true : 
							str.contains("i") ? true :
								str.contains("o") ? true :
									str.contains("u") ? true : false; 
		System.out.println(b);
	}

}
