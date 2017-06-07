package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.CreateProductEntity;
import com.service.MyCartService;

@Controller
@RequestMapping("CartController")
public class CartController {
	@Autowired MyCartService myCartService;
	
	@RequestMapping(value="/mycart", method= RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> mycart(@RequestBody Map<String,String> obj){
		String code = obj.get("code");
		List<CreateProductEntity> list =  myCartService.myCart(code);
		
		
		return new ResponseEntity<List<?>>(list, HttpStatus.OK);
		
	}

}
