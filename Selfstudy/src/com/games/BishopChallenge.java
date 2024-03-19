package com.games;
/*
	Your chess teacher wants to know if a bishop can reach a certain spot on the board in the given amount of moves.
	
	Given a starting square start, ending square end and the maximum number of moves allowed n. Return true if the ending square can be reached from the starting square within the given amount of moves. Keep in mind the chessboard goes from a1 to h8 (8x8).
	
	Examples
	bishop("a1", "b4", 2) ➞ true
	
	bishop("a1", "b5", 5) ➞ false
	
	bishop("f1", "f1", 0) ➞ true
	Notes
	Chessboard is always empty (only the bishop is there).
	Bishop can move in any direction diagonally.
	If the starting and ending square are the same, return true (even if the move is 0).
	Square names will always be lowercase and valid.
*/

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class BishopChallenge 
{
	
	public boolean bishop(String m, String n, int k) {
		boolean out = false;
		char c = m.charAt(0);
		int fx = c == 'A' ? 1 : c == 'B' ? 2 : c == 'C' ? 3 : c == 'D' ? 4 : c == 'E' ? 5 : c == 'F' ? 6 : c == 'G' ? 7 : 8;
		int fy = Integer.parseInt( m.charAt(1)+"");
		
		c = n.charAt(0);
		int tx = c == 'A' ? 1 : c == 'B' ? 2 : c == 'C' ? 3 : c == 'D' ? 4 : c == 'E' ? 5 : c == 'F' ? 6 : c == 'G' ? 7 : 8;
		int ty = Integer.parseInt( n.charAt(1)+"");
		int df = 0 ,dfx = 0, dfy = 0;
		
		if( m.equals(n) ) {
			out = true;
		} else if( Math.abs(Math.abs(fx-fy) - Math.abs(tx-ty)) % 2 == 0 ) { // valid box to move as per color
			if( oddEven( Math.abs( fx-fy)) ==  oddEven( Math.abs( tx-ty))) { // either both odd / both even then they can reach
				df = Math.abs( Math.abs(fx-tx) + Math.abs(fy-ty));
				if( oddEven( df) == 0 ) {// can reach
					if( df / k >= 2)
						out = true;
					else
						out = false;
				}
			}
			else
				out = false;
		}
		return out;
		
	}
	public int oddEven(int i) {
		return i % 2 == 0 ? 0 : 1;
	}
	
	public boolean bishop0(String m, String n, int k) {
		boolean out = false;
		char c = m.charAt(0);
		int fx = c == 'A' ? 1 : c == 'B' ? 2 : c == 'C' ? 3 : c == 'D' ? 4 : c == 'E' ? 5 : c == 'F' ? 6 : c == 'G' ? 7 : 8;
		int fy = Integer.parseInt( m.charAt(1)+"");
		
		c = n.charAt(0);
		int tx = c == 'A' ? 1 : c == 'B' ? 2 : c == 'C' ? 3 : c == 'D' ? 4 : c == 'E' ? 5 : c == 'F' ? 6 : c == 'G' ? 7 : 8;
		int ty = Integer.parseInt( n.charAt(1)+"");
		int fdf = 0, tdf = 0, df = 0;
		
		if( m.equals(n) ) {
			out = true;
		} else  if( (Math.abs(fx-fy) + Math.abs(tx-ty)) % 2 == 0 ) { // valid box to move as per color
			fdf = fx-fy;
			tdf = tx-ty;
			
			if( tdf != fdf ) {
				if( tdf < 0 ) { // minus diff
					if( fdf > 0 ) {
						fx = fx + tdf;
						fy = fy + Math.abs(tdf);
						df = Math.abs(tx-fx);
						
						if( fx + df == tx  &&  fy + df == ty)
							out = true;
					} 
				} else if( tdf == 0 ) { // zero diff
					df = Math.abs(fx-fy) / 2;
					fx = fx < fy ? fx+df : fx-df;
					fy = fy < fx ? fy+df : fy-df;
					df = Math.abs(tx-fx);
					
					if( fx + df == tx  &&  fy + df == ty)
						out = true;
				}
			} else {
				out = true;
			}
			
		} else
			out = false;
		
		return out;
	}
	
	@Test
	public void test1() {
		assertEquals(true, bishop("C1","D6",2));
	}
	@Test
	public void test2() {
		assertEquals(true, bishop("A5","H8",2));
	}
	@Test
	public void test3() {
		assertEquals(true,bishop("A1", "B4", 2));
	}
	@Test
	public void test4() {
		assertEquals(false, bishop("A1", "B5", 5));
	}
	@Test
	public void test5() {
		assertEquals(true,bishop("F1", "F1", 0));
	}

	public static void main(String[] args) {
		//Request request = Request.method(BishopChallenge.class, "test1");
		//Result result   = new JUnitCore().run(request);
		Result result   = JUnitCore.runClasses(BishopChallenge.class);		
		
		for(Failure fail : result.getFailures())
			System.out.println(fail.toString());
		
		System.out.println("Bishop was successful : "+ result.wasSuccessful());
	}
	
	

}
