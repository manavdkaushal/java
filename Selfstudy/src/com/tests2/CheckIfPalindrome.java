package com.tests2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheckIfPalindrome {
/*
 *  How do you check whether a string is a palindrome in Java?
 *  Sofos
 * */
	
	public static void main(String args[]) { // using another for loop
		Scanner sc= new Scanner(System.in) ;
		String s = sc.nextLine();
		
		int len = s.length();
		int i   = 0; 
		boolean pal = true;
		
		while(i < len/2  &&  pal) {
			if( s.charAt(i) != s.charAt(len-(i+1)) ) 
				pal = false;
			i++;
		}
		System.out.println(pal);
	}
	
	public static void main1(String args[]) { // using StringBuilder reverse method
		Scanner sc= new Scanner(System.in) ;
		String s = sc.nextLine();
		StringBuilder r = new StringBuilder(s);
		
		System.out.println( s.equals(r.reverse().toString()));		
	}
	
	
	public static void main0(String[] args) { // using for loop
		Scanner sc   = new Scanner(System.in);
		String s0,s1 = sc.nextLine();
		int c = 0, len = s1.length()-1;
		boolean b = true;
		
		while( c < (int)s1.length()/2  && b ) {
			b = s1.charAt(c) == s1.charAt(len-c);
			c++;
		}
		
		System.out.println("String "+ s1 + ( b ? " is Palindrome" : " is not a Palindrome") );
	}

}
