package com.tests;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class FindHighestNumberDivisible {
/* 
	Given non-zero two integers N and M. 
	The problem is to find the number closest to N and divisible by M. 
	If there are more than one such number, then output the one having maximum absolute value.
	
	Example 1:
	
	Input:
	N = 13 , M = 4
	Output:
	12
	Explanation:
	12 is the Closest Number to
	13 which is divisible by 4. 

*/
	public static void main1(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int old, out = 0;
		int i = 1;
		
		while(true) {
			old = b*i++;
			if( old > a )
				break;
			else
				out = old;
		}
		System.out.println(out);
	}
	
	
	public static void main(String[] args) 
	{		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		
		System.out.println("Enter N : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("Enter M : ");
		int r = sc.nextInt();
		
		int c   = 2;
		int nxt = r;
		lst.add(nxt);
		
		while((a-nxt) > r) {
			nxt = r * c;
			lst.add(nxt);
			c++;
		}
		
		System.out.println(lst.toString());
		System.out.println(lst.get(lst.size()-1));
	}
}
