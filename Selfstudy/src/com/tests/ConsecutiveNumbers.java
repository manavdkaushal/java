package com.tests;

import java.util.Arrays;
import java.util.Collections;

/*
 
	Create a function that determines whether elements in an array can be re-arranged 
	to form a consecutive list of numbers where each number appears exactly once.

	Examples
	cons([5, 1, 4, 3, 2]) ➞ true
	// Can be re-arranged to form [1, 2, 3, 4, 5]
	
	cons([5, 1, 4, 3, 2, 8]) ➞ false
	
	cons([5, 6, 7, 8, 9, 9]) ➞ false
	// 9 appears twice

*/

public class ConsecutiveNumbers {

	public static void main(String[] args) {
		cons(new int[] {5, 1, 4, 3, 2});
		cons(new int[] {5, 1, 4, 3, 2, 8});
		cons(new int[] {5, 6, 7, 8, 9, 9});
	}
	public static void cons(int[] inp) {
		Arrays.sort(inp);
		int prev = 0;
		boolean isCons = true;
		
		for(int i : inp) {
			if(prev == 0 ) {
				prev = i;
			} else {
				if(i-prev != 1) {
					isCons = false;
					break;
				} else 
					prev = i;
			}
		}
		System.out.println(isCons);
	}
}
