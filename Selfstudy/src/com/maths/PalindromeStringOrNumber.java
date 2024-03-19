package com.maths;

import java.math.BigInteger;
import java.util.Scanner;

/*
 
  Write a Java Program to find whether a string or number is palindrome or not.
 
 */

public class PalindromeStringOrNumber {

	public static void main(String[] args) {
		PalindromeStringOrNumber pal = new PalindromeStringOrNumber();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String / Number to check Palindrome ? ");
		String inp = sc.nextLine();
		
		try {
			Integer.parseInt(inp);
			BigInteger bi = new BigInteger(inp);
			
			pal.isStringPalindrome(inp);
		}catch(Exception e) {
			pal.isStringPalindrome(inp);
		}
		
		
		
	}

	public void isStringPalindrome(String s) {
		boolean isPalin = true;
		boolean isEvenLen = s.length() % 2 == 0;
		String lft =  isEvenLen ? s.substring(0, s.length()/2) : s.substring(0, (s.length()-1)/2);
		StringBuilder rgt =  new StringBuilder(  isEvenLen ? s.substring(s.length()/2) : s.substring( ((s.length()-1)/2)+1 ) );
		
		
		isPalin = lft.equals(rgt.reverse().toString());
		
		System.out.println("String "+ s +  (isPalin ? " is " : " is NOT ") + " a Palindrome String");
	}
	public void isNumberPalindrome(BigInteger bi) {
		boolean isPalin = true;
		System.out.println("Number "+ bi +  (isPalin ? " is " : " is NOT ") + " a Palindrome String");
	}
}
