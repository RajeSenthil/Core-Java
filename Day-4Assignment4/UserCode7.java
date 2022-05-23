package com.te.assignment4;

public class UserCode7 {
	public static String findNodigits(double num) {
		
		String s=String.valueOf(num);
		String[] sarray= s.split("\\.");
		int count=0;
		String s1=sarray[0];
		
		for (int i = 0; i < s1.length(); i++) {
		count++;	
		}
		int count1=0;
		String s2=sarray[1];
		for (int i = 0; i < s2.length(); i++) {
			count1++;
		}
		s= count+":"+count1;
		return s;
	}
	
}