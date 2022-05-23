package com.te.assignment4;

public class UserCode6 {

	public static boolean getPerfection(int num) {
		int sum=0;
		for (int i = 1; i <num; i++) {
			
			if(num%i==0) {
				sum+=i;
			}
			
		}
		
		if(sum==num) {
			
			return true;
		}
		
		else
			
			return false;
		
	}
}
