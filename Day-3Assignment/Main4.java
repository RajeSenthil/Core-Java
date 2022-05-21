package com.te.assignment3;
import java.util.Scanner;
public class Main4 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		int limits=0;
		System.out.println("Enter Array Limits");
        limits=scanner.nextInt();
    	int[] a=new int[limits];
        for(int i=0;i<limits;i++) {
        			a[i]=scanner.nextInt();
        }
        if(a.length>1) {
        double avg=UserCode4.averageElements(a);
        
        System.out.format("%.2f",avg);
        }
        else if(a.length==1)
        {
        	for (int i = 0; i < a.length; i++) {
				
        	System.out.println("Only one element present in array that is  "+a[i]);
        }
	}


	}

}
