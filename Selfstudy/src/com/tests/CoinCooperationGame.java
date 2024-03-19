package com.tests;

import java.util.Arrays;

/*
 *  link to question : https://edabit.com/challenge/WmGeYLJbud69ezCew
 * 
	Let's say that there exists a machine that gives out free coins, but with a twist!
	
	Separating two people is a wall, and this machine is placed in such a way that both people are able to access it. 
	Spending a coin in this machine will give the person on the other side 3 coins and vice versa.
	
	If both people continually spend coins for each other (SHARING), then they'll both gain a net profit of 2 coins per turn. 
	However, there is always the possibility for someone to act selfishly (STEALING): they spend no coins, yet they still receive the generous 3 coin gift from the other person!
	
	Here's an example of Red taking advantage of Green! Red chose to betray
	
	The Challenge
	Assuming that both people start with 3 coins each, create a function that calculates both people's final number of coins. 
	You will be given two arrays of strings, with each string being the words "share" or "steal".
	
	Examples
	getCoinBalances(["share"], ["share"]) ➞ [5, 5]
	// Both people spend one coin, and receive 3 coins each.
	
	getCoinBalances(["steal"], ["share"]) ➞ [6, 2]
	// Person 1 gains 3 coins, while person 2 loses a coin.
	
	getCoinBalances(["steal"], ["steal"]) ➞ [3, 3]
	// Neither person spends any coins and so no one gets rewarded.
	
	getCoinBalances(["share", "share", "share"], ["steal", "share", "steal"]) ➞ [3, 11]

*/


public class CoinCooperationGame {

	public static void main(String[] args) {
		System.out.println( Arrays.toString( getCoinBalances(new String[]{"share"}, new String[]{"share"})) );
		System.out.println( Arrays.toString( getCoinBalances(new String[]{"steal"}, new String[]{"share"})) );
		System.out.println( Arrays.toString( getCoinBalances(new String[]{"steal"}, new String[]{"steal"})) );
		System.out.println( Arrays.toString( getCoinBalances(new String[]{"share","share","share"}, new String[]{"steal","share","steal"})) );

	}
	public static int[] getCoinBalances(String[] sa1, String[] sa2 ) {
		final int initCoins = 3; 
		int p1Bal           = initCoins;
		int p2Bal           = initCoins;
		int[] output        = new int[] {0,0};
		int i               = 0;
		
		if( sa1 != null && sa1.length > 0   &&  sa2 != null  &&  sa2.length > 0) {
			while( i < sa1.length ) {
				if( sa1[i].equals("share")    &&   sa2[i].equals("share")) {
					p1Bal -= 1;
					p2Bal -= 1;
					
					p1Bal += 3;
					p2Bal += 3;
				} else if( sa1[i].equals("share")    &&   sa2[i].equals("steal")) {
					p1Bal -= 1;
					p2Bal += 3;
				} else if( sa1[i].equals("steal")    &&   sa2[i].equals("share")) {
					p1Bal += 3;
					p2Bal -= 1;
				} 
				
					
				i++;
			}
		}
		output[0] = p1Bal;
		output[1] = p2Bal;
		
		return output;
	}
	
	
	
}















