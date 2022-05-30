package com.htm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

import net.bytebuddy.implementation.bind.annotation.Default;

@Entity
@Table(name = "room")
public class Room {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int room_id;
	
	@NonNull
	@Column
	private String comfort;
	
	@NonNull
	@Column
	private String room_condition;
	
	@Column
	private int no_beds;
	
	@Column
	private double room_cost;
	
	
	private boolean in_use;
	

	

	public boolean isIn_use() {
		return in_use;
	}

	public void setIn_use(boolean in_use) {
		this.in_use = in_use;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public String getComfort() {
		return comfort;
	}

	public void setComfort(String comfort) {
		this.comfort = comfort;
	}

	public String getRoom_condition() {
		return room_condition;
	}

	public void setRoom_condition(String room_condition) {
		this.room_condition = room_condition;
	}

	public int getNo_beds() {
		return no_beds;
	}

	public void setNo_beds(int no_beds) {
		this.no_beds = no_beds;
	}

	public double getRoom_cost() {
		return room_cost;
	}

	public void setRoom_cost(double room_cost) {
		this.room_cost = room_cost;
	}

	

	public Room(int room_id, String comfort, String room_condition, int no_beds, double room_cost, boolean in_use) {
		super();
		this.room_id = room_id;
		this.comfort = comfort;
		this.room_condition = room_condition;
		this.no_beds = no_beds;
		this.room_cost = room_cost;
		this.in_use = in_use;
	}

	public Room() {
		super();
	}

	@Override
	public String toString() {
		return "Room [room_id=" + room_id + ", comfort=" + comfort + ", room_condition=" + room_condition + ", no_beds="
				+ no_beds + ", room_cost=" + room_cost + "]";
	}
	
	
	

}
