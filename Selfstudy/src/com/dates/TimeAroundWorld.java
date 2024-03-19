package com.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.HashMap;

/*
	In this challenge, the goal is to calculate what time it is in two different cities. 
	You're given a string cityA and the related string timestamp (time in cityA) 
	with the date formatted in full U.S. notation, as in this example:
	
	"July 21, 1983 23:01"
	You have to return a new timestamp with date and corresponding time in cityB, formatted as in this example:
	
	"1983-7-22 23:01"
	See the table below for a list of given cities and their GMT (Greenwich Mean Time) hours offsets.
	
	GMT	City
	- 08:00	Los Angeles
	- 05:00	New York
	- 04:30	Caracas
	- 03:00	Buenos Aires
	00:00	London
	+ 01:00	Rome
	+ 03:00	Moscow
	+ 03:30	Tehran
	+ 05:30	New Delhi
	+ 08:00	Beijing
	+ 10:00	Canberra
	Examples
	timeDifference("Los Angeles", "April 1, 2011 23:23", "Canberra") ➞ "2011-4-2 17:23"
	// Can be a new day.
	
	timeDifference("London", "July 31, 1983 23:01", "Rome") ➞ "1983-8-1 00:01"
	// Can be a new month.
	
	timeDifference("New York", "December 31, 1970 13:40", "Beijing") ➞ "1971-1-1 02:40"
	// Can be a new year.
	Notes
	Pay attention to hours and minutes, a leading 0 is needed in the returned timestamp when they're a single digit.
	Pay attention to cities with half hours offsets.
*/

public class TimeAroundWorld 
{
	public static Map<String,String> cities = new HashMap<String,String>();
	
	static
	{
		cities.put("Los Angeles","-08:00");
		cities.put("New York","-05:00");
		cities.put("Caracas","-04:30");
		cities.put("Buenos Aires","-03:00");
		cities.put("London","0:00");
		cities.put("Rome","+01:00");
		cities.put("Moscow","+03:00");
		cities.put("Tehran","+03:30");
		cities.put("New Delhi","+05:30");
		cities.put("Beijing","+08:00");
		cities.put("Canberra","+10:00");

	}
	
		

	public static void main(String[] args) {
		System.out.println(timeDifference("Los Angeles", "April 12, 2011 23:23", "Canberra"));

	}
	public static String timeDifference(String srcCity, String srcDt, String desCity) 
	{		
		final DateTimeFormatter srcDTF = DateTimeFormatter.ofPattern("MMMM d yyyy HH:mm");
		final DateTimeFormatter desDTF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime srcDateTime = LocalDateTime.parse(srcDt.replace(",", ""), srcDTF);
		
		int hours  = Integer.parseInt( cities.get(srcCity).split(":")[0] );
		int mins   = Integer.parseInt( cities.get(srcCity).split(":")[1] ) * (hours < 0 ? -1 : 1); 
		
		LocalDateTime desDateTime, lonDateTime = srcDateTime.plusHours( hours );
		lonDateTime = lonDateTime.plusMinutes( mins );
		System.out.println(lonDateTime);
		
		hours = Integer.parseInt( cities.get(desCity).split(":")[0] );
		mins  = Integer.parseInt( cities.get(desCity).split(":")[1] ) * (hours < 0 ? -1 : 1); 
		
		desDateTime = lonDateTime.plusHours( hours );
		desDateTime = desDateTime.plusMinutes( mins );
		System.out.println(desDateTime);
		
		return desDateTime.format(desDTF);
	} 
	public String lpad(String s, String pw, int len) {
		int c=0, l = len - s.length();
		while( c++ < l)
			s = pw+s;
		return s;
	}
}
