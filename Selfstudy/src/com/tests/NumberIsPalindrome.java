package com.tests;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class NumberIsPalindrome {
/* 

	Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not.
	Note:A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.
	
	Example 1:
	
	Input:
	N=56
	Output:
	1
	Explanation:
	The digit sum of 56 is 5+6=11.
	Since, 11 is a palindrome number.Thus,
	answer is 1.
	
	99999999999994 = yes
*/
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BigInteger c, a = new BigInteger(sc.next());
		
		int b=0 ;
		c=a;
		
		while(c.longValue() > 0) {
			b += c.longValue() % 10;
			c = c.divide(new BigInteger("10"));
		}

		String s = ""+b;
		StringBuilder sb = new StringBuilder(s);

		System.out.println( s.equals( sb.reverse().toString()));
				
	}


	
	
	public static void main0(String[] args) 
	{		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		
		System.out.println("Enter N : ");
		Scanner sc = new Scanner(System.in);
		int sum =0, c   = 0;
		//int num = sc.nextInt();
		String s = sc.nextLine();
		
		while(c < s.length()) {
			sum += Integer.parseInt(""+s.charAt(c++));
		}
		s = ""+sum;
		c = 0;
		//System.out.println(sum);
		
		while( c < s.length())
			lst.add(Integer.parseInt(""+s.charAt(c++)));
		
		if( lst.size() > 1 ) {
			while(true) {
				c = lst.size()-1;
				if(lst.get(0)  !=  lst.get(c) ) {
					System.out.println("Is Pallindrome : No" );
					break;
				} else {
					lst.remove(c);
					lst.remove(0);
					
					if( lst.size() > 1  ) {
						continue;
					} else {
						System.out.println("Is Pallindrome : Yes" );
						break;
					}
				}
			}
		} else {
			System.out.println("Is Pallindrome : Yes" );
		}	
		
	}
	
}


