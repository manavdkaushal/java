package com.tests;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class JumpingNumberFind {
/* 
	Given a positive number X. Find the largest Jumping Number which is smaller than or equal to X. 
	Jumping Number: A number is called Jumping Number if all adjacent digits in it differ by only 1. 
	All single-digit numbers are considered as Jumping Numbers. For example 7, 8987 and 4343456 are Jumping numbers but 796, 677 and 89098 are not.
	
	Example 1:
	
	Input:
	X = 10
	Output:
	10
	Explanation:
	10 is the largest Jumping Number
	possible for X = 10.
	Example 2:
	
	Input:
	X = 50
	Output:
	45
	Explanation:
	45 is the largest Jumping Number
	possible for X = 50.

*/
	
	public static void main1(String args[]) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int dedn = 0, i = inp-1, out=0;
		
		i = inp-1;
		ArrayList<Integer> ai;
		// 499
		for( int k=inp; k>0; k--) {
			i = k;
			dedn = 0;
			
			ai = new ArrayList<Integer>();
			while(i > 0) {
				ai.add (i%10);
				i = i/10;
				
			}

			System.out.println(ai.toString());
			for( Integer in : ai) {
				dedn = dedn == 0 ? in : dedn-in;
			}
			if( dedn == 1) {
				out = k;
				break;
			}
		}
		System.out.println(out);
	}

	
	public static void main(String[] args) 
	{		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Number : ");
		int ans = 0, num = sc.nextInt();
		int c = num;
		
		if( num > 9) {
			while( --c >=0  &&  ans == 0) {
				if( isJumping(c) )
					ans = c;
			}
			
			if( ans > 0 )
				System.out.println("The largest jumping no, which is less than "+num+" is : "+ans);
			else
				System.out.println("The largest jumping no, which is less than "+num+" is : "+num);
			
		} else {
			System.out.println("No jumping no. possible for single digit number : "+num);
		}
		
			
	}
	
	public static boolean isJumping(int n) {
		String s = ""+n;
		
		if( n > 9 ) {
			for( int i=0; i+1 < s.length(); i++) {
				if( Integer.parseInt(""+s.charAt(i+1)) - Integer.parseInt(""+ s.charAt(i)) > 1)
					return false;				
			}
			return true;
		}
		return false;
	}

}
