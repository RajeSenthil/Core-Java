package com.te.program3;

import java.util.Iterator;
import java.util.Map;

public class UserMain3 {
	
	public static Integer getYear(Map<Integer, Integer> map) {
		int temp=0,temp1=0;
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext()) {
			int year=itr.next();
			int fix=map.get(year);
			if(temp<fix) {
			temp=fix;
			temp1=year;
		}
			
	}
		return temp1;

}

}
