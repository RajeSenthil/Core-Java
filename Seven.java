package com.te.Access;
import java.util.Scanner;
public class Seven {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Any Number");
	    int n=sc.nextInt();
	    int z=SevenLogic.countSeven(n);
	    if(z==1) {
	    	System.out.println("7 is not present");
	    }
	    else
	    	System.out.println("7 is present");

	}

}
