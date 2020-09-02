package com.best.student_manager.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtlity {
	private static SessionFactory sessionFactory = null;
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
            Configuration configuration = new Configuration();
          configuration.configure("hibernate.cfg.xml");
            sessionFactory = configuration.buildSessionFactory();
            
//            SessionFactory sessionFactory = new Configuration()
//				    .configure("/java_exam_manager/resources/hibernate.cfg.xml").buildSessionFactory();
        }
		
		
		return sessionFactory;
	}
}
