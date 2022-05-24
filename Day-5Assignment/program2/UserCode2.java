package com.te.program2;

public class UserCode2 {
	
	public static int checkCharacters(String s) {
		
		int a=s.length()-1,b=0;
		if(s.charAt(a)==s.charAt(b))
		{
		return 1;
	}

		else {
			return -1;
		}
}
}
