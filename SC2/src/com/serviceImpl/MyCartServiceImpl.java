package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MyCartDao;
import com.entity.CreateProductEntity;
import com.service.MyCartService;

@Service
@Transactional
public class MyCartServiceImpl implements MyCartService{

	@Autowired MyCartDao myCartDao;
	@Override
	public List<CreateProductEntity> myCart(String code) {
		List<CreateProductEntity> list =  myCartDao.myCart(code);
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
