package com.htm.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Principal;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.htm.model.Receptionist;
import com.htm.service.ReceptionistService;
import com.htm.service.UserService;

@Controller
public class ReceptionistController {
	
	private static final String UPLOAD_DIRECTORY ="/images";  
	
	@Autowired
	private ReceptionistService recepService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ReceptionistService service;
	
	@RequestMapping("/showReceptionists")
	public String showReceptionists(Model model) {
		List<Receptionist> recep=service.getReceptionists();
		model.addAttribute("receptionists",recep);
		return "recep-view";
	}
	
	@RequestMapping("/recepUpdate")
	public String updateReceptionists(Model model) {
		List<Receptionist> recep=service.getReceptionists();
		model.addAttribute("receptionists",recep);
		return "recepUpdate";
	}
	
	@RequestMapping("/recepUpdatePage/{id}")
	public String updateRecepProcess(@PathVariable("id") int id,Model model) {
		Receptionist recep=service.getReceptionistById(id);
		model.addAttribute("receptionist",recep);
	  return "recepUpdatePage";
	}
	
	@RequestMapping("/recepUpdateProcess")
	public String updateRecep(@Valid Receptionist receptionist,BindingResult set,Model model) {
		if(set.hasErrors()) {
			model.addAttribute("receptionist",receptionist);
			return "recepUpdatePage";
		}
		service.updateReceptionist(receptionist);
		return "redirect:/administrator";
	}
	
	@RequestMapping("/recepUpdateProces")
	public String updateReceptionist(@Valid Receptionist receptionist,BindingResult set,Model model) {
		if(set.hasErrors()) {
			model.addAttribute("receptionist",receptionist);
			return "recepUpdatePage";
		}
		service.updateReceptionist(receptionist);
		return "redirect:/receptionist";
	}
	
	
	
	@RequestMapping("/recepReg")
	public String addRecep(Receptionist recep,Model model) {
		model.addAttribute("receptionist", recep);
		return "recep-Reg";
	}
	
	@RequestMapping("/recepRegProcess")
	public String processRecep(@Valid Receptionist receptionist,BindingResult set) {
		
		if(set.hasErrors()) {
			return "recep-Reg";
		}
		receptionist=userService.createReceptionist(receptionist);
		service.save(receptionist);
		return "redirect:/administrator";	
	}
	
	@RequestMapping("/recepDelete")
	public String recepDelete(Model model) {
		List<Receptionist> recep=service.getReceptionists();
		model.addAttribute("receptionists",recep);
		return "recepDelete";
	}
	
	@RequestMapping("/recepDeletePage/{id}")
	public String recepDeleteProcess(@PathVariable("id") int id,Model model)
	{
		String name=service.getReceptionistById(id).getRecep_name();
		userService.deleteReceptionist(name);
		service.deleteReceptionist(id);
		List<Receptionist> recep=service.getReceptionists();
		model.addAttribute("receptionists",recep);
		return "recepDelete";
	}
	
	@RequestMapping("/uploadImage")
	public String uploadImage(@RequestParam CommonsMultipartFile image,  
	           HttpSession session,Principal principal, Authentication auth, Model model) throws IOException {
		System.out.println("step 1");
		ServletContext context = session.getServletContext();  
	    String path = context.getRealPath(UPLOAD_DIRECTORY);  
	    String filename = image.getOriginalFilename();  
	  
	    System.out.println(path+" "+filename);        
	  
	    byte[] bytes =image.getBytes();  
	    BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(  
	      new File(path + File.separator + filename)));  
	    stream.write(bytes);  
	    stream.flush();  
	    stream.close();  
		String s = principal.getName();
		Receptionist receptionist=recepService.getReceptionistByName(s);
		model.addAttribute("receptionist", receptionist);
		model.addAttribute("imageName", path+"/"+filename);
		Collection<? extends GrantedAuthority> a = auth.getAuthorities();
		return "recepPage";
	}
}
