package com.te.program2;

import java.util.Iterator;
import java.util.Map;

public class UserMain2 {
	
public static String getCapital(Map<String, String> map,String capital) {
		
		Iterator<String> itr=map.keySet().iterator();
		String capstate="";
		while(itr.hasNext()) {
		
			String state=itr.next();
			if(map.get(state).equals(capital)) {
			   capstate=capital+"$"+state;
			}
			
	}
return capstate;
}

}
