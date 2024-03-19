package com.tests2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AvgStudentMarksWithNames {
/*
 *  Take input String [] of students along-with there marks and return avg of their marks without spaces in names;
 * 
 * */
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine(); 
		// name-m1:m2:m3, name2-m1;m2;m3
		/* 
		 Input    ---   Manav Kaushal 7 8 9, Oppo mobile 3 4 6, Bhavna Kaushal -5 6 9, Rega mobile 5 4 3, Aarnav Kaushal:5:10:10, LG mobile 1 4 3, Narayana Group :11:10:9, No mobile 10 10 10
		 Expected ---   Manav Kaushal-8,Oppo mobile-4,Bhavna Kaushal-6,Rega mobile-4,Aarnav Kaushal-8,LG mobile-2,Narayana Group-10,No mobile-10
		*/
		String[] sa= inp.split(",");
		
		int i=0;
		String name, m1,m2,m3,c;
		float avg=0;
		StringBuffer sb = new StringBuffer();
		
		for(String s : sa) {
			name ="";
			m1 = "";
			m2 ="";
			m3 ="";
			avg=0;
			i=0;
			
			
			while( i < 4) {
				for(char ch : s.toCharArray()) {
					c = ""+ch;
					if(i == 0 ) { // name
						if(c.matches("^[a-zA-Z\\s]*$")) {
							name += c;
						} else {
							name = name.trim();
							if(c.matches("^[\\d]*$")) 
								m1 += c;
							i++;
						}
					}
					else if(i == 1 ) { // m1
						if(c.matches("^[\\d]*$")) {
							m1 += c;
						} else if( !m1.equals("")){
							i++;
						}
					}
					else if(i == 2 ) { // m2
						if(c.matches("^[\\d]*$")) {
							m2 += c;
						} else if( !m2.equals("")) {
							i++;
						}
					}
					else if(i == 3 ) { // m2
						if(c.matches("^[\\d]*$")) {
							m3 += c;
						} else if( !m3.equals("")) {
							i++;
						}
					}
					
				}				
			}
			
			System.out.println(name+"_"+m1+"_"+m2+"_"+m3);
			avg = (Integer.parseInt(m1) + Integer.parseInt(m2) + Integer.parseInt(m3))/3;
			sb.append(name+"-"+avg+",");
		}
		System.out.println(sb.toString());
	}
	
	public static void main2(String args[]) {
		Scanner sc = new Scanner(System.in);
		//String inp = sc.nextLine(); // name-m1:m2:m3, name2-m1;m2;m3
		String sss = "Welcome to Toutorialspoint.com d'souza";
		
		//System.out.println(inp.matches("[a-z]"));
		System.out.println(sss.toLowerCase().matches("^[a-zA-Z\\s.']*$"));
	}
	
	public static void main1(String args[]) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine(); // name-m1:m2:m3, name2-m1;m2;m3
		String out = "";
		int i =0;
		String sm1,sm2,sm3,name = "";
		StringBuffer sb = new StringBuffer();
		float avg = 0;
		
		
		boolean isName, isNum, isM1, isM2, isM3;
		
		String[] stuMarks = inp.split(",");
		
		for(String stu : stuMarks) {
			i=0;
			isName = true;
			isM1 = false; 
			isM2 = false; 
			isM3 = false;
			name = "";
			sm1="";
			sm2="";
			sm3="";
			String c = "";
			
			while(i < stu.length()) 
			{
				c = ""+stu.charAt(i);
				
				if( isName) {
					if( c.matches("^[a-zA-Z\\s.']*$") )
						name += c;
					else {
						isName = false;
						name = name.trim();
						isM1   = true;
					}
				}
				
				if( c.matches("^[\\d.]*$")) {
					if(isM1)
						sm1 += c;
					else if(isM2)
						sm2 += c;
					else if(isM3)
						sm3 += c;
				}
				else {
					if( isM1 && !sm1.equals("")) {
						isM1 = false;
						isM2 = true;						
					} else  if( isM2 && !sm2.equals("")) {
						isM2 = false;
						isM3 = true;
					}					
				}
				
				i++;
			}
			//System.out.println(name+"_"+sm1+"_"+sm2+"_"+sm3);
			avg = (Float.parseFloat(sm1) + Float.parseFloat(sm2) + Float.parseFloat(sm3) ) /3; 
			
			sb.append(name+"-"+avg+",");
		}
		
		System.out.println(sb.toString());
	}
	

	
	
	public static void main0(String[] args) {
		String[] students = new String[4];
		students[0] = "Manav Kaushal 7 8 9, Oppo mobile 3 4 6";
		students[1] = "Bhavna Kaushal -5 6 9, Rega mobile 5 4 3";
		students[2] = "Aarnav Kaushal:5:10:10, LG mobile 1 4 3";
		students[3] = "Narayana Group :11:10:9, No mobile 10 10 10";
		
		String output = "", tmp;
		StringBuffer sb = null;
		Integer totMarks, cntMarks;
		String[] outputArr = new String[students.length];
		int row = 0;
		
		for(String sm : students) {
			String[] smarks = sm.split(",");
			output = "";
			for( String s : smarks ) {
				totMarks = 0;
				cntMarks = 0;
				tmp = "";
				sb = new StringBuffer();
				boolean capturedName = false;
				
				for(int i=0; i < s.length(); i++) {
					try {
						System.out.println( s.charAt(i));
						if( Integer.parseInt(""+s.charAt(i)) >= 0 ) {
							tmp += ""+s.charAt(i);
							capturedName = true;
						} 
					}catch(Exception e) {
						if( !capturedName ) {
							sb.append(""+s.charAt(i));
						}
						else if( capturedName && Integer.parseInt(tmp) <= 10) {
							totMarks += Integer.parseInt(tmp);
							cntMarks++;
							tmp = "";
						}else
							tmp ="";
					}
					
					
				}
				if( capturedName && Integer.parseInt(tmp) <= 10) {
					totMarks += Integer.parseInt(tmp);
					cntMarks++;
					tmp = "";
				}
				output += sb.toString().trim() + "-" + (Integer)(totMarks / cntMarks) + ";";
				
			}
			outputArr[row++] = output;
		}
		
		for(String ss : outputArr)
			System.out.println("Output : "+ ss);
	}
}
