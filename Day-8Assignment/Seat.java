package com.te.comparable;


public class Seat implements Comparable<Seat> {
	
	private Integer seatNo;
	private String type;
	private Double price;
	private String passengerName;
	private String gender;
	public Integer getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(Integer seatNo) {
		this.seatNo = seatNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
		
	}
	
	public Seat(Integer seatNo, String type, Double price, String passengerName, String gender) {
		super();
		this.seatNo = seatNo;
		this.type = type;
		this.price = price;
		this.passengerName = passengerName;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return String.format("%-8s %-12s %-5s %-15s %s\n",seatNo,type,price,passengerName,gender);
	}
	
	public static Seat createSeat(String s) {
		
		
		String[] strarr=s.split(",");
		
		return	new Seat(Integer.parseInt(strarr[0]),strarr[1],Double.parseDouble(strarr[2]),strarr[3],strarr[4]);
	 
	
	
}
	@Override
	public int compareTo(Seat o) {
		// TODO Auto-generated method stub
		return this.seatNo-o.getSeatNo();
	}

}
