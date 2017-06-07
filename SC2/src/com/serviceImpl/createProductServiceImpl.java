package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.dao.CreateProductDao;
import com.dto.CreateProduct;
import com.entity.CreateProductEntity;
import com.service.CreateProductService;

@Service
@Transactional
public class createProductServiceImpl implements CreateProductService {

	@Autowired
	CreateProductDao createProductDao;

	@Override
	public void createProduct(CreateProduct createProduct) {

		CreateProductEntity createProductEntity = new CreateProductEntity();
		createProductEntity.setCode(createProduct.getCode());
		createProductEntity.setName(createProduct.getName());
		createProductEntity.setPrice(createProduct.getPrice());
		createProductEntity.setImage(createProduct.getImage().getBytes());
		createProductDao.createProduct(createProductEntity);
	}

	@Override
	public List<CreateProductEntity> getProductList() {
		List<CreateProductEntity> list = createProductDao.getProductList();
		if (list != null && list.size() > 0) {
			for (CreateProductEntity obj : list) {
				if (obj.getImage() != null) {
					obj.setStrImage(new String(obj.getImage()));
				}
			}
		}
		return list;

	}

}
