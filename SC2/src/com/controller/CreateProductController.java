package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.CreateProduct;
import com.entity.CreateProductEntity;
import com.service.CreateProductService;

@Controller
@RequestMapping("CreateProduct")
public class CreateProductController {
	@Autowired
	private CreateProductService createproductservice;

	@RequestMapping(value="addProduct", method=RequestMethod.POST, produces="application/json")
	public @ResponseBody ResponseEntity<?> addProduct(@RequestBody CreateProduct createProduct, HttpServletRequest http ){
		createproductservice.createProduct(createProduct);
		
		return null;
	}
	
	@RequestMapping(value = "getProductList", method=RequestMethod.POST, produces="application/json")
	public @ResponseBody ResponseEntity<?> getProductList(HttpServletRequest request){
		List<CreateProductEntity> list =  createproductservice.getProductList();
		
		return new ResponseEntity<List<?>>(list, HttpStatus.OK);
	}
}
