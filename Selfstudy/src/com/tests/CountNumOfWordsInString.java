package com.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*
 Write a Java Program to count the number of words in a string.
 
 Write a Java Program to count the number of words in a string using HashMap.
 
 
 * */

public class CountNumOfWordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		CountNumOfWordsInString cntStr = new CountNumOfWordsInString();
		cntStr.cntWords(input);
		cntStr.cntWordsWithHashMap(input);
		
	}

	public void cntWords(String inp) {
		String[] sa = inp.split(" ");
		System.out.println("Number of words in the String \n "+inp + " \n is : "+sa.length);
	}
	
	public void cntWordsWithHashMap(String inp) {
		String[] sa = inp.split(" ");
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		
		for( String s : sa) {
			if(hm.containsKey(s))
				hm.put(s, hm.get(s)+1);
			else
				hm.put(s, 1);
		}
		for( Map.Entry<String,Integer> ent : hm.entrySet()) {
			System.out.println(ent.getKey() + " : " + ent.getValue());
		}
	}
}
