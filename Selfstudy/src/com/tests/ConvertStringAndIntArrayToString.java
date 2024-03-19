package com.tests;

import java.util.Arrays;

public class ConvertStringAndIntArrayToString {

	public static void main(String[] args) 
	{		
		// convert String[] to a  regular String
		
		String[] sa = new String[] {"A", "A", "Q", "Q", "6"};
		System.out.println( String.join("", sa));
		
		
		// convert int[] to a  regular int value
		// 1.
		int[] ia = new int[] {1,4,5,8,9,2};
		System.out.println(  Arrays.toString(ia).replaceAll(",", "").replace("[", "").replace("]", "").replace(" ", ""));
		
		// 2.		
		StringBuffer sb = new StringBuffer();
		for(int i : ia)
			sb.append(i);		
		System.out.println( new Integer( sb.toString()));
		
		// 3.
		int c = 1, n = 0;
		for(int i=ia.length-1; i>=0; i--) {
			n += ia[i] * c;
			c = c*10;
		}
		System.out.println(n);
		
	}

}
