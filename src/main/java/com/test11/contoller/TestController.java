package com.test11.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test11.entity.Test01Entity;
import com.test11.repository.Test01Repository;

@Controller
public class TestController {
	@Autowired
	private Test01Repository test01repository;
	
	@GetMapping(value = "/")
	public String home() {
		return "home";
	}
	
	@GetMapping(value = "/board/list.do")
	public String list(Model model) {
		List<Test01Entity> test01 = test01repository.findAll();
		
		model.addAttribute("test01", test01);
		
		return "/board/list";
	}

}
