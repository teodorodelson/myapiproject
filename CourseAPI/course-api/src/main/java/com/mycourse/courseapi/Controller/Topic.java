package com.mycourse.courseapi.Controller;

public class Topic {

	
	private String id;
	private String name;
	private String units;
	
	public Topic() {
		
	}
	
	public Topic(String id, String name, String units) {
		super();
		this.id = id;
		this.name = name;
		this.units = units;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return units;
	}
	public void setDescription(String description) {
		this.units = description;
	}
	
}
