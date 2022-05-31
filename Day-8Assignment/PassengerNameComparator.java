package com.te.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PassengerNameComparator implements Comparator<Seat> {

	static Scanner scan=new Scanner(System.in);
	@Override
	public int compare(Seat o1, Seat o2) {
		// TODO Auto-generated method stub
		return o1.getPassengerName().compareTo(o2.getPassengerName());
	}
	
	public static void main(String[] args) {
		
		List<Seat> list=new ArrayList<Seat>();
		System.out.println("Enter The no.of seats");
		int seat=scan.nextInt();
		String[] s=new String[seat];
		
		for (int i = 0; i < s.length; i++) {
			
			s[i]=scan.next();
			list.add(Seat.createSeat(s[i]));		
		}
		System.out.format("%-8s %-12s %-5s %-15s %s\n","SeatNo","Type","Price","PassengerName","Gender");
		for (Seat before : list) {
			
			System.out.println(before);
		}
		
		System.out.println("After Sorting withrespect to Seatno");
		Collections.sort(list);
        for (Seat seatno : list) {
			
			System.out.println(seatno);
		}
		
		
		System.out.println("After Sorting Withrespect to name");
		Collections.sort(list, new PassengerNameComparator());
        for (Seat name : list) {
			
			System.out.println(name);
		}
		
	}

}
