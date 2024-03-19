package com.tests;

/* 
   1. Find a word in String
   
   2. The input is a string of words, and the output should be the first word that starts with a specific letter.
   
 */

import java.util.Scanner;

public class FindWordInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence");
		String sent = sc.nextLine();
		
		System.out.println("Enter the word to find");
		String tofind = sc.next();
		
		System.out.println("Enter the character to find first word it is contained in.");
		Character tofindC = sc.next().charAt(0);
		
		int pos = sent.indexOf(tofind);
		System.out.println("The word : "+tofind + " appears at - "+pos+" position in the above sentence.");
		
		/*    -- second question -- */
		String[] sa = sent.split(" ");
		for(String s : sa) {
			if( s.charAt(0) == tofindC )
			{
				System.out.println("The word : "+ s + " contains first occurence of character - "+ tofindC);
				break;
			}
				
		}
	}

}
