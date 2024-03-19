package com.tests;

/*
 
Create a function that will test if a string is a valid PIN or not via a regular expression.

A valid PIN has:

Exactly 4 or 6 characters.
Only numeric characters (0-9).
No whitespace.

Examples : 
validate("121317")  true
validate("1234")    true
validate("45135")   false
validate("89abc1")  false

*/

public class ValidateOTP {

	public static void main(String[] args) {
		validate("121317");  
		validate("1234"); 
		validate("45135");
		validate("89abc1");

	}
	public static void validate(String inp) {
		System.out.println( inp.matches("\\d\\d\\d\\d|\\d\\d\\d\\d\\d\\d") );

	}
}
