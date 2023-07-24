package com.durgesh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String village;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVillae() {
		return village;
	}

	public void setVillage(String villae) {
		this.village = villae;
	}

	public User(int id, String name, String villae) {
	
		this.id = id;
		this.name = name;
		this.village = villae;
	}
	
	public User() {
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", villae=" + village + "]";
	}
	
	

}
