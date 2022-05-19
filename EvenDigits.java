package com.te.Access;
import java.util.Scanner;
public class EvenDigits {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Any Number");
	    int n=sc.nextInt();
	    int z=SumEven.checkSum(n);
	    if(z==1) {
	    	System.out.println("Sum Of Even Digits Is Even");
	    }
	    else {
	    	System.out.println("Sum Of Even Digits Is Odd");
	    }

	}

}