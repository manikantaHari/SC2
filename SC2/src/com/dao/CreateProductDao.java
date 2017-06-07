package com.dao;

import java.util.List;

import com.dto.CreateProduct;
import com.entity.CreateProductEntity;

public interface CreateProductDao{
	public void createProduct(CreateProductEntity createProductEntity);

	public List<CreateProductEntity> getProductList();

}
