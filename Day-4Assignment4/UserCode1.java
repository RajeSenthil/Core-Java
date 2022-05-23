package com.te.assignment4;

public class UserCode1 {
	public static int[] removeTens(int[] a) {
		int[] b=new int[a.length];
		int k=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%10!=0) {
		b[k]=a[i];
		k++;
	}

		}
		return b;
}
}
