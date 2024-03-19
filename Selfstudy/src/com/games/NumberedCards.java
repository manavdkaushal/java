package com.games;

import java.util.Arrays;

/*-
	You have a pack of 5 randomly numbered cards, which can range from 0-9. 
	You can win if you can produce a higher two-digit number from your cards than your opponent. 
	Return true if your cards win that round.
	
	Examples
	winRound([2, 5, 2, 6, 9], [3, 7, 3, 1, 2]) ➞ true
	// Your cards can make the number 96
	// Your opponent can make the number 73
	// You win the round since 96 > 73
	
	winRound([2, 5, 2, 6, 9], [3, 7, 3, 1, 2]) ➞ true
	
	winRound([1, 2, 3, 4, 5], [9, 8, 7, 6, 5]) ➞ false
	
	winRound([4, 3, 4, 4, 5], [3, 2, 5, 4, 1]) ➞ false
	Notes
	Return false if you and your opponent reach the same maximum number (see example #4).
*/	
public class NumberedCards {

	public static void main(String[] args) {
		System.out.println( winRound(new int[] {2, 5, 2, 6, 9}, new int[] {3, 7, 3, 1, 2}) );
		System.out.println( winRound(new int[] {2, 5, 2, 6, 9}, new int[] {3, 7, 3, 1, 2}) );
		System.out.println( winRound(new int[] {1, 2, 3, 4, 5}, new int[] {9, 8, 7, 6, 5}) );
		System.out.println( winRound(new int[] {4, 3, 4, 4, 5}, new int[] {3, 2, 5, 4, 1}) );

	}
	public static boolean winRound(int[] a, int[] b) {
		boolean out = false;
		Arrays.sort(a);
		Arrays.sort(b);
		
		int anum = Integer.parseInt(""+ a[a.length-1] + a[a.length-2]);
		int bnum = Integer.parseInt(""+ b[b.length-1] + b[b.length-2]);
		
		out = anum > bnum ? true : ( anum == bnum ? false : false );
		
		return out;
	}

}
