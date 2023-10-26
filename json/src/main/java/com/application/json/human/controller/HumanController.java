package com.application.json.human.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.application.json.human.service.HumanService;
import com.application.json.user.dto.UserDTO;


@Controller
@RequestMapping("/human")
public class HumanController {
	
	@Autowired
	private HumanService humanService;
	
	
	
	@GetMapping("/insert")
	public ModelAndView searchFunction(String username, HttpServletRequest request) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		
		
		if(username != null) {
		
			List<UserDTO> userList = humanService.searchFunction(username);
			mv.addObject("userList", userList);
		}else {
			List<UserDTO> userNullList = humanService.allHumanList();
			mv.addObject("userList", userNullList);
		}
		
		mv.setViewName("/human/insert");
		
		return mv;
		
	}
	
	@GetMapping("/addHuman")
	public ModelAndView addHuman() throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/human/addHuman");
		return mv;
		
	}
	
	@PostMapping("/addHuman")
	public ResponseEntity<Object> addHuman(UserDTO userDTO, HttpServletRequest request) throws Exception{
		
		humanService.addHuman(userDTO);
		
		String message = "<script>";
		message +="alert('정상적으로 등록되었습니다.');";
		message +="location.href='"+request.getContextPath() + "/human/insert';";
		message +="</script>";
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		
		return new ResponseEntity<Object>(message, responseHeaders, HttpStatus.OK);
		
	}
	
	
}
