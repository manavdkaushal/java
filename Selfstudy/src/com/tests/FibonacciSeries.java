package com.tests;

import java.util.Scanner;

/*
 
  Write a Java Program for the Fibonacci series.
  
  
  */

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number for Fibo series");
		int num1 = sc.nextInt();

		System.out.println("Enter second number for Fibo series");
		int num2 = sc.nextInt();

		System.out.println("Enter limit till series to be generated");
		int lmt = sc.nextInt();
		int sum = 0;
		
		StringBuffer sb = new StringBuffer();
		sb.append(num1 + ",");
		sb.append(num2 + ",");
		
		for( int i=0; i<= lmt; i++) {
			sum = num1 + num2;
			sb.append( sum + ",");
			num1 = num2;
			num2 = sum;
		}
		System.out.println("Fibo " + sb.toString());
	}

}
