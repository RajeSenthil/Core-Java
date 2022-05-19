package com.te.Access;
import java.util.Scanner;
public class Uniquenum {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		  System.out.println("Enter Any Number");
		    int n=sc.nextInt();
		    int z=UserMainCode.checkSum(n);
		    if(z==1) {
		    	System.out.println("Not Unique");
		    }
		    else
		    	System.out.println("Unique");
	}
	}
