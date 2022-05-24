package com.te.program3;

public class UserCode3 {
	
	public static String formNewWord(String s, int num) {
		
		int n=s.length()-num;
		StringBuffer stringBuffer=new StringBuffer();
		StringBuffer stringBuffer1=new StringBuffer();
		String s1="",s2="",append="";
		
		if(s.length()>=2*num) {
		
			for (int i = 0; i<num; i++) {
				
	        s1=stringBuffer.append(s.charAt(i)).toString();
			}
		
			for (int i =n; i < s.length(); i++) {
				
			   s2=stringBuffer1.append(s.charAt(i)).toString();
			}
			
		 	 
	}
		append=s1.concat(s2);
		return append;

}

}