package com.tests;


import java. util. Scanner;
/*
 
 Write a Java Program to swap two numbers using the third variable.
 
 Write a Java Program to swap two numbers WITHOUT using the third variable.
 
  
 * */

public class NumberSwap{
	public static void main(String args[]) {
		int a = 4;
		int b = 6;
		
		NumberSwap ns = new NumberSwap();
		ns.swapNumWithThirdVar(a, b);
		ns.swapNumWithOutThirdVar(a, b);
		
	}
	
	public void swapNumWithThirdVar(int x, int y) {

		int c = y;
		y = x;
		x = c;
		
		System.out.println(x +"<>" +y);
		
	}
	public void swapNumWithOutThirdVar(int x, int y) {

		y = x+y;
		x = y-x;
		y = y-x;
		
		System.out.println(x +"<>" +y);
		
	}
}