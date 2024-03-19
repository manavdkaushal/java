package com.dates;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.Assert;

/*
	The 2nd of February 2020 is a palindromic date in both dd/mm/yyyy and mm/dd/yyyy format (02/02/2020).
	
	February 2, 2020 is the only 2-digit month and day palindromic date that will occur in the 21st century. 
	The next occurrence of a 2-digit month and day palindromic date will be December 12, 2121, 
	which is exactly 101 years from the last occurrence. 101 is also a palindrome. 
	Between the years, 3030 and 9090, exactly 1010 years separate each 
	occurrence of a 2-digit month and day palindromic date.
	
	Given a date in mm/dd/yyyy format and the number of years to scan, 
	return an array containing palindromic dates in mm/dd/yyyy format 
	that are palindromic in both dd/mm/yyyy and mm/dd/yyyy format.
	
	Examples
	palindromicDates("01/01/2020",100) ➞ {"02/02/2020"}
	
	palindromicDates("01/01/2020",102) ➞ {"02/02/2020", "12/12/2121"}
	Notes
	This is an adaptation of the Palindromic Date Challenge.
*/
public class PalindromicDate 
{
	
	@Test public void test1() { 
		assertEquals(new String[]{"02/02/2020"}, palindromicDates("01/01/2020",100));
	}
	@Test public void test2() { 
		assertEquals(new String[]{"02/02/2020", "12/12/2121"}, palindromicDates("01/01/2020",102));
	}
	 

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(PalindromicDate.class);
		
		for(Failure fail : result.getFailures())
			System.out.println(fail.toString());
		
		System.out.println("Palidromic Date successful ? : "+result.wasSuccessful());
		
		
		
		//System.out.println(new PalindromicDate().isPalin("02122120"));
		//System.out.println(new PalindromicDate().lpad("ab", "0", 4));
		
		/*LocalDate ld =  LocalDate.now();
		System.out.println(ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));*/
		
		/*String pattern = "MM/dd/yyyy[ 'at' HH:mm:ss]";
	    DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
	    LocalDateTime ldt = LocalDateTime.now();
	    String str1 = fmt.format(ldt);
	    System.out.println(str1);*/
		
		/*final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println( ldt.format(dtf));
		
		String ss = "11-01-1979 19:05:31";
		
		LocalDateTime nldt = LocalDateTime.parse(ss, dtf);
		nldt = nldt.plusSeconds(1);
		System.out.println(nldt.format(dtf));*/
		
		
	}

	public String[] palindromicDates(String s, int yrs) {
		ArrayList<String> lst = new ArrayList<String>();
		String[] sa = null;
		int cnt  = 0;
		final DateTimeFormatter rmdyDTF = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		final DateTimeFormatter mdyDTF  = DateTimeFormatter.ofPattern("MMddyyyy");
		final DateTimeFormatter dmyDTF  = DateTimeFormatter.ofPattern("ddMMyyyy");
		
		try {		
			
			LocalDate dts  = LocalDate.parse(s, rmdyDTF);
			LocalDate dte  = dts.plusYears(yrs);
						
			do 
			{
				if( isPalin( dts.format(mdyDTF) )  &&  isPalin(dts.format(dmyDTF)) )
					lst.add(dts.format(rmdyDTF));
				
				dts = dts.plusDays(1);
				
			} while( !dts.isEqual(dte) );
			
			cnt = 0;
			sa = new String[lst.size()];
			for(String ss : lst)
				sa[cnt++] = ss; 
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return sa;		
	}
	public boolean isPalin(String s) {
		StringBuilder sb = new StringBuilder(s);		
		return s.equals(sb.reverse().toString());
	}
	public String lpad(String s, String pw, int len) {
		int c = 0, l = len-s.length();
		while( c++ < l)
			s = pw+s;
		
		return s;
	}
	
}
