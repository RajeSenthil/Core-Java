package com.te.assignment4;

public class UserCode3 {
	
	public static boolean checkTriplets(int[] a) {
		boolean check=false;
		for (int i = 0; i < a.length-2; i++) {
			
			if(a[i]==a[i+1]&&a[i]==a[i+2]) {
             
				check=true;
				break;
				
			}
			
		}
		return check;
		
	}

}
