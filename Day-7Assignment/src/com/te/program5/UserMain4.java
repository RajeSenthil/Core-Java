package com.te.program5;

import java.util.ArrayList;

public class UserMain4 {

	public static ArrayList<Integer> arrayListSUbtractor(ArrayList<Integer> alist,ArrayList<Integer> alist1) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.addAll(alist);
		
		alist.removeAll(alist1);
		alist1.removeAll(list);
				
		alist.addAll(alist1);
		
		return alist;
	
}
	
}
