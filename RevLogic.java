package com.te.Access;

public class RevLogic {
	
	public static int Rev(int num) {
		int rev=0,temp=0;
		while(num>0) {
			temp=num%10;
			rev=rev*10+temp;
			num/=10;
		}
		return rev;
		
	}

}
