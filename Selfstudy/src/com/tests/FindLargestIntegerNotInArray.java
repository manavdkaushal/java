package com.tests;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.*;

public class FindLargestIntegerNotInArray {
/* 

	Write a function:
	
	class Solution { public int solution(int[] A); }
	
	that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
	
	For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
	
	Given A = [1, 2, 3], the function should return 4.
	
	Given A = [−1, −3], the function should return 1.
	
	Write an efficient algorithm for the following assumptions:
	
	N is an integer within the range [1..100,000];
	each element of array A is an integer within the range [−1,000,000..1,000,000].

*/
	public static void main1(String args[]) {
		int[] A =  {1,2,3}; //{-1,-3}; // {1, 3, 6, 4, 1, 2};
		int out = 1;
		boolean found = false;
		
		while(true) {
			found = false;
			for(int i=0; i < A.length; i++) {
				if( A[i] == out ) {
					found = true;
					break;
				}
			}
			
			if( !found )
				break;
			
			out++;
		}
		System.out.println(out);
	}		
	
	public static void main(String args[]) {
		int r = solution(new int[] {1,3,4,5,6,7,10});
		System.out.println(r);
		
		r = solution(new int[] {11,12,13,14,15,16,17,10,8,7,6,5,4,3,2,1});
		System.out.println(r);
		
		r = solution(new int[] {1,3,4,5,6,7,10});
		System.out.println(r);
	}
    public static int solution(int[] A) {
        // Implement your solution here
        int rtn = 1;
        TreeSet<Integer> ts = new TreeSet<Integer>();
        for(int v : A){
            ts.add(v);
        }
        while(true){
            if(!ts.contains(rtn))
                break;
            rtn++;    
        }
        //System.out.println(ts);
        return rtn;
    }

}
	

