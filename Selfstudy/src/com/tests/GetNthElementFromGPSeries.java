package com.tests;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class GetNthElementFromGPSeries {
/* 
	Given the A and R i,e first term and common ratio of a GP series. Find the Nth term of the series.
	
	Note: As the answer can be rather large print its modulo 1000000007 (109 + 7).
	
	Example 1:
	
	Input: A = 2, R = 2, N = 4
	Output: 16
	Explanation: The GP series is 
	2, 4, 8, 16, 32,... in which 16 
	is th 4th term.

	Example 2:
	
	Input: A = 4, R = 3, N = 3
	Output: 36
	Explanation: The GP series is
	4, 12, 36, 108,.. in which 36 is
	the 3rd term.
 
*/
	public static void main1(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		int out = 0;
		
		for(int i=0; i<n; i++) {
			out = a * r;
			a = out;
			
			if( i+2 == n)
				break;
		}
		
		System.out.println(out);
	
	}

	
	public static void main(String[] args) 
	{		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		
		System.out.println("Enter A : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("Enter R : ");
		int r = sc.nextInt();
		
		System.out.println("Enter Nth position you need : ");
		int nth = sc.nextInt();
		
		int c   = 1;
		int nxt = a;
		lst.add(a);
		
		while(c <= nth ) {
			nxt = nxt * r;
			lst.add(nxt);
			c++;
		}
		
		System.out.println(lst.toString());
		System.out.println(lst.get(nth-1));
	}
}
