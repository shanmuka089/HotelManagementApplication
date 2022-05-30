package com.htm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "booking")
public class Booking {
	
	@Id
	private String booking_id;
	
	private String user_name;
	
	private int no_guests;
	private int no_rooms;
	private int no_days;
	
	@NotBlank(message = "* Adhar number cannot be blank")
	private String adhar_number;
	
	@NotBlank(message = "* please select AC/non-Ac")
	private String comfort;
	
	@NotBlank(message = "* please enter check-in date")
	private String check_in;
	
	@NotBlank(message = "* please enter check-out date")
	private String check_out;
	
	@AssertTrue(message = "* for booking these hotel you must be agree with the hotel policies")
	private boolean check_box;
	
	private boolean payment_status;
	
	
	
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public boolean isPayment_status() {
		return payment_status;
	}

	public void setPayment_status(boolean payment_status) {
		this.payment_status = payment_status;
	}

	public boolean isCheck_box() {
		return check_box;
	}

	public void setCheck_box(boolean check_box) {
		this.check_box = check_box;
	}

	public String getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(String string) {
		this.booking_id = string;
	}

	public int getNo_guests() {
		return no_guests;
	}

	public void setNo_guests(int no_guests) {
		this.no_guests = no_guests;
	}

	public int getNo_rooms() {
		return no_rooms;
	}

	public void setNo_rooms(int no_rooms) {
		this.no_rooms = no_rooms;
	}

	public int getNo_days() {
		return no_days;
	}

	public void setNo_days(int no_days) {
		this.no_days = no_days;
	}

	public String getAdhar_number() {
		return adhar_number;
	}

	public void setAdhar_number(String adhar_number) {
		this.adhar_number = adhar_number;
	}

	public String getComfort() {
		return comfort;
	}

	public void setComfort(String comfort) {
		this.comfort = comfort;
	}

	public String getCheck_in() {
		return check_in;
	}

	public void setCheck_in(String check_in) {
		this.check_in = check_in;
	}

	public String getCheck_out() {
		return check_out;
	}

	public void setCheck_out(String check_out) {
		this.check_out = check_out;
	}

	

	

	public Booking(String booking_id, String user_name, int no_guests, int no_rooms, int no_days,
			@NotBlank(message = "* Adhar number cannot be blank") String adhar_number,
			@NotBlank(message = "* please select AC/non-Ac") String comfort,
			@NotBlank(message = "* please enter check-in date") String check_in,
			@NotBlank(message = "* please enter check-out date") String check_out,
			@AssertTrue(message = "* for booking these hotel you must be agree with the hotel policies") boolean check_box,
			boolean payment_status) {
		super();
		this.booking_id = booking_id;
		this.user_name = user_name;
		this.no_guests = no_guests;
		this.no_rooms = no_rooms;
		this.no_days = no_days;
		this.adhar_number = adhar_number;
		this.comfort = comfort;
		this.check_in = check_in;
		this.check_out = check_out;
		this.check_box = check_box;
		this.payment_status = payment_status;
	}

	public Booking() {
		super();
	}

	@Override
	public String toString() {
		return "Booking [booking_id=" + booking_id + ", no_guests=" + no_guests + ", no_rooms=" + no_rooms
				+ ", no_days=" + no_days + ", adhar_number=" + adhar_number + ", comfort=" + comfort + ", check_in="
				+ check_in + ", check_out=" + check_out + ", check_box=" + check_box + "]";
	}
	
	
	
	
}
