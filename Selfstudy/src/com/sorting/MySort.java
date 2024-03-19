package com.sorting;

import java.util.*;

public class MySort {
	public static ArrayList<Integer> ia = new ArrayList<Integer>(); 
	public static ArrayList<Integer> na = new ArrayList<Integer>(); 

	public static void main(String[] args) throws Exception 
	{
		/*  4, 2, 1, 8, 3  */
		System.out.println("------ Welcome to Manav's Sort method ------");
		
		Integer a, b, swps=0;
		int remAt    = -1;
		String input = null;
		System.out.println("\n Enter the unsorted integers comma seperated then press ENTER \n Example : 4, 2, 1, 8, 3 \n");
		Scanner sc   = new Scanner(System.in);
		input = sc.next();
		
		sc = null;		
		String[] sa = input != null ? input.split(",") : null;  
		if( sa != null ) {
			for( String s : sa)
				ia.add(Integer.parseInt(s.trim()));		
					
	
			while( ia.size() > 0 ) {
				a = ia.get(0);
				remAt = 0;
				
				for( int i=1; i<ia.size(); i++) {
					b = ia.get(i);
					if( b < a ) {
						a = b;
						remAt = i;						
					}				
				}
				
				swps = a != ia.get(0) ? swps+1 : swps;				
				na.add(a);
				
				if( remAt != -1 ) {
					ia.remove(remAt);
					remAt = -1;
				}
			}
			System.out.println("\n Sorted Values : "+na);
			System.out.println(" No. of Swaps  : "+swps);
		}
	}

	
	public static boolean isSwap(Integer a, Integer posAt) { 
		Integer tmp = null;
		if( isLS(a, na.get(posAt)) ){
			tmp = new Integer(na.get(posAt));
			na.set(posAt, a);
			if( posAt == na.size()-1)
				na.add(tmp);
			else
				na.set(posAt+1,tmp);				
				return true;
		}
		return false;
	}
	 
	public static boolean isLS(Integer a, Integer b) {
		if( a > b)
			return false;
		
		return true;
	}
}