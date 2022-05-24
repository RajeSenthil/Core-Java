package com.te.program1;

public class UserCode1 {
	
	public static String getMiddleChars(String s) {
		
		int count=0;String s2="";
		StringBuffer stringBuffer=new StringBuffer();
		
		for (int i = 0; i < s.length(); i++) {
			
			count++;
			
		}
		if(count%2==0) {
		
			int a=s.length()/2,b=s.length()/2-1;
			s2=stringBuffer.append(s.charAt(b)).append(s.charAt(a)).toString();
		}
		
		return s2;
	}

}
