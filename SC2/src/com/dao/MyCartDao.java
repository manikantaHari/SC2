package com.dao;

import java.util.List;

import com.entity.CreateProductEntity;

public interface MyCartDao {
	public List<CreateProductEntity> myCart(String code);
}
