package com.application.json.human.service;

import java.util.List;import org.apache.catalina.User;

import com.application.json.user.dto.UserDTO;

public interface HumanService {
	
	public List<UserDTO> searchFunction(String username) throws Exception;
	public List<UserDTO> allHumanList() throws Exception;
	public void addHuman(UserDTO userDTO) throws Exception;
	
}
