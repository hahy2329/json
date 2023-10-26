package com.application.json.user.dto;

import org.springframework.stereotype.Component;

@Component
public class UserDTO {
	
	private String username;
	private int userage;
	private String usergender;
	private String useremail;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserage() {
		return userage;
	}
	public void setUserage(int userage) {
		this.userage = userage;
	}
	public String getUsergender() {
		return usergender;
	}
	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", userage=" + userage + ", usergender=" + usergender + ", useremail="
				+ useremail + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
