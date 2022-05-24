package com.te.program5;

public class UserCode5 {
	
	public static int getElementposition(String[] s,String s1) {
		
		String temp="";int count=0;
		
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				
				if(s[i].charAt(0) < s[j].charAt(0)) {
					
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
				
			}
		}
		
			for (int i = 0; i < s.length; i++) {
			
			if(s[i].equals(s1)) {
				
			count=i+1;
				
			}
		}
			
			return count;
	}

}
