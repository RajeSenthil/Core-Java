package com.te.assignment3;

public class UserCode3 {
	
	public static int checkLargestamongCorner(int[] a) {
		
		int num1,num2,num3;
		int i=a.length-1;
		num1=a[0];
		num2=a[i/2];
		num3=a[i];
		
		if(num1>num2 && num1>num3) {
			return num1;
		}
		else if(num2>num3) {
			return num2;
		}
		else {
			return num3;
		}
			
	}

}
