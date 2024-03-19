package com.games;
/*
	Two players draw a pair of numbered cards so that both players can form a 2 digit number. 
	A winner can be decided if one player's number is larger than the other.
	
	However, there is a rule where a player can swap any one of their cards with any one of 
	the other player's cards in a gamble to get a higher number! 
	Note that it is illegal to swap the order of your own cards. 
	That means if you draw a 1 then a 9, you cannot swap them to get 91.
	
	Numbered Cards
	
	Paul's strategy is to always swap his lowest number with the opponent's ten's digit. 
	Return whether this results in Paul winning the round.
	
	n1 is Paul's number
	n2 is his opponent's number
	Worked Example
	swapCards(41, 79) ➞ true
	// Paul's lowest number is 1
	// The opponent's ten's digit is 7
	// After the swap: 47 > 19
	// Paul wins the round
	Examples
	swapCards(41, 98) ➞ true
	
	swapCards(12, 28) ➞ true
	
	swapCards(67, 53) ➞ false
	
	swapCards(77, 54) ➞ false
	Notes
	If both of Paul's digits are the same, swap the ten's digit with the opponent's (paul likes to live riskily).
	The cards don't include the number 0.
*/

import org.junit.runner.notification.Failure;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class SwappingCards {
	
	@Test
	public void test1() {
		Assert.assertEquals(true, swapCards(41, 98));
	}
	@Test
	public void test2() {
		Assert.assertEquals(true, swapCards(12, 28));
	}
	@Test
	public void test3() {
		Assert.assertEquals(false, swapCards(67, 53) );
	}
	@Test
	public void test4() {
		Assert.assertEquals(false, swapCards(77,54));
	}
	
	
	public boolean swapCards(int a, int b) {
		boolean out = false;
		int pleft = 0, pright = 0 , qleft = 0, qright = 0;
		int pnew = 0, qnew = 0;
		
		pleft  = a / 10;
		pright = a % 10;
		qleft  = b / 10;
		qright = b % 10;
		
		if( pleft < pright ) {
			pnew = (10* qleft) + pright;
			qnew = (10* pleft) + qright;
		} else if( pright < pleft ) {
			pnew = (10* pleft) + qleft;
			qnew = (10* pright) + qright;
		} else if ( pleft == pright ) {
			pnew = (10* qright) + pright;
			qnew = (10* pright) + qright;
		}
		
		return pnew > qnew;
	}
	
	
	public boolean swapCards0(int a, int b) {
		boolean out = false;
		int pnew = 0;
		int onew = 0;
		int tmp = 0, tmp1=0;
		
		tmp = a %10; // pauls lowest card
		tmp1 = b / 10;
		
		pnew = ((a / 10)*10) + tmp1;
		onew = (tmp*10) + (b %10);
		
		out = pnew > onew;
		
		return out;
	}
	
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(SwappingCards.class);
		
		for(Failure fail : result.getFailures())
			System.out.println(fail.toString());

		System.out.println( " Swapping Cards test was successful : " + result.wasSuccessful());
	}

}
