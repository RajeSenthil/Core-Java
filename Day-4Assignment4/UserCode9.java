package com.te.assignment4;

public class UserCode9 {
	
	public static int sumElements(int[] a) {
		
	int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
		if(a[i]==a[j]) {
			a[i]=0;
			a[j]=0;
		}}}
		for (int i = 0; i < a.length; i++) {
			
		if(a[i]%2==0) {
			sum+=a[i];
		}
		
	}
		
		if(sum==0) {
			return -1;
		}
		else 
			return sum;
		
}
		
		
	}
		
