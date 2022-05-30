package com.htm.controller;

import java.security.Principal;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


import com.htm.model.Booking;
import com.htm.model.Customer;
import com.htm.model.Login;
import com.htm.model.Receptionist;
import com.htm.model.User;
import com.htm.service.CustomerService;
import com.htm.service.ReceptionistService;
import com.htm.service.UserService;


@Controller
@SessionAttributes(names = { "customer" })
public class LoginController {
	
	@Autowired
	private CustomerService service;
	
	@Autowired
	private ReceptionistService recepService;

	@Autowired
	private UserService userService;

	@GetMapping({ "/", "/come" })
	public String welCome() {
		return "welcome";
	}
	
	@GetMapping("/about")
	public String help() {
		return "about";
	}
	
	@GetMapping("/features")
	public String features() {
		return "feature";
	}
	
	@GetMapping("/support")
	public String support() {
		return "support";
	}

	@GetMapping("/myLogin")
	public String login(Login login, Model model) {
		model.addAttribute(login);
		return "login";
	}
	
	
	@RequestMapping("/loggedUsers")
	public String showLoggedUsers(Model model) {
		List<String> list=userService.getUsersFromSessionRegistry();
		model.addAttribute("users", list);
		return "activeUsers";
	}

	@RequestMapping("/customer")
	public String user(Principal principal, Authentication auth, Booking booking, Model model) {
		String s = principal.getName();
		Customer customer = service.getCustomerByName(s);
		model.addAttribute("customer", customer);
		model.addAttribute("booking", booking);
		Collection<? extends GrantedAuthority> a = auth.getAuthorities();
		return "user";
	}

	@RequestMapping("/receptionist")
	public String recep(Principal principal, Authentication auth, Model model) {
		String s = principal.getName();
		Receptionist receptionist=recepService.getReceptionistByName(s);
		model.addAttribute("receptionist", receptionist);
		model.addAttribute("imageName", "/images/person.png");
		Collection<? extends GrantedAuthority> a = auth.getAuthorities();
		return "recepPage";
	}

	@RequestMapping("/deleteCustomer/{name}")
	public String deleteUser(@PathVariable("name") String name) {
		System.out.println(name);
		userService.deleteUser(name);
		return "redirect:/come";
	}

	@RequestMapping("/administrator")
	public String admin(Principal principal, Authentication auth, Model model) {
		String s = principal.getName();
		model.addAttribute("name", s);
		Collection<? extends GrantedAuthority> a = auth.getAuthorities();
		return "adminPage";
	}
	
	@RequestMapping("/forgotPassword")
	public String forgotPassword(Login login,Model model) {
		model.addAttribute("login", login);
		return "forgot-page";
	}
	
	@RequestMapping("/forgot-process")
	public String forgotProcess(@Valid Login login,BindingResult set,Model model) {
		if(set.hasErrors()) {
			return "forgot-page";
		}else if(login.getPassword().equals(login.getPassword2())){
			int x=userService.updateUser(login);
			if(x>0) {
				System.out.println("password changed successfully");
			}else {
				System.out.println("sorry user doesn't exist");
			}
			return "login";
		}
		return "forgot-page";
	}
	
}
