package com.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component("hibernateTemplate")
public class GenericHibernateTemplate  extends HibernateTemplate{

    @Autowired(required=true)
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        System.out.println("Setting SessionFactory");
        this.sessionFactory = sessionFactory;
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public void afterPropertiesSet() {
    System.out.println("Checking if properties set..."+this.sessionFactory);
    setSessionFactory(sessionFactory);
    super.afterPropertiesSet();
    }
}
