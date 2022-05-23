package com.te.assignment4;

public class UserCode4 {
	
	public static int calculateMedian(int[] a) {
		int temp=0;
		int sum=0,avg=0;
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		
		if(a.length%2!=0) {
			
			return a[a.length/2];
		}
		
		else {
		
			sum=a[a.length/2]+ a[a.length/2-1];
			avg=sum/2;
			int median=(int)Math.round(avg);
			
			return median;
		}
	}

}
