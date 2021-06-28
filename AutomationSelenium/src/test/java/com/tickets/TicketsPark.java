package com.tickets;

public abstract class TicketsPark {
	
	String welcomeMessage;
	
	public TicketsPark() {
		this.welcomeMessage ="Bienvenidos a CoolTesters Parks - ";
	}
	
	public String welcomeMessage(){
		return this.welcomeMessage;
	}
	
	public abstract double getTicketPrice();
	public abstract void printPriceDay();
	
	
}
