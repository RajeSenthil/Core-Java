package com.te.assignment3;

public class UserCode1 {
	
	public static int getSumOfPower(int[] num) {
		
		int sum=0;
	
		for (int i = 0; i < num.length; i++) {
		
              int power=(int)Math.pow(num[i], i);
              sum+=power;     	
		}
		return sum;
}
		
}
