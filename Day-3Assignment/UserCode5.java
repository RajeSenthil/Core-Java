package com.te.assignment3;

public class UserCode5 {
	
	public static int sumCommonelements(int[] a, int[] b) {
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			
		for (int j = 0; j < b.length; j++) {
			
			if(a[i]==b[j]) {
				sum+=a[i];
			}
			
		}	
			
		}
		
		if(sum>0) {
			return sum;
		}
		else
			return -1;
		
	}

}
