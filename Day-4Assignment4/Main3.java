package com.te.assignment4;

import java.util.Scanner;

public class Main3 {

	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int limits;
		System.out.println("Enter Array Limits");
        limits=scanner.nextInt();
    	int[] a=new int[limits];
        for(int i=0;i<limits;i++) {
        			a[i]=scanner.nextInt();
        }
        boolean check=UserCode3.checkTriplets(a);
        System.out.println(check);


	}

}
