package com.htm.controller;

import java.util.List;
import javax.sql.DataSource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.htm.model.Customer;
import com.htm.service.CustomerService;
import com.htm.service.UserService;



@Controller
public class CustomerControllers {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	CustomerService service;
		
	@RequestMapping("/cust-reg")
	public String register(Model model) {
		Customer customer=new Customer();
		model.addAttribute("customer",customer);
		return "cust-registration";
	}
	
	@RequestMapping("/cust-regProcess")
	public String views(@Valid Customer customer ,BindingResult set ,Model model) {
		if(set.hasErrors()) {
			System.out.println("hello");
			System.out.println(set.getAllErrors());
			return "cust-registration";
		}
		int x=0;
		x=service.save(customer);
		if(x>0) {
			customer=userService.createUser(customer);
			return "successPage";
		}else {
			return "errorPage";
		}
	}
	
	@RequestMapping("/showCustomers")
	public String showCustomers(Model model) {
		List<Customer> custList=service.getCustomers();
		model.addAttribute("customerList", custList);
		return "cust-view";
	}
	
	@RequestMapping("/updateCustomer/{id}")
	public String updateCustomer(@PathVariable("id")Integer id, Model model) {
		
		Customer customer=service.getCustomerById(id);
		model.addAttribute("customer",customer);
		return "cust-updatePage";
	}
	
	@RequestMapping("/cust-updateProcess")
	public String updateCustomers(@Valid Customer customer,BindingResult set,Model model) {
		System.out.println("inside update");
		if(set.hasErrors()) {
			System.out.println(set.getAllErrors());
			return "cust-updatePage";
		}
		int x=0;
		x=service.updateCustomer(customer);
		if(x>0) {
			model.addAttribute("customer",customer);
			return "successPage";
		}else {
			return "errorPage";
		}
	}
	
	@RequestMapping("/deleteCustom")
	public String deleteCustom(Model model) {
		List<Customer> custList=service.getCustomers();
		model.addAttribute("customerList", custList);
		return "cust-delete";
	}
	
	@RequestMapping("/updateCustom")
	public String updateCustom(Model model) {
		List<Customer> custList=service.getCustomers();
		model.addAttribute("customerList", custList);
		return "cust-update";
	}
	
	
	
	@RequestMapping("/deleteCustomers/{id}")
	public String deleteCustomer(@PathVariable("id")Integer id,Model model) {
		
		Customer customer=service.getCustomerById(id);
		service.deleteCustomer(customer);
		List<Customer> custList=service.getCustomers();
		model.addAttribute("customerList", custList);
		return "cust-delete";
	}
}
