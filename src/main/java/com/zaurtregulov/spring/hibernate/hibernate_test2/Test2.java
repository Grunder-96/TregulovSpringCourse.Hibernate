package com.zaurtregulov.spring.hibernate.hibernate_test2;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.zaurtregulov.spring.hibernate.hibernate_test2.entity.Detail;

public class Test2 {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Detail.class)
				.buildSessionFactory();
		Session session = null;
		try {
//			Employee employee = new Employee("Nikolay", "Ivanov", "HR", 35000);
//			Detail detail = new Detail("New York", "4564403", "Gnom-78@gmail.com");
//			detail.setEmployee(employee);
//			employee.setEmpDetail(detail);
			session = factory.getCurrentSession();
			session.beginTransaction();
//			session.persist(detail);
			Detail detail = session.get(Detail.class, 1);
			detail.getEmployee().setEmpDetail(null);
			session.remove(detail);
			session.getTransaction().commit();
			System.out.println("Done!");
		} finally {
			session.close();
			factory.close();
		}
	}
}
