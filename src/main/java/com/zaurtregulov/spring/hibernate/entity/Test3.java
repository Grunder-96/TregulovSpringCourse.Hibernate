package com.zaurtregulov.spring.hibernate.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		try {
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			
			List<Employee> emps = session
					.createSelectionQuery("from Employee where name = 'Aleksandr' and salary > 65000", Employee.class)
					.getResultList();
			
			for (Employee e : emps) {
				System.out.println(e);
			}
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}
}
