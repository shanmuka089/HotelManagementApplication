package com.htm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htm.model.PaymentSession;
import com.htm.model.Room;
import com.htm.repository.RoomRepository;

@Service
public class RoomService {
	
	@Autowired
	private RoomRepository repo;
	
	public int createRoom(Room room) {
		
		if(repo.existsById(room.getRoom_id())) {
			System.out.println("room already exists");
			return 0;
		}else {
			repo.save(room);
			return 1;
		}
	}
	
	public int updateRoom(Room room) {
		
		if(repo.existsById(room.getRoom_id())) {
			repo.save(room);
			return 1;	
		}else {
			System.out.println("room already exists");
			return 0;
		}
	}
	
	public void deleteRoom(int id) {
		if(repo.existsById(id)) {
				repo.deleteById(id);
		}else {
			System.out.println("room not exists");
		}
	}
	
	public List<Room> showRooms() {
		List<Room> room_list=repo.findAll();
		return room_list;
	}
	
	public List<Room> getCleanedRooms(){
		return repo.groupByRoom_condition("cleaned");
	}
	
	public List<Room> getDirtyRooms(){
		return repo.groupByRoom_condition("dirty");
	}

	public Room getRoomById(int id) {
		return repo.getById(id);
	}
	
	public void updateIsInUse(PaymentSession paymentSession) {
		System.out.println(paymentSession);
		ArrayList<Integer> psession=paymentSession.getRoom_no();
		for(int i:psession) {
			Room room=repo.getById(i);
			room.setIn_use(true);
			repo.save(room);
		}
	}
	
	public List<Room> bookedRooms(){
		List<Room> room_list=repo.groupByIn_use(true);
		return room_list;
	}
	
	public List<Room> availableRooms(){
		List<Room> room_list=repo.groupByIn_use(false);
		return room_list;
	}
}
