package com.tests;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class FindDigitFromCubeOfTwoNumbers {
/* 
	Given two numbers A and B, find Kth digit from right of AB.
	
	Example 1:
	
	Input:
	A = 3
	B = 3
	K = 1
	Output:
	7
	Explanation:
	3 raise to 3 = 27 and 1st
	digit from right is 7

*/
	
	public static void main(String[] args) 
	{		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter A : ");
		int a = sc.nextInt();
		System.out.println("Enter B : ");
		int b = sc.nextInt();
		System.out.println("Enter K : ");
		int k = sc.nextInt();
		
		int sum = a, c = 0;
		
		while(c < (b-1)) {
			sum = sum * a;
			c++;
		}
		
		String s = ""+sum;
		System.out.println(s);
		System.out.println( s.charAt( s.length()-k ));
		
	}
}
