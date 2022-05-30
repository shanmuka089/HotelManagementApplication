package com.htm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htm.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, String>{

	@Query(value="select * from Booking b where b.user_name=:name",nativeQuery = true)
	public List<Booking> findByUser_name(String name);
}
