package com.htm.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.htm.model.Booking;
import com.htm.model.Payment;
import com.htm.model.PaymentSession;
import com.htm.service.BookingService;
import com.htm.service.PaymentService;
import com.htm.service.RoomService;

@Controller
@SessionAttributes(names = {"paymentCheckOut","booking"})
public class BookingController {

	@Autowired
	private BookingService service;
	
	@Autowired
	private RoomService roomService;
	
	@Autowired
	PaymentService serve;
	
	PaymentSession payment;
	
	@RequestMapping("/bookingProcess")
	public String recep_payment(HttpSession session,Principal principal,@Valid Booking booking, BindingResult set, Model model) {

		if (set.hasErrors()) {
			return "user";
		}
		String name=principal.getName();
		booking.setUser_name(name);
		booking.setPayment_status(false);
		payment=service.processBooking(booking);
		if(payment!=null) {
			model.addAttribute("paymentCheckOut", payment);
		}else {
			return "errorPage";
		}
		String bookingId=session.getId();
		String str = bookingId.substring(0,6);
		booking.setBooking_id(str);
		
		model.addAttribute("booking",booking);
		if(booking.isPayment_status()) {
			model.addAttribute("paystatus", "success");
		}else {
			model.addAttribute("paystatus", "pending...");
		}
		return "paymentPage";
	}
	
	@RequestMapping("/paymentNow")
	public String makePayment(HttpSession session,Payment payment,Model model) {
	Booking	booking=(Booking)session.getAttribute("booking");		
	booking=service.makeBooking(booking);
	payment.setPayment_id(booking.getBooking_id());
	model.addAttribute("payment",payment);
	model.addAttribute("timeStamp",service.getTimeStamp());
		return "final_paymentPage";
	}
	
	@RequestMapping("/paymentProcess")
	public String paymentProcessing(@Valid Payment payments,BindingResult set,Model model) {
		if(set.hasErrors()) {
			return "final_paymentPage";
		}
		roomService.updateIsInUse(payment);
		Booking booking= (Booking) model.getAttribute("booking");
		booking=service.updatePaymentStatus(booking);
		serve.createPaymentDetails(payments);
		if(booking.isPayment_status()) {
			model.addAttribute("paystatus", "success");
		}else {
			model.addAttribute("paystatus", "pending...");
		}
		return "paymentSuccess";
	}
	
	@RequestMapping("/sessionInvalidate")
	public String sessionInvalidate(HttpSession session) {
		session.invalidate();
		return "redirect:/customer";
	}
	
	@RequestMapping("/sessionInvalidated")
	public String sessionInvalidating(HttpSession session) {
		session.invalidate();
		return "redirect:/receptionist";
	}
	
	@RequestMapping("/showBookedCustomers")
	public String showBookedCustomers(Model model) {
		List<Booking> bookCustomers=service.getBookedCustomers();
		model.addAttribute("bookCustomers", bookCustomers);
		return "bookedCustomers";
	}
	
	@RequestMapping("/customerBooking")
	public String customerBooking(Model model) {
		Booking booking=new Booking();
		model.addAttribute("booking", booking);
		return "customerBooking";
	}
	
	@RequestMapping("/customerbookingProcess")
	public String customer_payment(HttpSession session,@Valid Booking booking, BindingResult set, Model model) {

		if (set.hasErrors()) {
			return "customerBooking";
		}
		booking.setPayment_status(false);
		payment=service.processBooking(booking);
		if(payment!=null) {
			model.addAttribute("paymentCheckOut", payment);
		}else {
			return "errorPage";
		}
		String bookingId=session.getId();
		String str = bookingId.substring(0,6);
		booking.setBooking_id(str);
		
		model.addAttribute("booking",booking);
		if(booking.isPayment_status()) {
			model.addAttribute("paystatus", "success");
		}else {
			model.addAttribute("paystatus", "pending...");
		}
		return "paymentPage";
	}
	
	@RequestMapping("/getBookingDetails/{name}")
	public String getBookingDetails(@PathVariable("name") String name,Model model) {
		List<Booking> bookCustomers=service.getBookedCustomersByName(name);
		model.addAttribute("bookCustomers", bookCustomers);
		return "bookingDetails";
	}
	
	
}
