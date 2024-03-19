package com.tests;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class ReverseTheNumber {
/* 

	Given N,  reverse the digits of N.
	 
	
	Example 1:
	
	Input: 200
	Output: 2
	Explanation: By reversing the digts of 
	number, number will change into 2.

*/
	public static void main(String args[]) { // without using Reverse method
		Scanner sc = new Scanner (System.in);
		BigInteger out, c, e = new BigInteger("10"), bi = sc.nextBigInteger();
		long d; 
		c = bi;
		StringBuffer sb = new StringBuffer();
		
		while( c.longValue() > 0 ) {
			d = c.longValue() % 10;
			sb.append(d);
			c = c.divide(e);
		}
		out = new BigInteger(sb.toString());
		System.out.println(out);
	}
	
	public static void main1(String args[]) { // using reverse method
		Scanner sc = new Scanner (System.in);
		BigInteger out, bi = sc.nextBigInteger();
		
		StringBuilder sb = new StringBuilder(""+bi);
		out = new BigInteger(sb.reverse().toString());
		
		System.out.println(out);
	}
	
	
	public static void main0(String[] args)  // using basic for loop
	{		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		
		System.out.println("Enter N : ");
		Scanner sc = new Scanner(System.in);
		int sum = 0, c   = 0;
		int num = sc.nextInt();
		String s = ""+num;
		
		while(c < s.length()) {
			lst.add( Integer.parseInt(""+s.charAt(c++)));
		}
		
		
		
		for( int i = lst.size()-1; i>=0; i--) {
			sb.append(lst.get(i));
		}
		System.out.println(Integer.parseInt(sb.toString()));
		
		/*Collections.sort(lst, Collections.reverseOrder());
		System.out.println(lst);*/
	
	}
}
