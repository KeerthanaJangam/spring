package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="event_table")
public class Event
{
	@Id
	@Column(name="eve_id",nullable =false,length = 50,unique = true )
	 private int id;
	@Column(name="eve_name",nullable =false,length = 50 )
	 private String name;
	@Column(name="eve_location",nullable =false,length = 50 )
	 private String location;
	@Column(name="eve_date",nullable =false,length = 50 )
	 private String date;
	@Column(name="eve_description",nullable =false,length = 50 )
	 private String description;
	@Column(name="eve_organizer",nullable =false )
	 private String organizer;
	
	public int getId() {
		return id;
	}
	public void setId(int id2) {
		this.id = id2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOrganizer() {
		return organizer;
	}
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}
	 
	 
}
