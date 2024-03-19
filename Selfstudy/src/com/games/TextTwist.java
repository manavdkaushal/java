package com.games;
/*
	In Text Twist, players try to score points by forming words using the letters 
	from a 6-letter scrambled word. 
	They win the round if they can successfully unscramble the 6-letter word.
	
	Create a function that takes in an array of already-guessed words, 
	the unscrambled 6-letter word and returns the total number of points 
	the player scored in a particular round using the following rubric:
	
	3-letter words are 1 pt
	4-letter words are 2 pts
	5-letter words are 3 pts
	6-letter words are 4 pts + 50 pt bonus (for unscrambling the word)
	Remember that invalid words (words that cannot be formed from 
	the 6-letter unscrambled words) count as 0 pts.
	
	Examples
	totalPoints(["cat", "create", "sat"], "caster") ➞ 2
	// Since "create" is an invalid word.
	
	totalPoints(["trance", "recant"], "recant") ➞ 108 ( this should be 216, as recant is anagram to trance, additional 54 point added in my soln )
	// Since "trance" and "recant" score 54 pts each.
	
	totalPoints(["dote", "dotes", "toes", "set", "dot", "dots", "sted"], "tossed") ➞ 13
	// Since 2 + 3 + 2 + 1 + 1 + 2 + 2 = 13
	Notes
	If a 6-letter word has multiple anagrams, count each 6-letter unscramble as an additional 54 pts. 
	For example, if the word is arches, and the player guessed arches and chaser, add 108 pts for both words.
	You can play Text Twist here: http://text-twist2.com
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.Assert;

public class TextTwist {

	@Test
	public void test1() {
		Assert.assertEquals(2, totalPoints(new String[]{"cat", "create", "sat"}, "caster"));
	}
	@Test
	public void test2() {
		Assert.assertEquals(108, totalPoints(new String[]{"trance", "recant"}, "recant"));
	}
	@Test
	public void test3() {
		Assert.assertEquals(13, totalPoints(new String[]{"dote", "dotes", "toes", "set", "dot", "dots", "sted"}, "tossed"));
	}
	
	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(TextTwist.class);
		
		for( Failure fail : result.getFailures())
			System.out.println(fail.toString());
		
		System.out.println(" TextTwist was successful ? : "+result.wasSuccessful());
		
		/*
		String src = "creater"; //"arches";
		String fnd = "cat"; //"chaser";		
		System.out.println(toFind(src,fnd));
		*/
	}

	public static int toFind(String txt, String word) 
	{		
		int r = 0;
		List lst = new ArrayList();
		for(char c : txt.toCharArray())
			lst.add(""+c);
		
		boolean found=false;
		for(char c : word.toCharArray()) {
			if(lst.contains(""+c)) {
				lst.remove(""+c);
				found = true;
			} else {
				found = false;
				break;
			}
		}
		r = found ? 
				(lst.size() == 0  &&  word.length() == 6 ? 2 : 1)  
				: 0;
		
		return r;
	}
	
	public static int totalPoints(String[] sa, String str) {
		int out = 0;
		int pos = 0;
		int len = 0;
		int res = 0;
		String tmp = str;
		boolean found = false;
		List<String> fwrds = new ArrayList<String>();
		
		
		for( String s : sa ) {
			res = toFind(str, s);
			
			if( res > 0 ) {
				if( res > 1 )
					out += 54;
				
				len = s.length();				
				out += len > 5  ?  (4+50) :
							len > 4  ?  3 :
								len > 3  ?  2 : 1;
			}	
		}
		
		return out;
	}
	
}
