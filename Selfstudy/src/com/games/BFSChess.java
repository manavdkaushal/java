package com.games;
/*
	You will be given the location of a knight, and an end location. 
	The knight can move in a "L" shape. "L" shape movement means that the knight 
	can change it's x coordinate by 2 and it's y coordinate by 1 or it can change 
	it's y coordinate by 2 and it's x coordinate by 1 (you can add and subtract from the x/y).
	
	For example, if the knight is at the position (0, 0), it can move to:
	
	(1,2), (1,-2), (2,1), (2,-1), (-1,2), (-1,-2), (-2,1), (-2, -1)
	Your job is to return the least amount of steps needed to go from the position K 
	(knight's start position) to E (end). You will only be given the knight 
	starter coordinates (x1, y1) and the end coordinates (x2, y2).
	
	Constrains: 1 <= x1,y1,x2,y2 <= 8
	
	Examples
	knightBFS(1, 1, 8, 8) ➞ 6
	
	knightBFS(1, 1, 3, 2) ➞ 1
	
	knightBFS(8, 8, 3, 3) ➞ 4
	Notes
	This is a simplified version of this problem.
	This travel will always be possible.
	The chess board is 8x8.
*/

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class BFSChess {

	public int knightBFS(int fx, int fy,int tx,int ty) 
	{
		int dfx = tx-fx;
		int dfy = ty-fy;
		int mvs = 0, div=0, rmd=0;
		
		
		if( (dfx == 2   &&  dfy == 1)  ||  (dfx == 1   &&  dfy == 2) ) {
			mvs = 1;
		} 
		else 
		{
			if( dfx >= dfy ) {
				div = dfx / 2;
				rmd = dfx % 2;
				
				if( (fy + (1*div) + (2*rmd)) != ty ) {
					if( Math.abs( ty - (fy + (1*div) + (2*rmd)) ) == 2 ) {
						mvs = Math.abs( div + rmd + 2);
					} else if ( Math.abs( ty - (fy + (1*div) + (2*rmd)) ) == 1 ) {
						mvs = Math.abs(div) + 2;
					}
				} else {
					mvs = Math.abs(div + rmd);
				}
			} else if( dfy > dfx ) {
				div = dfy / 2;
				rmd = dfy % 2;
				
				if( (fx + (1*div) + (2*rmd)) != tx ) {
					if( Math.abs(  tx - (fx + (1*div) + (2*rmd)) ) == 2 ) {
						mvs = Math.abs( div + rmd + 2);
					} else if ( Math.abs( tx - (fx + (1*div) + (2*rmd)) ) == 1 ) {
						mvs = Math.abs( div + 2);
					}
				} else {
					mvs = Math.abs(div + rmd);
				}
			}
		}
		
		return mvs;
	}
	
	@Test
	public void test1() {
		assertEquals(6, knightBFS(1,1,8,8));
	}
	@Test
	public void test2() {
		assertEquals(1, knightBFS(1, 1, 3, 2));
	}
	@Test
	public void test3() {
		assertEquals(4, knightBFS(8, 8, 3, 3));
	}
	@Test
	public void test4() {
		assertEquals(4, knightBFS(3, 3, 8, 8));
	}
	
	

	public static void main(String[] args) {
		//Request request = Request.method(BFSChess.class, "test4");
		//Result result   = new JUnitCore().run(request);
		Result result   = JUnitCore.runClasses(BFSChess.class);		
		
		for(Failure fail : result.getFailures())
			System.out.println(fail.toString());
		
		System.out.println("BFSChess was successful : "+ result.wasSuccessful());
	}

}
