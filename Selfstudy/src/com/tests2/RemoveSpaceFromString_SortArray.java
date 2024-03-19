package com.tests2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveSpaceFromString_SortArray {
/*
 *  How do you remove leading and trailing spaces from a string in Java?
 *  How do you sort an array in Java?
 * */
	
	public static void main1(String args[]) {
		String inp = "   This is the String   ";
		String[] sa = {"efh","jkl","xyz","ghi","mno","rpq","abc"};
		
		System.out.println(inp.trim());
		Arrays.sort(sa);
		System.out.println(Arrays.toString(sa));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter text : ");
		String os, str  = sc.nextLine();
		os = str.trim();
		
		int[] ia = {9,5,2,7,8,1};
		Arrays.sort(ia);
		
		System.out.println("Trimmed string "+os );
		System.out.println(Arrays.toString(ia));
	}

}
