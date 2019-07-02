package com.sample.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {

	@RequestMapping("/list.do")
	public String list(@RequestParam(value="pno", required = false, defaultValue="1")int pno) {
		System.out.println("pno = " + pno);
		return "list";
	}
	
	@RequestMapping(value="/register.do", method = RequestMethod.GET)
	public String form() {
		return "register";
	}
	
	@RequestMapping(value="/register.do" ,method = RequestMethod.POST)
	public String register(String name, String id, String password, String email) {
		System.out.println("name : " + name);
		System.out.println("id : " + id);
		System.out.println("password : " + password);
		System.out.println("email : " + email);
		
		return "redirect:list.do";

	}
}
