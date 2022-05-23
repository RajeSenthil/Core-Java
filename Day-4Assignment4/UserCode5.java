package com.te.assignment4;

public class UserCode5 {
	
	public static boolean searchSequence(int[] a) {
	boolean check=false;
	for (int i = 0; i < a.length-2; i++) {
		
		if(a[i]==1) {
		if( a[i+1]==a[i]+1 && a[i+2]==a[i]+2) {
         
			check=true;
			break;
			
		}
		}
		
	}
	return check;
}
}
