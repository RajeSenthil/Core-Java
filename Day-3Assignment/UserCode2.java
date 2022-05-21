	package com.te.assignment3;

public class UserCode2 {
	
	public static int getBigdiff(int[] a) {
		int temp,largenum,smallnum,diff;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		largenum=a[a.length-1];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		smallnum=a[a.length-1];
		diff=largenum-smallnum;
		return diff;
	}

}
