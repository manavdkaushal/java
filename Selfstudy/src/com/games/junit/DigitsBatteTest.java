package com.games.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.games.DigitsBattle;



public class DigitsBatteTest {
	
	DigitsBattle db = new DigitsBattle();
	
	@Test
	public void test1() {
		assertEquals(7925,db.battleOutcome(578921445)); // 7925
	}
	@Test
	public void test2() {
		assertEquals(351,db.battleOutcome(32531));      // 351
	}
	@Test
	public void test3() {
		assertEquals(1,db.battleOutcome(111));        // 1
	}
	@Test
	public void test() {
		assertEquals(895,db.battleOutcome(78925));      // 895
	}

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(DigitsBattle.class);
		
		for(Failure fail : result.getFailures())
			System.out.println(fail.toString());
		
		System.out.println("Was DigitsBattle test successful : "+result.wasSuccessful());

	}

}
