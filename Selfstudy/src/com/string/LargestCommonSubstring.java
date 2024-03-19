package com.string;

import java.util.ArrayList;
import java.util.List;

public class LargestCommonSubstring 
{
	public static void main(String[] args) {
		String s1 = "abcdefghijklmnopqrxyz";
		String s2 = "mnopqrabcdefyzkijkllj";
		int high  = 0;

		List<String> lst = new ArrayList<String>();
		int i=0, j=0;
		boolean found = false;
		
		while( i < s1.length()) {
			j=i;
			found = false;
			
			while( j < s1.length()  &&  s2.contains( s1.substring(i,j))) {
				found = true;
				j++;
			}
			if(found  &&  !lst.contains(s1.substring(i,j-1) ))
				if( high < s1.substring(i,j-1).length() ) {
					high =  s1.substring(i,j-1).length();
					lst.clear();
					lst.add(s1.substring(i,j-1));
				}
			i++;
		}
		for(int m=0; m < lst.size(); m++) {
			if( lst.get(m).length() < high)
				lst.remove(lst.get(m));
		}
			
		System.out.println(lst);
	}
}
