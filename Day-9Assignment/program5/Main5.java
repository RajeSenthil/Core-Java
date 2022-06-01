package com.te.program5;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main5 {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Limits");
       int limit=scan.nextInt();
		String[] states=new String[limit];
		
		for (int i = 0; i < states.length; i++) {
			
			states[i]=scan.next();
		}
		
		Map<String, String>map=UserCode5.getStateId(states);
		
		Iterator<String> itr=map.keySet().iterator();
		
		while (itr.hasNext()) {
			
			String state =itr.next();
			System.out.println(map.get(state)+":"+state);
			
		}
		
	}

}
