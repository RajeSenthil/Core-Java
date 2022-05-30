package com.te.program3;

import java.util.ArrayList;

public class UserMain3 {
	
	public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> alist) {
	
		ArrayList<Integer> alArrayList=new ArrayList<Integer>();
		
		for (int i =0; i < alist.size(); i++) {
		      
			if((i+1)%3!=0) {
				
				alArrayList.add(alist.get(i));
				
			}
		}
		
		return alArrayList;

}
}
