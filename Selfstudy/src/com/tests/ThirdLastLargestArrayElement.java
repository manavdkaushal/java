package com.tests;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

// Get the third last largest element from an array.

public class ThirdLastLargestArrayElement {

	public static void main(String[] args) {
		int arr [] = { 100,14, 46, 47, 94, 89, 94, 52, 86, 36, 94, 89,100,89 };
		
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		for(int a=0; a<arr.length; a++) 
			tm.put(arr[a], 0);
		
		
		System.out.println(tm);
		tm.remove(tm.lastKey());
		tm.remove(tm.lastKey());
		System.out.println(tm.lastKey());

		
		
		
	}
}
