package com.tests;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 
 Write a Java Program to iterate HashMap using While and advance for loop.
 
 
 * */

public class IterateHashMapUsingWhileAndForLoop {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("ABC", 1);
		hm.put("DEF", 2);
		hm.put("GHI", 3);
		hm.put("JKL", 4);
		hm.put("MNO", 5);
		
		Iterator itr = hm.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry ent = (Entry) itr.next();
			System.out.println(ent.getKey() + " : "+ ent.getValue());
		}
		System.out.println("------------------------------------");
		
		Set<String> s = hm.keySet();
		for( Object sv : s.toArray()) {
			System.out.println(sv +" : "+ hm.get(sv));
		}
		
		System.out.println("------------------------------------");
		
		for( Map.Entry ent : hm.entrySet()) {
			System.out.println(ent.getKey() +" : "+ ent.getValue());
		}
		
		
	}

}
