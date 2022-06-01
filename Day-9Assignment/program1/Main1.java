package com.te.program1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
	
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<Integer, String>();
		System.out.println("Enter limits");
		int limit=scan.nextInt();
		for (int i = 0; i < limit; i++) {
			
			map.put(scan.nextInt(), scan.next());
		}
		
		String s=UserCode1.getMaxKeyValue(map);
		System.out.println(s);
	}

}
