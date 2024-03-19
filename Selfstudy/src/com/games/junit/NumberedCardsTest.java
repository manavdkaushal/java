package com.games.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.games.NumberedCards;

public class NumberedCardsTest {
	NumberedCards nc = new NumberedCards();
	
	@Test
	public void test1() {
		assertEquals("Whether player 1 wins ?", true, nc.winRound(new int[] {2, 5, 2, 6, 9}, new int[] {3, 7, 3, 1, 2}) ) ;
	}
	
	@Test
	public void test2() {
		assertEquals("Whether player 1 wins ?", true, nc.winRound(new int[] {2, 5, 2, 6, 9}, new int[] {3, 7, 3, 1, 2}) );
	}
	
	@Test
	public void test3() {
		assertEquals("Whether player 1 wins ?", false, nc.winRound(new int[] {1, 2, 3, 4, 5}, new int[] {9, 8, 7, 6, 5}) );
	}
	
	@Test
	public void test4() {
		assertEquals("Whether player 1 wins ?", false, nc.winRound(new int[] {4, 3, 4, 4, 5}, new int[] {3, 2, 5, 4, 1}) );
	}
	
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(NumberedCardsTest.class);
		
		for(Failure failure :   result.getFailures() )
			System.out.println(failure.toString());
		
		System.out.println("NumberedCards game tests were successful ? : "+result.wasSuccessful());
	}
}
