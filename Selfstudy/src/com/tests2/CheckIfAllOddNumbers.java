package com.tests2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheckIfAllOddNumbers {
/*
 *  How do you check if a list of integers contains only odd numbers in Java?
 * 
*/
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		Object[] ia = s.split(",");
		boolean allOdds = true;
		
		for(Object obj : ia) {
			if( Integer.parseInt(obj.toString()) % 2 == 0) {
				allOdds = false;
				break;
			}
		}
		System.out.println(allOdds);
	}

	
	public static void main0(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean b = false;
		int[] ia = {1,3,5,7,9,10};
		int i = 0;
		
		while( i <ia.length  &&  !b ) {
			b = (ia[i++] % 2) == 0;
		}
		System.out.println("List "+ Arrays.toString(ia) + ( b ? " does not contain odds" : " contains all odds") );
	}

}
