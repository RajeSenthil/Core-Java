package com.te.program2;

import java.util.ArrayList;

public class UserMain2 {
	
	public static ArrayList<String> matchCharacter(String[] s) {
		
		ArrayList<String> alist=new ArrayList<String>();
		
		for (int i = 0; i < s.length; i++) {
			
			if(s[i].charAt(0) == 'a'|| s[i].charAt(0) =='e' || s[i].charAt(0) =='i' || s[i].charAt(0) =='o' || s[i].charAt(0) =='u'){
				if(s[i].charAt(s[i].length()-1)=='a'|| s[i].charAt(s[i].length()-1)=='e' || s[i].charAt(s[i].length()-1)=='i' || s[i].charAt(s[i].length()-1)=='o' || s[i].charAt(s[i].length()-1)=='u')
			{
			
				alist.add(s[i]);
				
			}}
		}
		
		return alist;
		
	}

}
