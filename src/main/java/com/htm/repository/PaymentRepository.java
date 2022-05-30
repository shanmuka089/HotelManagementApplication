package com.htm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htm.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String>{

	@Query(value = "select * from Payment p where p.user_name=:name",nativeQuery = true)
	public Payment findByName(String name);
}
