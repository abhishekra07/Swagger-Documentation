package com.victor.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="User", description="User model")
public class SwaggerModel {
	
	@ApiModelProperty(value = "user's first name", example="Abhishek")
	private String firstName;
	
	@ApiModelProperty(value = "user's last name", example="Rathore")
	private String lastName;
	
	@ApiModelProperty(value = "user's contact number", example="123456789")
	private String contact;
	
	@ApiModelProperty(value = "user's status", example="TRUE OR FALSE")
	
	private boolean active;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public boolean getActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
