package com.games;

/*
	You will be given a collection of five cards (representing a player's hand in poker). 
	If your hand contains at least one pair, return the card number of the highest pair 
	(trivial if there only exists a single pair). Else, return "".
	
	Examples
	highestPair(["A", "A", "Q", "Q", "6" ]) ➞ "A"
	
	highestPair(["J", "6", "3", "10", "8"]) ➞ ""
	
	highestPair(["K", "7", "3", "9", "3"]) ➞ "3"
	
	highestPair(["K", "9", "10", "J", "Q"]) ➞ ""
	
	highestPair(["3", "5", "5", "5", "5"]) ➞ "5"
	Notes
	Hands with three or more of the same card still count as containing a pair (see the last example).
*/
public class HighestPair {

	public static void main(String[] args) {
		System.out.println(highestPair(new String[] {"A", "A", "Q", "Q", "6"}));  // A
		System.out.println(highestPair(new String[] {"J", "6", "3", "10", "8"})); // 
		System.out.println(highestPair(new String[] {"K", "7", "3", "9", "3"}));  // 3
		System.out.println(highestPair(new String[] {"K", "9", "10", "J", "Q"})); // 
		System.out.println(highestPair(new String[] {"3", "5", "5", "5", "5"}));  // 5		
	}
	
	public static String highestPair(String [] sa) {
		String str="",out = "";		
		int high = 0;
		
		for(String s: sa)
			str += s;
		
		str = str.replaceAll(",", "");
		
		for(int i=0; i<str.length(); i++) {
			if( (i+1) < str.length()   &&   str.indexOf( str.charAt(i), i+1 ) > 0 ) {
				if( (""+str.charAt(i)).equals("A") ) {
					out = ""+str.charAt(i);
					break;
				}else if( (""+str.charAt(i)).equals("K") ) {
					out = ""+str.charAt(i);
					break;
				}else if( (""+str.charAt(i)).equals("Q") ) {
					out = ""+str.charAt(i);
					break;
				}else if( (""+str.charAt(i)).equals("J") ) {
					out = ""+str.charAt(i);
					break;
				}else if( Integer.parseInt(""+str.charAt(i)) > high ) {
					high = Integer.parseInt(""+str.charAt(i));					
				}
			}	
		}
		if( high > 0 )
			out = ""+high;
		
		return out;
	}
	
	public static String highestPair1(String [] sa) {
		String out ="", out1="";
		
		for(int i=0; i<sa.length; i++) {
			for(int j=i+1; j<sa.length; j++) {
				if( sa[i].equals(sa[j]) ) {
					out += sa[i];
				}
			}
		}
		
		if(out.length() > 1) {
			out1 = "";
			int lnum = 0;
			
			for(int i=0; i<out.length(); i++) {
				if( (""+out.charAt(i)).equals("A") ) {
					out1 = ""+out.charAt(i);
					break;
				} else if( (""+out.charAt(i)).equals("K") ) {
					out1 = ""+out.charAt(i);
					break;
				} else if( (""+out.charAt(i)).equals("Q") ) {
					out1 = ""+out.charAt(i);
					break;
				} else if( (""+out.charAt(i)).equals("J") ) {
					out1 = ""+out.charAt(i);
					break;
				} else if( Integer.parseInt( "" +out.charAt(i)) > lnum ) {
					lnum = Integer.parseInt( "" +out.charAt(i));
				}
			}
			if( lnum > 0 )
				out1 = ""+lnum;
		
			out = out1;
		}
			
		
		
		/*
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String sss : sa) {
			if(map.containsKey(sss) )
				map.put(sss, map.get(sss)+1);
			else
				map.put(sss, 1);
		}
		for()
		*/
		return out;
	}
}
