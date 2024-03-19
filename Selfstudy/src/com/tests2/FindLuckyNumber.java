package com.tests2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
		Find Lucky Integer in an Array
		Given an array of integers arr, a lucky integer is an integer which has a frequency 
		(how many times an element occurs within the array) in the array equal to its value.
		
		Return a lucky integer in the array. If there are multiple lucky integers return the largest of them.
		If there is no lucky integer return -1.
		
		Example 1:
		Input: arr = [2,2,3,4]
		Output: 2
		Explanation:
		
		The only lucky number in the array is 2 because it occurs twice within the array which is equal to its value 2. 
		
		Example 2:
		Input: arr = [1,2,2,3,3,3]
		Output: 3
		Explanation:
		1, 2 and 3 are all lucky numbers and the largest is returned.
		
		Example 3:
		Input: arr = [2,2,2,3,3]
		Output: -1
		Explanation:
		
		There are no lucky numbers in the array because 2 occurs 3 times and 3 occurs twice in the array.
		
		Example 4:
		
		Input: arr = [5]
		Output: -1
*/

class Solution {
    public int findLucky(int[] arr) {
        Integer max =-1;
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
        for( int i : arr){
            if( hm.get(i) != null )
                hm.get(i).add(i);
            else {
                ArrayList<Integer> al = new ArrayList<Integer>();
                al.add(i);
                hm.put(i, al);
            }
        }
        for (Map.Entry<Integer,ArrayList<Integer>> entry : hm.entrySet()) {
            /*System.out.println("Key = " + entry.getKey() +
                             ", Size = " + entry.getValue());*/
                             
            if( entry.getKey() == entry.getValue().size()) {
                if( max < entry.getKey())
                    max = entry.getKey();
                
            }                
        }
        return max;
    }
}


public class FindLuckyNumber {
	 public static void main(String[] args) {
	        int [] A = new int[]{1,2,2,3,3,3};
	        System.out.println("The Lucky number is : " + new Solution().findLucky(A));
	    }
}
