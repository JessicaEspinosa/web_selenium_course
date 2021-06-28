package com.tickets;

public class CoolParkTicket extends TicketsPark{
	
	double adultTicket;
	double childTicket;
	double studentTicket;
	boolean student = false;
	String priceDay;
	String park;
	int age;
	
	public CoolParkTicket() {
		// TODO Auto-generated constructor stub
	}
	
	

	public CoolParkTicket(double price, boolean student, int age) {
		super();
		this.adultTicket = price;
		this.childTicket = price * (0.80);
		this.studentTicket = price * (0.5);
		this.student = student;
		this.priceDay = " Precio Dia regular";
		this.park = "Cool Park";
		this.age = age;
	}

	
	//Encapsulamiento 
	private void setPriceDay(String priceDay) {
		this.priceDay = priceDay;
	}
	
	private String getPriceDay() {
		return priceDay;
	}
	
	


	@Override
	public double getTicketPrice() {
		double priceTicket;
		
		if(age>=18 && !student) {
			priceTicket = adultTicket;
			System.out.println("Precio Adulto: $ "+adultTicket);
		} else if (age>=18  && student)
			priceTicket = studentTicket;
		else
			priceTicket = childTicket;
		
		return 0;
	}

	@Override
	public void printPriceDay() {
		// TODO Auto-generated method stub
		
	}

}
