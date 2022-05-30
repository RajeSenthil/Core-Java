package com.te.program2;
import java.util.ArrayList;
import java.util.Scanner;
public class Main2 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Limits");
     int num=scanner.nextInt();	
		String[] strings=new String[num];
		ArrayList<String> alist=new ArrayList<String>();
		
		for (int i = 0; i < num; i++) {
			
			strings[i]=scanner.next();
			
		}
		
		alist=UserMain2.matchCharacter(strings);
		
		System.out.println(alist);
	}

}
