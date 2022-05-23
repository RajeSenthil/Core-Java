package com.te.assignment4;
import java.util.Scanner;
public class Main2 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		int limits;
		System.out.println("Enter Array Limits");
        limits=scanner.nextInt();
    	int[] a=new int[limits];
        for(int i=0;i<limits;i++) {
        			a[i]=scanner.nextInt();
        }
        int arr=UserCode2.addAndReverse(a);
        System.out.println("Removed Array is"+arr);

	}

}
