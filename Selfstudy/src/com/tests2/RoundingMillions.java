package com.tests2;

import java.math.BigDecimal;
import java.util.Arrays;

/*
	Given an array of cities and populations, return an array where all populations are rounded to the nearest million.

			Examples
			millionsRounding([
			  ["Nice", 942208],
			  ["Abu Dhabi", 1482816],
			  ["Naples", 2186853],
			  ["Vatican City", 572]
			]) ➞ [
			  ["Nice", 1000000],
			  ["Abu Dhabi", 1000000],
			  ["Naples", 2000000],
			  ["Vatican City", 0]
			]

			millionsRounding([
			  ["Manila", 13923452],
			  ["Kuala Lumpur", 7996830],
			  ["Jakarta", 10770487]
			]) ➞ [
			  ["Manila", 14000000],
			  ["Kuala Lumpur", 8000000],
			  ["Jakarta", 11000000]
			]
			Notes
			Round down to 0 if a population is below 500,000.
*/			

public class RoundingMillions 
{	
	public static void main(String[] args) 
	{
		//System.out.println( Math.rou(new Double(942208)));
		//double roundedNumber = Math.round(7996830 / 1000000.0) * 1000000.0;
		//System.out.println(roundedNumber);
		
		for( Object[] o : millionsRounding(  new Object[][]{ 
									{"Nice", 942208},
									{"Abu Dhabi", 1482816},
									{"Naples", 2186853},
									{"Vatican City", 572} 
							} )) 
		{
			System.out.println( o[0].toString() + " : "+ o[1].toString());
		}
		
		System.out.println("------------------------------------------------");
		
		for( Object[] o : millionsRounding(  new Object[][]{ 
									{"Manila", 13923452},
									{"Kuala Lumpur", 7996830},
									{"Jakarta", 10770487} 
							} )) 
		{
			System.out.println( o[0].toString() + " : "+ new BigDecimal(o[1].toString()));
		}
		
	}
	public static Object[][] millionsRounding(Object[][] sa) {
		Object[][] out = new Object[sa.length][sa[0].length];
		
		for(int i=0; i < sa.length; i++ ) {
			out[i][0] = sa[i][0];
			out[i][1] = Math.round( Double.parseDouble( sa[i][1].toString() ) / 1000000.0 ) * 1000000.0;
		}
		return out;
	}
}
