package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("MainController")
public class FirstController {
	@RequestMapping(value="/firstController", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody ResponseEntity<?> getDetails(@RequestBody Map<String,String> obj, HttpServletRequest request){
		System.out.println(obj.get("UserName"));
		return null;
		
	}

}
