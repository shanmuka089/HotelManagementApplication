package com.htm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.htm.model.Receptionist;

@Repository
public interface ReceptionistRepository extends JpaRepository<Receptionist,Integer> {

	@Query(value="select * from Receptionist c where c.recep_name=:name",nativeQuery = true)
	Receptionist findByRecep_name(String name);
	
	@Query(value = "select count(recep_name) from Receptionist c where c.recep_name=:name",nativeQuery = true)
	long countByRecep_name(String name);
}
