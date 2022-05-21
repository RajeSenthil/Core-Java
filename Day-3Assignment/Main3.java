package com.te.assignment3;
import java.util.Scanner;
public class Main3 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		int limits=0;
		System.out.println("Enter Array Limits");
        limits=scanner.nextInt();
    	int[] a=new int[limits];
        for(int i=0;i<limits;i++) {
        			a[i]=scanner.nextInt();
        }
        if(a.length>1 && a.length%2!=0) {
        int large=UserCode3.checkLargestamongCorner(a);
        System.out.println(large);
        }
        else if(a.length==1)
        {
        	for (int i = 0; i < a.length; i++) {
				
        	System.out.println("Only one element present in array that is  "+a[i]);
        }

	}

}
}
