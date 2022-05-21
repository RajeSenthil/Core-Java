package com.te.assignment3;

public class UserCode4 {
	
	public static double averageElements(int[] a) {
		double times=0,sum=0,avg=0;
		for (int i = 2; i < a.length; i++) {
			int count=0;
			for (int j=1; j <=i; j++) {
				
			   if(i%j==0) {
				   count++;
			}
			}
			   if(count==2) {
				times++;   
				 sum+=a[i];
				   
			   }
		}
		avg=sum/times;
		return avg;
	}
		
	}

