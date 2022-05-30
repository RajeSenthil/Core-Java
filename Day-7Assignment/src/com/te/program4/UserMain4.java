package com.te.program4;

import java.util.ArrayList;

public class UserMain4 {
	
	public static String[] convertToStringArray(ArrayList<String> alist) {
		
		alist.sort(null);
		String[] strings=new String[alist.size()];
		
		for (int j = 0; j < alist.size(); j++) {
			
		strings[j]=alist.get(j);
		
		}
		return strings;
		
	}

}
