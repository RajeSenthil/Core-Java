package com.te.assignment4;
import java.util.Scanner;
public class Main6 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter Any Number");
        int num=scanner.nextInt();
        boolean check=UserCode6.getPerfection(num);
        System.out.println(check);

	}

}
