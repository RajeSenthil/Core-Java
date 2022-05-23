package com.te.assignment4;

public class UserCode8 {
	
	public static int getLargestSpan(int[] a) {
		
		int diff=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
			if(a[i]==a[j]) {
				
				diff=j-i+1;
			}
			
		}
		
	}
		return diff;
		
	}
}
