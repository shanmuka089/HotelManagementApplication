package com.htm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.htm.model.Room;
import com.htm.service.RoomService;

@Controller
public class RoomController {

	@Autowired
	private RoomService service;
	
	@RequestMapping("/showAllRooms")
	public String showAllRooms(Model model) {
		List<Room> room_list=service.showRooms();
		model.addAttribute("rooms",room_list);
		return "showRooms";
	}
	
	@RequestMapping("/showCleanRooms")
	public String showCleanRoom(Model model) {
		List<Room> room_list=service.getCleanedRooms();
		model.addAttribute("cleanRooms",room_list);
		return "cleanRooms";
	}
	
	@RequestMapping("/showDirtyRooms")
	public String showDirtyRooms(Model model) {
		List<Room> room_list=service.getDirtyRooms();
		model.addAttribute("dirtyRooms",room_list);
		return "dirtyRooms";
	}
	
	@RequestMapping("/addRoom")
	public String addRooms(Room room,Model model) {
		model.addAttribute("room",room);
		return "roomReg";
	}
	
	@RequestMapping(value = "/roomProcess",method = RequestMethod.POST )
	public String processRooms(@Valid Room room,BindingResult set,Model model){
		if(set.hasErrors()) {
			return "roomReg";
		}
		int x=service.createRoom(room);
		if(x>0) {
			return "redirect:/administrator";
		}else {
			return "roomReg";
		}
	}
	
	@RequestMapping("/updateRoom")
	public String updateRoom(Model model) {
		List<Room> room_list=service.showRooms();
		model.addAttribute("rooms",room_list);
		return "updateRoom";
	}
	
	@RequestMapping("/updateProcessRoom/{id}")
	public String updateProcess(@PathVariable("id") int id,Model model) {
		Room room=service.getRoomById(id);
		model.addAttribute("room",room);
		return "roomUpdate";
	}
	
	@RequestMapping("/roomUpdateProcess")
	public String processUpdateRooms(@Valid Room room,BindingResult set,Model model){
		if(set.hasErrors()) {
			return "roomReg";
		}
		int x=service.updateRoom(room);
		if(x>0) {
			return "redirect:/administrator";
		}else {
			return "roomReg";
		}
	}
	
	@RequestMapping("/deleteRoom")
	public String deleteRoomPage(Model model) {
		List<Room> room_list=service.showRooms();
		model.addAttribute("rooms",room_list);
		return "deleteRoom";
	}
	
	@RequestMapping("/deleteProcessRoom/{id}")
	public String deleteRoom(@PathVariable("id") int id,Model model) {
		service.deleteRoom(id);
		List<Room> room_list=service.showRooms();
		model.addAttribute("rooms",room_list);
		return "deleteRoom";
	}
	
	@RequestMapping("/bookedRooms")
	public String bookedRooms(Model model) {
		List<Room> room_list=service.bookedRooms();
		model.addAttribute("bookRooms", room_list);
		return "bookRooms";
	}
	
	@RequestMapping("/availableRooms")
	public String availableRooms(Model model) {
		List<Room> room_list=service.availableRooms();
		model.addAttribute("bookRooms", room_list);
		return "availableRooms";
	}
	
}
