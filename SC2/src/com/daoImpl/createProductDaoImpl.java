package com.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.config.GenericHibernateTemplate;
import com.dao.CreateProductDao;
import com.entity.CreateProductEntity;

@Repository
public class createProductDaoImpl extends GenericHibernateTemplate implements CreateProductDao{

	

   @Override
   @Transactional
   public void createProduct(CreateProductEntity createProductEntity) {
	save(createProductEntity);
	//sessionFacatory.getCurrentSession().save(createProduct);
	
	
}

@SuppressWarnings("unchecked")
@Override
public List<CreateProductEntity> getProductList() {
	StringBuffer hql = new StringBuffer();
	hql.append("from CreateProductEntity");
	Query qry = getSessionFactory().getCurrentSession().createQuery(hql.toString());
	List<CreateProductEntity> list =  qry.list();
	return list;
	
	
}
	
	
}
