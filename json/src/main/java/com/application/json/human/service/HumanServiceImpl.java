package com.application.json.human.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.json.human.dao.HumanDAO;
import com.application.json.user.dto.UserDTO;

@Service
public class HumanServiceImpl implements HumanService {
	
	@Autowired
	private HumanDAO humanDAO;
	
	
	@Override
	public List<UserDTO> searchFunction(String username) throws Exception {
		return humanDAO.searchFunction(username);
	}

	
	@Override
	public List<UserDTO> allHumanList() throws Exception {
		return humanDAO.allHumanList();
	}

	@Override
	public void addHuman(UserDTO userDTO) throws Exception {
		humanDAO.addHuman(userDTO);
		
	}


}
