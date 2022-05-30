package com.te.program3;
import java.util.ArrayList;
import java.util.Scanner;
public class Main3 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=scanner.nextInt();
		ArrayList<Integer> aList=new ArrayList<Integer>(num);
		ArrayList<Integer> aList1=new ArrayList<Integer>(num);
		for (int i = 0; i < num; i++) {
			
			int j=scanner.nextInt();
			aList.add(j);
		}
		
		aList1=UserMain3.removeMultiplesOfThree(aList);
		System.out.println(aList1);
		
	}

}
