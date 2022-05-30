package com.htm.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htm.model.Customer;
import com.htm.repository.CustomerRepository;


@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repo;
	
	@Autowired
	private UserService service;
	
	public Date getDate() {
		 Date date=new Date();
		return date;
	}
	
	public int save(Customer customer) {
		
		if(repo.countByCustomer_name(customer.getCustomer_name())>0) {
			return 0;
		}else {
			repo.save(customer);
			return 1;
		}
	}
	
	
	public List<Customer> getCustomers(){
		return repo.findAll();
		
	}
	
	
	public Customer getCustomerById(int id) {
		return repo.getById(id);
	}
	
	public int updateCustomer(Customer customer) {
		if(repo.existsById(customer.getCustomer_id())){
			repo.save(customer);
			return 1;
		}else {
			return 0;
		}
	}
	
	public void deleteCustomer(Customer customer) {
		if(repo.existsById(customer.getCustomer_id())) {
			service.deleteUser(customer.getCustomer_name());
			repo.delete(customer);
		}else {
			System.out.println("customer not exists");
		}
	}

	public Customer getCustomerByName(String s) {
		Customer customer=repo.findByCustomer_name(s);
		System.out.println(customer);
		return customer;
	}
}
