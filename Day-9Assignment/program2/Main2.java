package com.te.program2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Map<String,String> map=new HashMap<String, String>();
		
		System.out.println("Enter limits");
		int limit=scan.nextInt();
		for (int i = 0; i < limit; i++) {
			
			map.put(scan.next(), scan.next());
		}
		
		System.out.println("Enter Capital");
		String capital=scan.next();
		
		String s=UserMain2.getCapital(map,capital);
		System.out.println(s);

	}

}
