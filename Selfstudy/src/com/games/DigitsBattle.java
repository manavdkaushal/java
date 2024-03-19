package com.games;

import java.math.BigInteger;

/*
	Starting from the left side of an integer, adjacent digits pair up in "battle" and the larger digit wins. 
	If two digits are the same, they both lose. A lone digit automatically wins.
	
	Create a function that returns the victorious digits.
	
	To illustrate:
	
	battleOutcome(578921445) ➞ 7925
	// [57]: 7 wins; [89] 9 wins; [21] 2 wins;
	// [44] neither wins; 5 (automatically) wins
	Examples
	battleOutcome(32531) ➞ 351
	// 3 deffeats 2, 5 defeats 3, 1 is a single.
	
	battleOutcome(111) ➞ 1
	// 1 and 1 tie, so neither move on, last 1 is a single.
	
	battleOutcome(78925) ➞ 895
	Notes
	There are no winners in a battle with equal digits (neither should be printed).
	If the length of the number is odd, the lone digit should be printed at the end of the number.
*/
public class DigitsBattle {

	public static void main(String[] args) {
		DigitsBattle db = new DigitsBattle();
		System.out.println( db.battleOutcome(578921445) ); // 7925
		System.out.println( db.battleOutcome(32531));      // 351
		System.out.println( db.battleOutcome(111));        // 1
		System.out.println( db.battleOutcome(78925));      // 895
	}
	public  int battleOutcome(int inp) {
		String out = "";
		String s = ""+inp;
		int a, b;
		
		for(int i=0; i<s.length(); i++) {
			if( i+1 < s.length() ) {
				a = Integer.parseInt(""+s.charAt(i));
				b = Integer.parseInt(""+s.charAt(i+1));
				out += a  >  b ?
						 s.charAt(i) : (a==b ? "" : s.charAt(i+1));
			} else
				out += s.charAt(i);
			
			i++;
		}
		
		return Integer.parseInt(out);
	}
}
