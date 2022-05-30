package com.htm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "roombooked")
public class RoomBooked {
	
	@Id
	private int booking_id;
	
	@NonNull
	private String customer_name;
	
	private int room_id;
	
	private double payment;
	
	@NonNull
	private String checkin_date;
	
	@NonNull
	private String checkout_date;

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public String getCheckin_date() {
		return checkin_date;
	}

	public void setCheckin_date(String checkin_date) {
		this.checkin_date = checkin_date;
	}

	public String getCheckout_date() {
		return checkout_date;
	}

	public void setCheckout_date(String checkout_date) {
		this.checkout_date = checkout_date;
	}

	public RoomBooked(int booking_id, String customer_name, int room_id, double payment, String checkin_date,
			String checkout_date) {
		super();
		this.booking_id = booking_id;
		this.customer_name = customer_name;
		this.room_id = room_id;
		this.payment = payment;
		this.checkin_date = checkin_date;
		this.checkout_date = checkout_date;
	}

	public RoomBooked() {
		super();
	}
	
}
