package com.service;

import java.util.List;

import com.entity.CreateProductEntity;

public interface MyCartService {
	public List<CreateProductEntity> myCart(String code);
}
