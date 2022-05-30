package com.htm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htm.model.Receptionist;
import com.htm.repository.ReceptionistRepository;

@Service
public class ReceptionistService {
	
	
	@Autowired
	ReceptionistRepository repo;
	
	public void save(Receptionist receptionist) {
			repo.save(receptionist);
	}
	
	public List<Receptionist> getReceptionists(){
		List<Receptionist> recepList=repo.findAll();
		return recepList;
	}
	
	public Receptionist getReceptionistById(Integer id) {
			return repo.getById(id);
	}
	
	
	public int updateReceptionist(Receptionist receptionist){
		if(repo.existsById(receptionist.getRecep_id())){
			repo.save(receptionist);
			return 1;
		}else {
			return 0;
		}
	}
	
	public void deleteReceptionist(Integer id) {
			repo.deleteById(id);
	}

	public Receptionist getReceptionistByName(String name) {
		return repo.findByRecep_name(name);
	}
}
