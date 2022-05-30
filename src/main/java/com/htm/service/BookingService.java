package com.htm.service;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.htm.model.Booking;
import com.htm.model.Payment;
import com.htm.model.PaymentSession;
import com.htm.model.Room;
import com.htm.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepository repo;
	
	@Autowired
	private RoomService service;
	
	public Booking makeBooking(Booking booking) {
		Booking book=repo.save(booking);
		return book;
	}
	
	public Timestamp getTimeStamp() {
		Date date = new Date();
		Timestamp ts=new Timestamp(date.getTime());
		return ts;
	}
	
	public Booking updatePaymentStatus(Booking booking) {
		booking.setPayment_status(true);
		booking=repo.save(booking);
		return booking;
	}
	
	public PaymentSession processBooking(Booking booking) {
		PaymentSession payment=new PaymentSession();
		boolean payStatus=booking.isPayment_status();
		int no_rooms=booking.getNo_rooms();
		String comfort=booking.getComfort();
		ArrayList<Integer> arr=new ArrayList<>();
		int amount=0;
		double tax=0;
		boolean flag=false;
		System.out.println("inisde booking service");
		
		List<Room> rooms_list=service.getCleanedRooms();
		for(Room room:rooms_list) {
			if(comfort.equals(room.getComfort()) && !room.isIn_use()) {
				if(no_rooms>0) {
					arr.add(room.getRoom_id());
					--no_rooms;
				}
			}
		}
		System.out.println("inide booking service 2");
		if(arr.size()>=no_rooms) {
			flag=true;
		}
		System.out.println("inide booking service 3");
		if(flag) {
			for(int i=0;i<=arr.size()-1;i++) {
				Room room=rooms_list.get(i);
				amount+=room.getRoom_cost();
			}
		}else {
			return null;
		}
		System.out.println("inide booking service 4");
		
		tax=amount*(0.05);
		double total_tax=tax*booking.getNo_days()*booking.getNo_rooms();
		double total_amount=amount*booking.getNo_days()*booking.getNo_rooms();
		payment.setNo_days(booking.getNo_days());
		System.out.println("inide booking service 5");
		payment.setPayment_status(payStatus);
		payment.setUser_name(booking.getUser_name());
		payment.setTax(total_tax);
		payment.setNo_rooms(booking.getNo_rooms());
		payment.setAmount(total_amount);
		payment.setNo_guests(booking.getNo_guests());
		payment.setComfort(comfort);
		payment.setRoom_no(arr);
		payment.setTotal_amount(total_amount+total_tax);
		return payment;
	}

	public List<Booking> getBookedCustomers(){
		return repo.findAll();
	}
	
	public List<Booking> getBookedCustomersByName(String name){
		return repo.findByUser_name(name);
	}
}
