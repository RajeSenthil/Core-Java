package com.te.assignment4;
import java.util.Scanner;

public class UserCode2 {
	
	public static int addAndReverse(int[] a) {
		System.out.println("Enter one number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int sum=0,rev=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>num) {
				sum+=a[i];
			}
			
		}
		int temp=0;
		while(sum>0) {
			temp=sum%10;
			rev=rev*10+temp;
			sum/=10;
		}
		
	    return rev;
		
	}

}
