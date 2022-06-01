package com.te.program5;

import java.util.HashMap;
import java.util.Map;

public class UserCode5 {
	
	public static Map<String, String> getStateId(String[] states) {
	
		Map<String, String> map=new HashMap<>();
		
		String[] code=new String[states.length];
		
		for (int i = 0; i < code.length; i++) {
			
			code[i]=states[i].substring(0, 3).toUpperCase();
			
		}
		
		for (int i = 0; i < code.length; i++) {
			
			map.put(states[i], code[i]);
			
		}
		
		return map;
		
	}

}
