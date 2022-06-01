package com.te.program4;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main4 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Map<String,String> map=new HashMap<String, String>();
		
		System.out.println("Enter limits");
		int limit=scan.nextInt();
		for (int i = 0; i < limit; i++) {
			
			map.put(scan.next(), scan.next());
		}
		
		System.out.println("Enter Designation");
		String designation=scan.next();
		
		List<String> li=UserMain4.obtainDesignation(map,designation);
		Collections.sort(li);
		for (String string : li) {
			System.out.println(string);	
		}
		

	}

}
