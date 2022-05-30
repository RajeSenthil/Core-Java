package com.te.program5;
import java.util.ArrayList;
import java.util.Scanner;
public class Main1 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Limits");
	     int num=scanner.nextInt();	
           
	     ArrayList<Integer> alist=new ArrayList<Integer>(num);
	     ArrayList<Integer> alist1=new ArrayList<Integer>(num);
	     
	     for (int i = 0; i <num; i++) {
			
	    	 Integer j=scanner.nextInt();
	    	 alist.add(j);
		}
	     
	     for (int i = 0; i <num; i++) {
				
	    	 Integer j=scanner.nextInt();
	    	 alist1.add(j);
		}
	     
	     alist=UserMain4.arrayListSUbtractor(alist,alist1);
         
	     System.out.println(alist);

	}

}
