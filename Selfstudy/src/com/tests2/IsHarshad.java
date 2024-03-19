package com.tests2;

public class IsHarshad {

/*
	A number is said to be Harshad if it's exactly divisible by the sum of its digits. Create a function that determines whether a number is a Harshad or not.

	Examples
	isHarshad(75) ➞ false
	// 7 + 5 = 12
	// 75 is not exactly divisible by 12
	 
	isHarshad(171) ➞ true
	// 1 + 7 + 1 = 9
	// 9 exactly divides 171
	 
	isHarshad(481) ➞ true

	isHarshad(89) ➞ false

	isHarshad(516) ➞ true

	isHarshad(200) ➞ true
*/
	
	public static void main(String[] args) {
		System.out.println(isHarshad(75));
		System.out.println(isHarshad(171));
		System.out.println(isHarshad(481));
		System.out.println(isHarshad(89));
		System.out.println(isHarshad(516));
		System.out.println(isHarshad(200));

	}
	public static boolean isHarshad(int a) {
		int b, c = a;
		int sum=0;
		
		while ( c > 0 ) {
			b = c%10;
			sum += b;
			c = c/10;
		}
		return a % sum == 0;
	}

}
