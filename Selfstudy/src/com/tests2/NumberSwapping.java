package com.tests2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSwapping {
/*
 *  How do you swap two numbers without using a third variable in Java?
 * 
 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num 1 : ");
		int i1  = sc.nextInt();
		System.out.println("Enter num 2 : ");
		int i2  = sc.nextInt();
		
		i1 = i1 + i2;
		i2 = i1 - i2;
		i1 = i1 - i2;
		
		System.out.println(" Post swapping "+i1 + " : " + i2);
	}
	
	
	public static void main0(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num 1 : ");
		int i1  = sc.nextInt();
		System.out.println("Enter num 2 : ");
		int i2  = sc.nextInt();
		
		
		i1 = i1+i2;
		i2 = i1-i2;
		i1 = i1-i2;
		System.out.println(i1+"<>"+i2);
	}

}
