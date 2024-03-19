package com.games;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.Assert;
/*
	Create a function that returns a number which can block 
	the player from reaching 3 	in a row in a game of Tic Tac Toe. 
	The number given as an argument will correspond to a grid 
	of Tic Tac Toe: topleft is 0, topright is 2, bottomleft is 6, and bottomright is 8.
	
	Create a function that takes two numbers a, b and returns another number.
	This number should be the final one in a line to block the player from winning.
	Examples
	blockPlayer(0, 3) ➞ 6
	
	blockPlayer(0, 4) ➞ 8
	
	blockPlayer(3, 5) ➞ 4
	Notes
	The values given will always have two filled squares in a line.
*/	
public class TicTacToe {

	@Test
	public void test1() {
		Assert.assertEquals(6, blockPlayer(0, 3));
	}
	@Test
	public void test2() {
		Assert.assertEquals(8, blockPlayer(0, 4));
	}
	@Test
	public void test3() {
		Assert.assertEquals(4, blockPlayer(3, 5));
	}
	@Test
	public void test4() {
		Assert.assertEquals(7, blockPlayer(8, 6));
	}
	@Test
	public void test5() {
		Assert.assertEquals(2, blockPlayer(0, 1));
	}
	@Test
	public void test6() {
		Assert.assertEquals(7, blockPlayer(1, 4));
	}
	@Test
	public void test7() {
		Assert.assertEquals(3, blockPlayer(0, 6));
	}
	@Test
	public void test8() {
		Assert.assertEquals(5, blockPlayer(8, 2));
	}
	@Test
	public void test9() {
		Assert.assertEquals(4, blockPlayer(2, 6));
	}
		
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TicTacToe.class);
		
		for(Failure fail : result.getFailures())
			System.out.println(fail.toString());
		
		System.out.println("Was TicTacToe test successful ? : "+result.wasSuccessful());
	}
	
	public int blockPlayer(int a, int b) {
		int out = 0;
		int d = 0;
		
		if( a < b ) {
			if( (b - 2) == a) {
				out = b-1;
			}
			else {
				d  = b-a;
				if( d == 6 )
					out = b - 3;
				else	
					out = b + d;
			}
			
		} else if( a > b) {			
			if( (a-2) == b) {
				out = a-1;
			} else {
				d = a - b;
				if( d == 6)
					out = a-3;
				else
					out = b - d;
			}
		}
		
		return out;
	}

}
