package com.tests;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class StringToIntArray {
/* 
   Convert String to int[], also print sum of all elements
*/
	
	public static void main(String[] args) 
	{		
		String s = "123456789";
		ArrayList<Integer> ai = new ArrayList<Integer>();
		int sum =0;
		
		for( char c : s.toCharArray()) {
			ai.add(Character.getNumericValue(c));
			sum += Character.getNumericValue(c);
		}
		System.out.println(ai);
		System.out.println(sum);
	}
	
}
