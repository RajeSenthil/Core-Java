package com.te.program4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main4 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=scanner.nextInt();
		String[] strings=new String[num];
		for (int i = 0; i < num; i++) {
			
		strings[i]=scanner.next();
		}
		
		ArrayList<String> alList=new ArrayList<String>();
		
		for (int i = 0; i < strings.length; i++) {
			
			alList.add(strings[i]);
		}
		
		String[] s=UserMain4.convertToStringArray(alList);
		System.out.println(Arrays.toString(s));
	}

}
