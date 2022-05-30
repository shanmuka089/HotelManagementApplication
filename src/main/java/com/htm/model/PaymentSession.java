package com.htm.model;

import java.util.ArrayList;

public class PaymentSession {
	
	private int no_days;
	private String user_name;
	private int no_guests;
	private int no_rooms;
	private ArrayList<Integer> room_no;
	private String comfort;
	private double amount;
	private boolean payment_status;
	private double tax;
	private double total_amount;
	
	public double getTax() {
		return tax;
	}
	public void setTax(double tax2) {
		this.tax = tax2;
	}
	public int getNo_guests() {
		return no_guests;
	}
	public void setNo_guests(int no_guests) {
		this.no_guests = no_guests;
	}
	public int getNo_days() {
		return no_days;
	}
	public void setNo_days(int no_days) {
		this.no_days = no_days;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getNo_rooms() {
		return no_rooms;
	}
	public void setNo_rooms(int no_rooms) {
		this.no_rooms = no_rooms;
	}
	
	public ArrayList<Integer> getRoom_no() {
		return room_no;
	}
	public void setRoom_no(ArrayList<Integer> arr) {
		this.room_no = arr;
	}
	public String getComfort() {
		return comfort;
	}
	public void setComfort(String comfort) {
		this.comfort = comfort;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public boolean isPayment_status() {
		return payment_status;
	}
	public void setPayment_status(boolean payment_status) {
		this.payment_status = payment_status;
	}
	
	public double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}
	@Override
	public String toString() {
		return "PaymentSession [no_days=" + no_days + ", user_name=" + user_name + ", no_guests=" + no_guests
				+ ", no_rooms=" + no_rooms + ", room_no=" + room_no + ", comfort=" + comfort + ", amount=" + amount
				+ ", payment_status=" + payment_status + ", tax=" + tax + "]";
	}
	

}
