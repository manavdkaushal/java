package com.maths;

import java.util.Scanner;

/*
 
 Write a Java Program to find whether a number is prime or not.
 
 
 * */

public class FindPrimeNum {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check if Prime : ");
		int inp = sc.nextInt();
		
		FindPrimeNum fpn = new FindPrimeNum();
		fpn.findPrimeNum(inp);
	}

	public void findPrimeNum(int num) {
		int hlf = num/2;
		int i = 2;
		boolean isPrime = true;
		
		while(i <= hlf  &&  isPrime) {
			if( num % i++ == 0 )
				isPrime = false;
		}
		System.out.println("Number "+num+ (isPrime ? " is " : " is NOT ")+ "Prime.");
		
	}
	
}
