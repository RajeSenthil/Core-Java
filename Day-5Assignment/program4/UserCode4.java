package com.te.program4;

public class UserCode4 {
	
	public static String removeEvenVowels(String s) {
		String evenappend="";
		StringBuffer stringBuffer=new StringBuffer();
		StringBuffer stringBuffer1=new StringBuffer();
		String s1="",s2="";
		s1=stringBuffer.append(s.charAt(0)).toString();
			
		for (int i = 1; i < s.length(); i++) {
			
		if(i%2!=0) {
			switch (s.charAt(i)) {
			case 'a':
				continue;
			case 'e':
				continue;
			case 'i':
				continue;
			case 'o':
				continue;
			case 'u':
				continue;
				
			default:
				s2=stringBuffer1.append(s.charAt(i)).toString();
				continue;
			}
		}
		else if(i%2==0) {
		s2=stringBuffer1.append(s.charAt(i)).toString();
	}
		}
		evenappend=s1.concat(s2);
		return evenappend;
}
}
