package com.tests2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Venkata {

	public static void main(String[] args) {
		String v = "Java is AwesomeJ!";		
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		
		for(Character c : v.toCharArray() ) {
			if(lhm.containsKey(c))
				lhm.put(c, lhm.get(c)+1);
			else
				lhm.put(c, 1);
		}
		int cnt = 0;
		for(Map.Entry<Character, Integer> ent : lhm.entrySet()) {
			if(ent.getValue() == 1) {
				System.out.println("First Non repeating Char is : "+ent.getKey());
				break;
			}
			System.out.println(cnt++);
		}
		
		
		/*
		String c="";
		boolean f=false, s=false;
		
		for(int i=0; i<v.length() && s == false; i++) {
		 	 c = ""+v.charAt(i);
		 	
		 	 f=false;
		 	 
		 	for(int j=i+1; j<v.length()  && f==false; j++) {
		 		f = (""+v.charAt(j)).equals(c);
		 	}
		 	
		 	if( f == false) {
		 		System.out.println("Char is "+c);
		 		f = true;
		 		s = true;
		 	}
		 		
		}
		*/
	}

}
