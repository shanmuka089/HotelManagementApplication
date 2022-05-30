package com.htm.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Service;

import com.htm.model.Customer;
import com.htm.model.Login;
import com.htm.model.Receptionist;

@Service
public class UserService {
	
	@Autowired
	private JdbcUserDetailsManager manager;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	@Qualifier("sessionRegistry")
	private SessionRegistry sessionRegistry;

	
	public Customer createUser(Customer customer) {
		String name=customer.getCustomer_name();
		String password=customer.getCustomer_password();
		password=passwordEncoder.encode(password);
		customer.setCustomer_password(password);
		UserDetails user=User.withUsername(name).password(password).authorities("cust").build();
		manager.createUser(user);
		return customer;
	}
	
	public void deleteUser(String name) {
		manager.deleteUser(name);
		System.out.println();
		System.out.println("user is deleted");
	}
	
	public Receptionist createReceptionist(Receptionist receptionist){
		String name=receptionist.getRecep_name();
		String password=receptionist.getPassword();
		password=passwordEncoder.encode(password);
		receptionist.setPassword(password);
		UserDetails user=User.withUsername(name).password(password).authorities("recep").build();
		manager.createUser(user);
		return receptionist; 	
	}
	
	public void deleteReceptionist(String name) {
		manager.setEnableAuthorities(false);
		manager.deleteUser(name);
	}
	
	public List<String> getUsersFromSessionRegistry() {
	    return sessionRegistry.getAllPrincipals().stream()
	      .filter(u -> !sessionRegistry.getAllSessions(u, false).isEmpty())
	      .map(Object::toString)
	      .collect(Collectors.toList());
	}

	public int updateUser(@Valid Login login) {
		UserDetails details=manager.loadUserByUsername(login.getUsername());
		if(details.getUsername().equals(login.getUsername())){
			String password=passwordEncoder.encode(login.getPassword());
			int x=jdbcTemplate.update("update users set password = ? where username = ?",password, login.getUsername());
			return x;
		}
		return 0;
	}
	
}
