package com.games;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/*
	Write a function that returns true if the knights are placed on a chessboard such that no knight can capture another knight. 
	Here, 0's represent empty squares and 1's represent knights.
	
	Examples
	cannotCapture([
	  [0, 0, 0, 1, 0, 0, 0, 0],
	  [0, 0, 0, 0, 0, 0, 0, 0],
	  [0, 1, 0, 0, 0, 1, 0, 0],
	  [0, 0, 0, 0, 1, 0, 1, 0],
	  [0, 1, 0, 0, 0, 1, 0, 0],
	  [0, 0, 0, 0, 0, 0, 0, 0],
	  [0, 1, 0, 0, 0, 0, 0, 1],
	  [0, 0, 0, 0, 1, 0, 0, 0]
	]) ➞ true
	
	cannotCapture([
	  [1, 0, 1, 0, 1, 0, 1, 0],
	  [0, 1, 0, 1, 0, 1, 0, 1],
	  [0, 0, 0, 0, 1, 0, 1, 0],
	  [0, 0, 1, 0, 0, 1, 0, 1],
	  [1, 0, 0, 0, 1, 0, 1, 0],
	  [0, 0, 0, 0, 0, 1, 0, 1],
	  [1, 0, 0, 0, 1, 0, 1, 0],
	  [0, 0, 0, 1, 0, 1, 0, 1]
	]) ➞ false
	
	cannotCapture([
	  [0, 0, 0, 0, 1, 0, 0, 0], 
	  [0, 0, 0, 0, 0, 1, 0, 0], 
	  [0, 0, 0, 1, 0, 0, 0, 0], 
	  [1, 0, 0, 0, 0, 0, 0, 0], 
	  [0, 0, 0, 0, 1, 0, 0, 0], 
	  [0, 0, 0, 0, 0, 1, 0, 0], 
	  [0, 0, 0, 0, 0, 1, 0, 0], 
	  [1, 0, 0, 0, 0, 0, 0, 0]
	]) ➞ false
	Notes
	Knights can be present in any of the 64 squares.
	No other pieces exist but knights.

*/

public class KnightsOnBoard {
	public boolean cannotCapture(int[][] ia) {
		boolean out = true;
		int[][] tmp = ia;
		
		for( int r=0; r < ia.length  &&  out; r++ ) {
			for( int c=0; c < ia[r].length  && out; c++ ) {
				if( ia[r][c] == 1  &&  isKntPresent(tmp, r, c) ) { // Knight is present					
					out = false;
					break;
				}
			}
		}
		
		return out;
	}
	public boolean isKntPresent(int[][] ar, int r, int c) {		
		if( r+1 <=7 ) {
			if( c+2 <= 7 ) {
				if( ar[r+1][c+2] == 1)
					return true;
			}	
			else if( c-2 >=0) {
				if( ar[r+1][c-2] == 1)
					return true;
			}
		}
		if( r-1 >=0 ) {
			if( c+2 <= 7 ) {
				if( ar[r-1][c+2] == 1)
					return true;
			}	
			else if( c-2 >=0) {
				if( ar[r-1][c-2] == 1)
					return true;
			}
		}
		if( r+2 <=7 ) {
			if( c+1 <= 7 ) {
				if( ar[r+2][c+1] == 1)
					return true;
			}	
			else if( c-1 >=0) {
				if( ar[r+2][c-1] == 1)
					return true;
			}
		}
		if( r-2 >=0 ) {
			if( c+1 <= 7 ) {
				if( ar[r-2][c+1] == 1)
					return true;
			}	
			else if( c-1 >=0) {
				if( ar[r-2][c-1] == 1)
					return true;
			}
		}
		
		return false;
	}
	
	
	@Test
	public void test1() {
		assertEquals(true, cannotCapture(new int[][] {
                        	  {0, 0, 0, 1, 0, 0, 0, 0},
                        	  {0, 0, 0, 0, 0, 0, 0, 0},
                        	  {0, 1, 0, 0, 0, 1, 0, 0},
                        	  {0, 0, 0, 0, 1, 0, 1, 0},
                        	  {0, 1, 0, 0, 0, 1, 0, 0},
                        	  {0, 0, 0, 0, 0, 0, 0, 0},
                        	  {0, 1, 0, 0, 0, 0, 0, 1},
                        	  {0, 0, 0, 0, 1, 0, 0, 0}
                        	}));
	}
	
	@Test
	public void test2() {
		assertEquals(false, cannotCapture(new int[][]{
				         	  {1, 0, 1, 0, 1, 0, 1, 0},
				         	  {0, 1, 0, 1, 0, 1, 0, 1},
				         	  {0, 0, 0, 0, 1, 0, 1, 0},
				         	  {0, 0, 1, 0, 0, 1, 0, 1},
				         	  {1, 0, 0, 0, 1, 0, 1, 0},
				         	  {0, 0, 0, 0, 0, 1, 0, 1},
				         	  {1, 0, 0, 0, 1, 0, 1, 0},
				         	  {0, 0, 0, 1, 0, 1, 0, 1}
				         	}));
	}
	
	@Test
	public void test3() {
		assertEquals(false, cannotCapture(new int[][]{
                        	  {0, 0, 0, 0, 1, 0, 0, 0}, 
                        	  {0, 0, 0, 0, 0, 1, 0, 0}, 
                        	  {0, 0, 0, 1, 0, 0, 0, 0}, 
                        	  {1, 0, 0, 0, 0, 0, 0, 0}, 
                        	  {0, 0, 0, 0, 1, 0, 0, 0}, 
                        	  {0, 0, 0, 0, 0, 1, 0, 0}, 
                        	  {0, 0, 0, 0, 0, 1, 0, 0}, 
                        	  {1, 0, 0, 0, 0, 0, 0, 0}
                        	}));
	}
	
	public static void main(String[] args) {
		//Request request = Request.method(KnightsOnBoard.class, "test3");
		//Result result   = new JUnitCore().run(request);
		Result result   = JUnitCore.runClasses(KnightsOnBoard.class);		
		
		for(Failure fail : result.getFailures())
			System.out.println(fail.toString());
		
		System.out.println("Knights on Board was successful : "+ result.wasSuccessful());	

	}

}
