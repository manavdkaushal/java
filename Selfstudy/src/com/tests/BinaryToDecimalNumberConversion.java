package com.tests;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class BinaryToDecimalNumberConversion {
/* 
		Given a Binary Number B, find its decimal equivalent.
		
		Example 1:
		Input: B = 10001000
		Output: 136
		
		Example 2:
		Input: B = 101100
		Output: 44

*/
	
	public static void main(String[] args) 
	{		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Binary Number : ");
		String s = sc.nextLine();
		int d = 0, c = 0;
		
		for( int i=s.length()-1; i>=0; i--) {
			d += Math.pow(2, c++) * Integer.parseInt(""+s.charAt(i));
		}	
		System.out.println("The decimal equivalent of "+s+" is : "+d);
	}
}
/*
	Solution
	--------
	
	Binary              1 0 1 1 0 0 
	*
	Unit position       5 4 3 2 1 0   ( starts from right with zero )
	raise to 
	Power of 2          2 2 2 2 2 2   
	step-1                        0   ( Eg : 2 raise to 0 = 0  multiply by Binary position number at unit postion 0 = 0 )                     
    step-2                      0     ( 2 rasie to unit position 1 multiply by Binary position at 1 = 0 )
    step-3                    4       ( 2 raise to unit position 2 multiply by Binary position at 2 = 4 )
    step-4                  8         ( 2 raise to unit position 3 multiply by Binary position at 3 = 8 )
    step-5                0           ( 2 raise to unit position 4 multiply by Binary position at 4 = 0 )
    step-6             32             ( 2 raise to unit position 5 multiply by Binary position at 5 = 32 )
    step-7             32 + 8 + 4 = 44   ( add numbers attained at each step to get decimal equivalent )
    
*/
