package com.games;
/*
	Create a function that takes the name of a chess piece, its position and a target position. 
	The function should return true if the piece can move to the target and false if it can't.
	
	The possible inputs are "Pawn", "Knight", "Bishop", "Rook", "Queen" and "King".
	
	Examples
	canMove("Rook", "A8", "H8") ➞ true
	
	canMove("Bishop", "A7", "G1") ➞ true
	
	canMove("Queen", "C4", "D6") ➞ false
	Notes
	Do not include pawn capture moves and en passant.
	Do not include castling.
	Remember to include pawns' two-square move on the second rank!
	Look for patterns in the movement of the pieces.
*/
 
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertEquals;


public class ChessPieces {

	@Test
	public void test1() {
		assertEquals("Rook moving horizontal",true, canMove("Rook", "A8", "H8"));
		assertEquals("Rook moving vertical",true, canMove("Rook", "F6", "F1"));
		assertEquals("Rook moving cross",false, canMove("Rook", "G4", "F3"));
	}
	@Test
	public void test2() {
		assertEquals("Bishop moving cross right down",true, canMove("Bishop", "A7", "G1"));
		assertEquals("Bishop moving cross left down",true, canMove("Bishop", "C2", "F5"));
		assertEquals("Bishop moving left horizontal",false, canMove("Bishop", "D7", "A7"));
	}
	@Test
	public void test3() {
		assertEquals("Queen moving like Knight",false, canMove("Queen", "C4", "D6"));
		assertEquals("Queen moving cross up right",true, canMove("Queen", "D3", "H7"));
		assertEquals("Queen moving up",true, canMove("Queen", "A1", "A6"));
		assertEquals("Queen moving like Knight up",false, canMove("Queen", "B1", "C3"));
	}
	@Test
	public void test4() {
		assertEquals("Pawn moving 1 up",true, canMove("Pawn", "C4", "C5"));
		assertEquals("Pawn moving 2 up from line 2",true, canMove("Pawn", "H2", "H4"));
		assertEquals("Pawn moving 2 up from line 3",false, canMove("Pawn", "G3", "G5"));
		assertEquals("Pawn moving side way",false, canMove("Pawn", "D3", "E3"));
	}
	@Test
	public void test5() {
		assertEquals("Knight moving correct up",true, canMove("Knight", "B1", "C3"));
		assertEquals("Knight moving left wrong",false, canMove("Knight", "D5", "A4"));
		assertEquals("Knight moving left down correct",true, canMove("Knight", "E5", "C4"));
	}
	@Test
	public void test6() {
		assertEquals("King moving correct up",true, canMove("King", "D1", "D2"));
		assertEquals("King moving right down cross 3 boxes",false, canMove("King", "B5", "D3"));
		assertEquals("King moving right up cross 1 box",true, canMove("King", "C5", "D6")); // cross 1 move
	}
	
	
	
	public static void main(String[] args) {
		//Request request = Request.method(ChessPieces.class, "test6");
		Result result = JUnitCore.runClasses(ChessPieces.class);
		//Result result = new JUnitCore().run(request);
		
		for(Failure fail : result.getFailures())
			System.out.println(fail.toString());

		System.out.println("Test of ChessPieces successful ? : "+result.wasSuccessful());
	}

	public boolean canMove(String p, String f, String t) {
		boolean out = true;
		int piece   = p.equals("Pawn") ?  1 :
							p.equals("Knight") ?  2 :
								p.equals("Bishop") ?  3 :
									p.equals("Rook") ?  4 :
										p.equals("Queen") ?  5 : 6;
		
		char c  =  f.charAt(0);
		int fx  =  c == 'A' ? 1 : c == 'B' ? 2 : c == 'C' ? 3 : c == 'D' ? 4 : c == 'E' ? 5 : c == 'F' ? 6 : c == 'G' ? 7 : 8;
 		int fy  =  Integer.parseInt( f.charAt(1) +"");
 		
 		c       =  t.charAt(0);
		int tx  =  c == 'A' ? 1 : c == 'B' ? 2 : c == 'C' ? 3 : c == 'D' ? 4 : c == 'E' ? 5 : c == 'F' ? 6 : c == 'G' ? 7 : 8;
 		int ty  =  Integer.parseInt( t.charAt(1) +"");
		
		
		
		switch( piece ) { 
			case 1 : // Pawn
				if( fx != tx   ||  ((ty-fy) > 2  && fy == 2) ||  ((ty - fy) > 1  &&  fy != 2))  
					out = false;
				break;
			case 2 : // Knight
				if( Math.abs(fx - tx) == 2   &&  Math.abs(fy-ty) == 1 )
					out = true;
				else if( Math.abs(fy-ty) == 2  &&  Math.abs(fx-tx) == 1 ) 
					out = true;
				else
					out = false;
				break;
			case 3 : // Bishop
				if( Math.abs(fx-tx) != Math.abs(fy-ty) )
					out = false;
				break;
			case 4 : // Rook
				if( (Math.abs(fy-ty) > 0   &&  fx != tx)  ||  (Math.abs(fx-tx) > 0    &&  fy != ty ) )
					out = false;
				break;
			case 5 : // Queen
				if( Math.abs(fx-tx) == Math.abs(fy-ty) ) 
					out = true;
				else if( (fx==tx  &&  Math.abs(fy-ty) > 0 )  ||  (fy == ty  &&  Math.abs(fx-tx) > 0)  )
					out = true;
				else
					out = false;
				break;
			case 6 : // King
				if ( (Math.abs(fx-tx) == 1   &&  Math.abs(fy-ty) < 2)   ||   (Math.abs(fy-ty) == 1  &&  Math.abs(fx-tx) < 2) ) 
					out = true;
				else
					out = false;
				break;
		}				
		
		return out;
	}
	
}
