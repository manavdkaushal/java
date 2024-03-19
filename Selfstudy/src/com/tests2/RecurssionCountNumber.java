package com.tests2;

/*
		Create a function that recursively counts the integer's number of digits.
		Examples
		count(318) ➞ 3
		 
		count(-92563) ➞ 5
		 
		count(4666) ➞ 4
		
		count(-314890) ➞ 6
		
		count(654321) ➞ 6
		
		count(638476) ➞ 6
		
		Notes
		You are expected to solve this challenge via recursion.
*/
public class RecurssionCountNumber {	
	
	public static void main(String[] args) {
		System.out.println("318 : "+ count(318));
		System.out.println("-92563 : "+count(-92563));
		System.out.println("4666 : "+count(4666));
		System.out.println("-314890 : "+count(-314890));
		System.out.println("654321 : "+count(654321));
		System.out.println("638476 : "+count(638476));
	}
	public static int count(int num) {
		int m = num < 1 ? num * -1 : num;
		m = m / 10;
		
		if( m > 0 )
			return count(m)+1;
		else
			return 1;
	}

}
