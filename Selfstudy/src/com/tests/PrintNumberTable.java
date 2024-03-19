package com.tests;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class PrintNumberTable {
/* 
	Create the multiplication table of a given number N and return the table as an array.
	
	Example 1:
	
	Input:
	N = 9
	
	Output:
	9 18 27 36 45 54 63 72 81 90
	
	Explanation:
	The table of 9 is the output whose 1st 
	term is 9 and the 10th term is 90.
 
*/
	
	public static void main1(String args[]) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int[] out = new int[10];
		
		for(int i=1; i<=10; i++) {
			out[i-1] = inp*i;
		}
		System.out.println(Arrays.toString(out));
	}
	
	public static void main(String[] args) 
	{		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int c = 1;
		
		while(c <= 10 ) {
			lst.add(num * c);
			c++;
		}
		
		System.out.println(lst.toString());
	}
}
