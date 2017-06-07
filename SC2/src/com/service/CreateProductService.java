package com.service;

import java.util.List;

import com.dto.CreateProduct;
import com.entity.CreateProductEntity;

public interface CreateProductService {
	public void createProduct(CreateProduct createProduct);

	public List<CreateProductEntity> getProductList();

}
