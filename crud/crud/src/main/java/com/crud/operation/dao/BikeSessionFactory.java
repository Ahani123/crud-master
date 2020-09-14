package com.crud.operation.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BikeSessionFactory {

	private static SessionFactory sessionFactory=null;
	
	private BikeSessionFactory() {
	}
	
	public static SessionFactory createSessionFactory(){
		if(sessionFactory == null)
			sessionFactory = new Configuration().configure().buildSessionFactory();
		return sessionFactory;
	}
}
