package main;

import java.util.*;

public class BookTicket {
	private static String source;
	private static String destination;
	private static String date;
	private static String time;
	

	public BookTicket(String source, String destination) {
		this.source = source;
		this.destination = destination;
		System.out.println("Booking initiated for " + this.source + " to " + this.destination);
	}
	public BookTicket(String source, String destination, String date) { //overloading method with different parameters.
		this.source = source;
		this.destination = destination;
		this.date = date;
		System.out.println("Enter details source, destination & date: ");
	}
	public void displayInfo() {
		System.out.println("--- Booking Details ---");
        System.out.println("Source: " + this.source);
        System.out.println("Destination: " + this.destination);
	}
	public void confirmBooking() {
		System.out.println("Your booking from " + this.source + " to "+ this.destination + " confirmed.");
		//ystem.out.println("Booking confirmed!");
	}
}
