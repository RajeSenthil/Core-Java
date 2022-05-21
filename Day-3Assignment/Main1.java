package com.te.assignment3;

import java.util.Scanner;

public class Main1 {
static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		int limits=0;
		System.out.println("Enter Array Limits");
        limits=scanner.nextInt();
    	int[] a=new int[limits];
        for(int i=0;i<limits;i++) {
        			a[i]=scanner.nextInt();
        }
        int sum=UserCode1.getSumOfPower(a);
        System.out.println(sum);

	}

}
