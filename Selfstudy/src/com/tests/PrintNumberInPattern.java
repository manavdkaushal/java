package com.tests;

/*

	Given a input number, print all values lesser to number till 1.
	sample input 3:
	expected 
	3 3 3 2 2 2 1 1 1
	3 3 2 2 1 1
	3 2 1

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class PrintNumberInPattern {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		/*
2 2 1 1
2 1
		 * */
		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		int c = num;
		
		while( c > 0 ) {
			lst.add(c);
			c--;
		}
		for( int r : lst) {
			for( int v : lst) {
				c=0;
				while(c < r ) {
					sb.append(v+" ");
					c++;	
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
