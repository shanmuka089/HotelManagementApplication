package com.htm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htm.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{

	@Query(value = "select * from room where room_condition=:name",nativeQuery = true)
	List<Room> groupByRoom_condition(String name);
	
	@Query(value = "select * from room where in_use=:name",nativeQuery = true)
	List<Room> groupByIn_use(boolean name);
}
