package com.tests2;

/*
	Is the Input Factorial of an Integer?
	Create a function that checks if a given integer is exactly the factorial of an integer or not. true if it is, false otherwise.
	
	Examples
	isFactorial(2) ➞ true
	// 2 = 2 * 1 = 2!
	
	isFactorial(27) ➞ false
	
	isFactorial(24) ➞ true
	// 24 = 4 * 3 * 2 * 1 = 4!
	Notes
	No error handling is necessary. Inputs are all positive integers.
	Alternatively, you can solve this with a recursive approach.
*/

public class CheckInputWhetherFactorial {

	public static void main(String[] args) {
		System.out.println( isFactorial(2));
		System.out.println( isFactorial(24));

	}
	public static boolean isFactorial(int a) {
		return  multi(a, 1, 1) == a;
	}
	public static int multi(int a, int s, int f) {
		int g = s * f ;
		if( g < a )
			return multi(a, g, f+1);
		else if( g == a)
			return g;
		else
			return f;
	}

}
