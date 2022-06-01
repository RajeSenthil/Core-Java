package com.te.program4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UserMain4 {
	
	public static List<String> obtainDesignation(Map<String, String>map,String designation) {
		List<String> li=new ArrayList<String>();
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext()) {
		String name=itr.next();
		if(map.get(name).equals(designation)) {
		li.add(name);
	}

}
		return li;
	}

}
