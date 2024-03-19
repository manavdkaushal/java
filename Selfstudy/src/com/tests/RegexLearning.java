package com.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLearning {

	public static void main(String[] args) {
		// 1. Find out if there are any occurrences of the word "w3schools" in a sentence:
		Pattern pat = Pattern.compile("Mana",Pattern.CASE_INSENSITIVE);
		Matcher mat = pat.matcher("Java being learned by Manav today");
		System.out.println("1. "+ (mat.find() ? "Found" : "Not found") );
		
		// 2. Find only numbers
		pat = Pattern.compile("[0-9]");
		mat = pat.matcher("This is a big sent 0 1 2 345");
		System.out.println("2. "+ (mat.find()) );

		// 3. Find one character from the options between the brackets
		pat = Pattern.compile("[abc]");
		mat = pat.matcher("This is ig sent 0 1 2 345");
		System.out.println("3. "+mat.find());

		
		// 4. Find one character NOT between the brackets
		pat = Pattern.compile("[^abc]");
		mat = pat.matcher("abc def");
		System.out.println("4. "+mat.find());
		
		// Metacharacter - |
		// 5. Find a match for any one of the patterns separated by | as in: cat|dog|fish 
		pat = Pattern.compile("[cat|dog|fish]");
		mat = pat.matcher("xyzi");
		System.out.println("5. "+ mat.find());
		
		// Metacharacter - .
		// 6. Find just one instance of any character
		pat = Pattern.compile(".c");
		mat = pat.matcher("abcdefgh .ijk lmnoc");
		System.out.println("6. "+ mat.find());
		
		// Metacharacter - ^
		// 7. Finds a match as the beginning of a string as in: ^Hello
		pat = Pattern.compile("^cat");
		mat = pat.matcher("cat was sleeping on the bed.");
		System.out.println("7. "+ mat.find());
		
		// Metacharacter - $
		// 8. Finds a match at the end of the string as in: World$
		pat = Pattern.compile("dog$");
		mat = pat.matcher("cat was running away from dog");
		System.out.println("8. "+ mat.find());
		
		// Metacharacter - \d
		// 9. Find a digit
		pat = Pattern.compile("\\d");
		mat = pat.matcher("cat was running 419 away from dog");
		System.out.println("9. "+ mat.find());
		
		// 10. If the text contains only digits \d+
		System.out.println("10. "+"419".matches("\\d+")); // plus sign means any number of times
		
		
		// 11. Find a whitespace character \s
		pat = Pattern.compile("\\s");
		mat = pat.matcher("cat was running away from dog");
		System.out.println("11. "+ mat.find());
				
		// 12. Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
		pat = Pattern.compile("\\bHello",Pattern.CASE_INSENSITIVE);
		mat = pat.matcher("cat greeting hello to the dog");
		System.out.println("12. "+ mat.find());
		
		// 13. Find a match at the end of a word like this: WORD\b, or at the end of a word like this: WORD\b
		pat = Pattern.compile("e\\b",Pattern.CASE_INSENSITIVE);
		mat = pat.matcher("cat greeting hello to the dog");
		System.out.println("13. "+ mat.find());
		
		// 14. Check if String contains only alphabets, spaces, ' or . ( this is to validate emails / names )
		System.out.println("14. "+ "Welcome to Toutorialspoint.com d'souza".matches("^[a-zA-Z\\s.']*$") );
		
		// 15. Check if only numbers
		System.out.println("15. "+ "-12345.65".matches("^[0-9.-]*$") );
		
		// 16. Check if chars of String 1 is inside another String 2
		System.out.println("16. "+ "creater".matches("[cat].*") );
		
				
		
	}

}
