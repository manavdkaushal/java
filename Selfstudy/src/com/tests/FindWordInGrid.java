package com.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
   1. The input is a grid of letters, and the output should be all the words that can be found in the grid.
   
   		char[][] grid = {{'a', 'b', 'c', 'd', 'e'},
                         {'f', 'g', 'h', 'i', 'j'},
                         {'k', 'l', 'm', 'n', 'o'},
                         {'p', 'q', 'r', 's', 't'},
                         {'u', 'v', 'w', 'x', 'y'}};
        String[] words = {"apple", "banana", "cherry"};
   
 */

import java.util.Scanner;

public class FindWordInGrid {

	public static void main(String[] args) {
		char[][] grid = {{'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'j'},
                {'k', 'l', 'm', 'n', 'o'},
                {'p', 'q', 'r', 's', 't'},
                {'u', 'v', 'w', 'x', 'y'}};
		String[] words = {"apple", "banana", "cherry"};
		ArrayList<String> output = new ArrayList<String>();
		
		HashMap<Character, Object> hm = new HashMap<Character, Object>();
		for(char[] ca : grid) {
			for(char c : ca )
				hm.put(c, null);
		}
		
		boolean toInclude = false;
		for( String s : words) {
			toInclude = true;
			for( char c : s.toCharArray()) {
				if( hm.containsKey(c)) {
					continue;
				}
				else {
					toInclude = false;
					break;
				}
			}
			if(toInclude) {
				output.add(s);
			}
		}
		if( output.size() > 0)
			System.out.println(output.toString());
		else
			System.out.println("None of the words are fully contained in grid.");
	}
	
	   
	
}
