package com.tests;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class GetUniqueElementsFromTwoArrays {
/* 
	Implement the uniqueNames method. When passed two arrays of names, 
	it will return an array containing the names that appear in either or both arrays. 
	The returned array should have no duplicates.
	
	For example, calling MergeNames.uniqueNames(new String[]{'Ava', 'Emma', 'Olivia'}, new String[]{'Olivia', 'Sophia', 'Emma'}) 
	should return an array containing Ava, Emma, Olivia, and Sophia in any order.
*/
	
	public static void main(String[] args) 
	{
		String[] s1 = new String[]{"Ava", "Emma", "Olivia"};
		String[] s2 = new String[]{"Olivia", "Sophia", "Emma"};
		
		Set<String> set1 = new TreeSet<String>();
		
		for( String s : s1)
			set1.add(s);
		
		for( String s : s2)
			set1.add(s);
		
		System.out.println("1. The unique names are as below : " + set1.toString());
		
		
		
		/*  The return type should be array  */
		ArrayList output = new ArrayList();
		
		for( String s : s1 ) {
			if( !output.contains(s) )
				output.add(s);
		}
		for( String s : s2 ) {
			if( !output.contains(s) )
				output.add(s);
		}
		System.out.println("2. The unique names are as below : " + Arrays.toString(output.toArray()));
		
		
	}
	
}
