package com.application.json.human.dao;

import java.util.List;

import com.application.json.user.dto.UserDTO;

public interface HumanDAO {
	
	public List<UserDTO> searchFunction(String username) throws Exception;
	public List<UserDTO> allHumanList() throws Exception;
	public void addHuman(UserDTO userDTO) throws Exception;
}
