package com.te.program3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		
		System.out.println("Enter limits");
		int limit=scan.nextInt();
		for (int i = 0; i < limit; i++) {
			
			map.put(scan.nextInt(), scan.nextInt());
		}
		
		Integer s=UserMain3.getYear(map);
		System.out.println(s);

	}

}
