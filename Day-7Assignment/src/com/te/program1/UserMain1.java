package com.te.program1;

import java.util.ArrayList;

public class UserMain1 {
	
	public static ArrayList<Integer> sortMergeArrayList(ArrayList<Integer>alist1, ArrayList<Integer>alist2) {
		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		
		alist1.addAll(alist2);
		alist1.sort(null);
		System.out.println(alist1);
		
		Integer i=alist1.get(2);
		Integer j=alist1.get(6);
		Integer k=alist1.get(8);
		
		alist.add(i);
		alist.add(j);
		alist.add(k);
		
		return alist;
	}

}
