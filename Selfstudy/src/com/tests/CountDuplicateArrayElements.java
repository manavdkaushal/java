package com.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountDuplicateArrayElements {

/*
   Given an array of integers, count the number of times each element has occurred in it. 
  	
 */
	
	public static void main(String[] args) {
		
		int[] ia =  {1,2,2,2,3,4,4,5,6,6,7,7,7,7};
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for(int i=0; i<ia.length; i++) {
			if( m.containsKey(ia[i])) {
				m.put(ia[i], (m.get(ia[i])+1) );
			}
			else {	
				m.put(ia[i], 1 );
			}
		}
		
		System.out.println("Original value : 1,2,2,2,3,4,4,5,6,6,7,7,7,7");
		
		for (Entry<Integer, Integer> entry : m.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		
		for(Map.Entry<Integer, Integer> ent : m.entrySet()) {
			System.out.println("Element : " + ent.getKey() + " Cnt : "+ent.getValue());
		}
		
		//System.out.println(m.keySet());
		//System.out.println(m.values());
		

	}

}
