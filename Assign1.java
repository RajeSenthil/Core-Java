package com.te.Access;
import java.util.Scanner;
public class Assign1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		 System.out.println("Enter Any Number");
		    int n=sc.nextInt();
		    int z=UserCOde.oddDigits(n);
		    if(z==1) {
		    	System.out.println("Sum Of Odd Digits Is Odd");
		    }
		    else
		    	System.out.println("Sum Of Odd Digits Is Even");

	}

}
