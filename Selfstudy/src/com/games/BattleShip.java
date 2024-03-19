package com.games;
/*
	Build a Class that will store and manipulate the data of a simplified clone of the 
	popular strategy game, Battleship.
	
	The game is played on a 5x5-sized board. The rows of the grid are identified by the uppercase 
	letters A to E (top to bottom), and the columns are identified by the numbers 1 to 5 (left to right).
	
	Rules of the Game
	There are two types of ship: the Patrol and the Cruiser. The Patrol occupies a single cell, 
	the Cruiser occupies two cells, horizontally or vertically.
	Three Patrols and three Cruisers will be placed randomly in the grid, without ships adjacent 
	in rows and columns (see the notes below).
	The user calls six different cells, trying to guess if there's a Patrol or a Cruiser in it.
	Hits and misses are recorded on the board. For every hit Patrol or Cruiser, a point is gained, 
	and if a Cruiser is sunk, two additional points are gained.
	Class "Battleship"
	Each instance in the Tests tab will be declared with two variable parameters so the constructor 
	has to be initialized with:
	
	scheme - an array containing 9 strings being the coordinates indicating 
	where the ships are placed on the grid.
	target - an array containing 6 strings being the guesses made by the user.
	What do you have to implement?
	The Tests will verify the existence and the correctness of the data through an instance of 
	the Battleship Class and will invoke its four different methods:
	
	board() - returns the final state of the board, based on the placement of the ship and the 
	results of the user guesses, as a 5x5 matrix. The following character set will represent the graphic of the game:
	
	○ = a blank space on the board.
	● = a space occupied by a ship.
	☼ = a miss (wrong guess).
	☀ = a hit (a correct guess).
	hits() - returns the total number of hits made by the user (correct guesses), either on Patrols or on Cruisers.
	
	sunk() - returns the total number of sunk Cruisers (two adjacent guesses, in horizontal or vertical).
	points() - returns the total number of points gained by the user (1 for every hit, 2 for every sunk Cruiser).
	Examples
	// scheme = ["A1", "C1", "B2", "B3", "D2", "E2", "E4", "E5", "A5"]
	
	// target = ["A1", "B2", "C3", "D4", "E5", "E4"]
	
	battleship.board() ➞ [
	  [☀, ○, ○, ○, ●],
	  [○, ☀, ●, ○, ○],
	  [●, ○, ☼, ○, ○],
	  [○, ●, ○, ☼, ○],
	  [○, ●, ○, ☀, ☀]
	]
	
	battleship.hits() ➞ 4
	// Total hits.
	
	battleship.sunk() ➞ 1
	// Sunk Cruisers, not Patrols.
	
	battleship.points() ➞ 6
	// Hits + additional points given by Sunk Cruisers.
	Notes
	If two cruisers are in the same row or the same column, there will be a blank cell between them, so that it will be possible to treat them as different ships.
	The board is not given, you have to build it.
	In the Examples above, the symbols of the board are not between quotation marks for readability, but they are strings. The set of characters used for this challenge is already in the Code tab.

*/

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class BattleShip 
{
	private String[][] grid;	
	private int hitCnt = 0;
	private int sunkCnt = 0;
	private int pointCnt = 0;
	private Map sunkIds; 
	
	
	public BattleShip() {}
	
	public BattleShip(String[] shpArr, String[] target) 
	{
		int r = 0, c = 0;
		this.grid = new String[5][5];
		this.sunkIds = new HashMap();
		
		for(int i=0; i<5; i++) {  // init blank cells
			for(int j=0; j<5; j++)
				grid[i][j] = "○";
		}
		
		for(String s: shpArr) { // mark ship standings
			char x = s.charAt(0);
			r = x == 'A' ? 0 : x == 'B' ? 1 : x == 'C' ? 2 : x == 'D' ? 3 : 4;
			c = Integer.parseInt(s.charAt(1)+"")-1;
			
			grid[r][c] = "●"; 
		}
		
		for(String s: target) { // mark targets
			char x = s.charAt(0);
			r = x == 'A' ? 0 : x == 'B' ? 1 : x == 'C' ? 2 : x == 'D' ? 3 : 4;
			c = Integer.parseInt(s.charAt(1)+"")-1;
			
			if( grid[r][c] != "○" ) {  
				grid[r][c] = "☀"; // mark the hit
			}
			else 
				grid[r][c] = "☼";  // mark miss hit			
		}
		
		
		for(int i=0; i<5; i++)  // count points
		{ 
			for(int j=0; j<5; j++) 
			{
				if( grid[i][j].equals("☀") ) 
				{					
					hitCnt++;

					if( j+1 < 5   &&  grid[i][j+1].equals("☀") ) { // its a Crusier +2
						pointCnt += 2;
						
						if( !sunkIds.containsKey(""+i+j)  &&  !sunkIds.containsKey(""+i+(j+1))) {
							sunkCnt++;
							sunkIds.put(""+i+j, null);
							sunkIds.put(""+i+(j+1), null);
						}
					}
					else if( j-1 >= 0   &&  grid[i][j-1].equals("☀") ) { // its a Crusier +2
						pointCnt += 2;
						if( !sunkIds.containsKey(""+i+j)  &&  !sunkIds.containsKey(""+i+(j-1))) {
							sunkCnt++;
							sunkIds.put(""+i+j, null);
							sunkIds.put(""+i+(j-1), null);
						}
					}
					else if( i-1 >= 0   &&  grid[i-1][j].equals("☀") ) { // its a Crusier +2
						pointCnt += 2;
						if( !sunkIds.containsKey(""+i+j)  &&  !sunkIds.containsKey(""+(i-1)+j)) {
							sunkCnt++;
							sunkIds.put(""+i+j, null);
							sunkIds.put(""+(i-1)+j, null);
						}
					}	
					else if( i+1 < 5   &&  grid[i+1][j].equals("☀") ) {// its a Crusier +2
						pointCnt += 2;
						if( !sunkIds.containsKey(""+i+j)  &&  !sunkIds.containsKey(""+(i+1)+j)) {
							sunkCnt++;
							sunkIds.put(""+i+j, null);
							sunkIds.put(""+(i+1)+j, null);
						}
					}
					else
						pointCnt++;
				} 
			}
		}		 
	}
	
	
	public String[][] board(){
		System.out.println( Arrays.toString( grid[0]) );
		System.out.println( Arrays.toString( grid[1]) );
		System.out.println( Arrays.toString( grid[2]) );
		System.out.println( Arrays.toString( grid[3]) );
		System.out.println( Arrays.toString( grid[4]) );
		
		return grid;
	}
	public int hits() {
		return hitCnt;
	}
	public int sunk() {
		return sunkCnt;
	}
	public int points() {
		return pointCnt;
	}
	
	
	@Test
	public void test4() {
		BattleShip bs = new BattleShip(new String[] {"A1", "C1", "B2", "B3", "D2", "E2", "E4", "E5", "A5"}, new String[]{"A1", "B2", "C3", "D4", "E5", "E4"});		
		assertEquals(4, bs.hits());
		assertEquals(1, bs.sunk());
		assertEquals(6, bs.points());
		
		bs.board();
	}
	
	

	public static void main(String[] args) 
	{
		/*Result result   = JUnitCore.runClasses(BFSChess.class);		
		
		for(Failure fail : result.getFailures())
			System.out.println(fail.toString());
		
		System.out.println("Battleship was successful : "+ result.wasSuccessful());*/
		
		BattleShip bs = new BattleShip(
								new String[] {"A1", "C1", "B2", "B3", "D2", "E2", "E4", "E5", "A5"}, 
								new String[]{"A1", "B2", "C3", "D4", "E5", "E4"});
		
		System.out.println("Hits (4) :  "+bs.hits());
		System.out.println("Sunk (1) :  "+bs.sunk());
		System.out.println("Points (6) :  "+bs.points());		
		System.out.println(bs.board());
	}

}
