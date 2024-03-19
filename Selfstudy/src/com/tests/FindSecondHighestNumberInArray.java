package com.tests;

/*
 * 
 * Write a Java Program to find the second-highest number in an array.
 * 
 */

public class FindSecondHighestNumberInArray {

	public static void main(String[] args) {
		int[] ia = new int[] {1,14,7,8,10,25};
		int high = 0;
		int shigh = 0;
		
		for(int i : ia) {
			if( i > high ) {
				shigh = high;
				high  = i;
			} else if( i > shigh)
				shigh  =  i;
			
		}
		
		System.out.println("Second highest number is : "+ shigh);
	}

}

