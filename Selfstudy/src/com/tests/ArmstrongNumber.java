package com.tests;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class ArmstrongNumber {
/* 

	For a given 3 digit number, find whether it is armstrong number or not. 
	An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. 
	Return "Yes" if it is a armstrong number else return "No".
	
	NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371
	
	Example 1:
	
	Input: N = 153
	Output: "Yes"
	Explanation: 153 is an Armstrong number
	since (1*1*1) + (5*5*5) + (3*3*3) = 153.
	Hence answer is "Yes".
	

*/
	public static void main1(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean isArm = false;
		int d=0, c, b = a;
		
		while(b > 0) {
			c = b%10;
			d += c*c*c;
			
			b = b/10;
		}
		isArm = d == a;
		System.out.println(isArm);
	}
	
	
	public static void main(String[] args) 
	{		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		
		System.out.println("Enter N : ");
		Scanner sc = new Scanner(System.in);
		int c   = 0;
		int num = sc.nextInt();
		String s = ""+num;
		
		while(c < s.length())
			lst.add(Integer.parseInt(""+s.charAt(c++)));
		
		c=0;
		for( int i : lst) {
			c = c+ (i*i*i);
		}
		
		System.out.println(c);
		System.out.println( num == c ? "Yes" : "No");
	}
}
