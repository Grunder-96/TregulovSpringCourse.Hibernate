package com.zaurtregulov.spring.hibernate.hibernate_test2;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		try {
			Session session = factory.getCurrentSession();
			Employee emp = new Employee("Aleksandr", "Ivanov", "IT", 65000);
			session.beginTransaction();
			session.persist(emp);
			session.getTransaction().commit();
			
			System.out.println("Done!");
			System.out.println(emp);
		} finally {
			factory.close();
		}
	}
}
