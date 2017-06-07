package com.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.config.GenericHibernateTemplate;
import com.dao.MyCartDao;
import com.entity.CreateProductEntity;
@Repository
public class MyCartDaoImpl extends GenericHibernateTemplate implements MyCartDao{

	@Override
	public List<CreateProductEntity> myCart(String code) {
		try{
			StringBuffer hql = new StringBuffer();
			hql.append("from CreateProductEntity where code = "+code);
			Query qry = getSessionFactory().getCurrentSession().createQuery(hql.toString());
			List<CreateProductEntity> list =  qry.list();
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	
	}

}
