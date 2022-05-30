package com.htm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htm.model.Payment;
import com.htm.model.PaymentSession;
import com.htm.repository.PaymentRepository;

@Service
public class PaymentService {
	
	
	@Autowired
	private PaymentRepository repo;
	
	@Autowired
	private RoomService roomService;
	
	public Payment getByName(String name) {
		return repo.findByName(name);
	}
	
	public void createPaymentDetails(Payment payment) {
		repo.save(payment);
	}
	

}
