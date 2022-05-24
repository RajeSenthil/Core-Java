package com.te.program5;
import java.util.Scanner;

public class Main5 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Array Limits");
		int num=scanner.nextInt();
        String[] s=new String[num];
        for (int i = 0; i <num; i++) {
			s[i]=scanner.next();
		}
        System.out.println("Enter string to find");
        String s1=scanner.next();
		int n=UserCode5.getElementposition(s,s1);
        System.out.println(n);
	}

}
