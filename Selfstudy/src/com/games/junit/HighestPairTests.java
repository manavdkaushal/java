package com.games.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.games.HighestPair;



public class HighestPairTests {

	HighestPair hp  = new HighestPair();
	
	@Test
	public void test1() {
		assertEquals("A", hp.highestPair(new String[] {"A", "A", "Q", "Q", "6"}) );
	}
	@Test
	public void test2() {	
		assertEquals("",  hp.highestPair(new String[] {"J", "6", "3", "10", "8"}) );
	}
	@Test
	public void test3() {
		assertEquals("3", hp.highestPair(new String[] {"K", "7", "3", "9", "3"}) );
	}
	@Test
	public void test4() {
		assertEquals("",  hp.highestPair(new String[] {"K", "9", "10", "J", "Q"}) );
	}
	@Test
	public void test5() {
		assertEquals("5", hp.highestPair(new String[] {"3", "5", "5", "5", "5"}) );
	}
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(HighestPairTests.class);
		
		for(Failure fail : result.getFailures())
			System.out.println("Failure in HighestPairTests : "+fail.toString());
		
		System.out.println("Was HighestPairTest successful ? : "+result.wasSuccessful());

	}

}
