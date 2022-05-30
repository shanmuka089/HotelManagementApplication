package com.htm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htm.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	
	@Query(value="select * from Customer c where c.customer_name=:name",nativeQuery = true)
	Customer findByCustomer_name(String name);
	
	@Query(value = "select count(customer_name) from Customer c where c.customer_name=:name",nativeQuery = true)
	long countByCustomer_name(String name);
}
