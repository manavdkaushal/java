package com.tests2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeriesUsingRecurssion {
/*
 *  Write a Java program to print a Fibonacci sequence using recursion.
 * 
 * */
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		String o = "" + a+ "," + b;
		
		System.out.println(genFibo(o, a, b, n));
	}
	
	public static String genFibo(String o, int a, int b, int n) {
		String out = "";
		
		if(o.split(",").length < n) {
			o = o + "," + (a+b) ;		
			return genFibo(o, b, (a+b), n);
		}
		else 
			return o;
	}
	
	public static void main0(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter max Fibo number : ");
		int max = sc.nextInt();
		int n1 = 1, n2 = 2;
		
		StringBuffer sb = new StringBuffer();
		sb.append(n1+","+n2);
		
		while( (n2+n1) <= max ) {
			sb.append(","+(n2+=n1));
			n1 = n2-n1;
		}
		System.out.println("Fibonacci series "+ sb.toString() );
	}
}
