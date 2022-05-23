package com.te.assignment4;
import java.util.Scanner;
public class Main7 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter Any Number");
        double num=scanner.nextInt();
        String digits=UserCode7.findNodigits(num);
        System.out.println(digits);
	}

}
