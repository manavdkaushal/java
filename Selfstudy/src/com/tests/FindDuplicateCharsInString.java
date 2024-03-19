package com.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 
  Write a Java Program to find the duplicate characters in a string.
 
  
 */

public class FindDuplicateCharsInString {

	public static void main(String[] args) {
		System.out.println("Enter string to find duplicate chars.");
		
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		String[] sa = inp.split("");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(String s : sa ) {
			if( !s.equals(" "))
				hm.put(s, hm.containsKey(s) ?  (hm.get(s)+1) : 1);
		}
		for(Map.Entry<String, Integer> ent : hm.entrySet()) {
			if(ent.getValue() > 1)
				System.out.println(ent.getKey() + " : "+ ent.getValue());
		}

	}

}
