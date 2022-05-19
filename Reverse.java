package com.te.Access;
import java.util.Scanner;
public class Reverse {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Any Number");
	    int n=sc.nextInt();
	    int rev=RevLogic.Rev(n);
	    System.out.println("Reverse Number Is"+rev);
	}

}
