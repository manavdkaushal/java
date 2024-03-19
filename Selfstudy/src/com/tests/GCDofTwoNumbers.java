package com.tests;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class GCDofTwoNumbers {
/* 
	Given two positive integers A and B, find GCD of A and B.
	
	
	Example 1:
	
	Input: A = 3, B = 6
	Output: 3
	Explanation: GCD of 3 and 6 is 3
*/
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num : ");
		int a = sc.nextInt();
		
		System.out.println("Enter second num : ");
		int b = sc.nextInt();
		
		int ans = 0, c = 2;
		
		while( c <= a  &&  c <= b) {
			if( (a % c == 0)  &&  (b % c) == 0 )
				ans = c;
			c++;
		}
		
		System.out.println("The GCD of "+ a +" and "+ b + " is "+ ans);
	}
	
}
