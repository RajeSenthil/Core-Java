package com.te.program1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> aList=new ArrayList<Integer>();
		ArrayList<Integer> alist1=new ArrayList<Integer>();
		int n=5;
		System.out.println("Enter one arraylist");
		for (int i = 0; i < n; i++) {
			
			int j=scanner.nextInt();
			aList.add(j);
			
		}
		
		System.out.println(aList);
		
		System.out.println("Enter another arraylist");
		for (int i = 0; i < n; i++) {
			
			int j=scanner.nextInt();
			alist1.add(j);
			
		}	
		
		System.out.println(alist1);
		
		ArrayList<Integer> alist2=new ArrayList<Integer>();
	   alist2= UserMain1.sortMergeArrayList(alist1,aList);
       System.out.println(alist2);
	}

}
