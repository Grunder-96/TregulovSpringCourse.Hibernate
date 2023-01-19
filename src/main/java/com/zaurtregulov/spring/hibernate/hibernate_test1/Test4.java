package com.zaurtregulov.spring.hibernate.hibernate_test1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		try {
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			
//			Employee emp = session.get(Employee.class, 0);
//			emp.setSalary(280000);

			session.createMutationQuery("update Employee set salary = 150000 where name = 'Aleksandr'").executeUpdate();

			
			session.getTransaction().commit();
			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}
}
