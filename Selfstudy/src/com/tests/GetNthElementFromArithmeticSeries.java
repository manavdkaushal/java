package com.tests;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class GetNthElementFromArithmeticSeries {
/* 
	Given the first 2 terms A1 and A2 of an Arithmetic Series.Find the Nth term of the series. 
	
	Example 1:
	
	Input:
	A1=2
	A2=3
	N=4
	Output:
	5
	Explanation:
	The series is 2,3,4,5,6....
	Thus,4th term is 5.
 
*/
	public static void main1(String args[]) {
		Scanner sc= new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int n  = sc.nextInt();
		
		int out = a1;
		
		
		for(int i=0; i<n-2; i++) {
			out = a2+(a2-a1);
			a1 = a2;
			a2 = out;
				
		}
		System.out.println(out);
	}
	
	
	public static void main(String[] args) 
	{		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		
		System.out.println("Enter A1 : ");
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		
		System.out.println("Enter A2 : ");
		int a2 = sc.nextInt();
		
		System.out.println("Enter Nth position you need : ");
		int nth = sc.nextInt();
		
		int c = 1;
		int diff = a2-a1;
		int nxt  = a2;
		lst.add(a1);
		lst.add(a2);
		
		while(c <= nth ) {
			nxt += diff;
			lst.add(nxt);
			c++;
		}
		
		System.out.println(lst.toString());
		System.out.println(lst.get(nth-1));
	}

}
