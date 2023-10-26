package com.application.json.human.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.json.user.dto.UserDTO;

@Repository
public class HumanDAOImpl implements HumanDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<UserDTO> searchFunction(String username) throws Exception {
		return sqlSession.selectList("human.searchFunction", username);
	}

	@Override
	public List<UserDTO> allHumanList() throws Exception {
		return sqlSession.selectList("human.allHumanList");
	}
	
	@Override
	public void addHuman(UserDTO userDTO) throws Exception {
		sqlSession.insert("human.addHuman", userDTO);
		
	}


}
