package com.zaurtregulov.spring.hibernate.one_to_one;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zaurtregulov.spring.hibernate.one_to_one.entity.Detail;
import com.zaurtregulov.spring.hibernate.one_to_one.entity.Employee;

public class Test1 {
	
	public static void main(String[] args) {
		
//		SessionFactory factory = new Configuration()
//				.configure("hibernate.cfg.xml")
//				.addAnnotatedClass(Employee.class)
//				.addAnnotatedClass(Detail.class)
//				.buildSessionFactory();
//		
//		try {
//			Session session = factory.getCurrentSession();
//			Employee employee = new Employee("Grigory", "Taran", "OMKO", 32000);
//			Detail detail = new Detail("Tula", "79066208932", "grunder-96@mail.ru");
//			employee.setEmpDetail(detail);
//			session.beginTransaction();
//			session.persist(employee);
//			session.getTransaction().commit();
//			
//			System.out.println("Done!");
		
//		SessionFactory factory = new Configuration()
//				.configure("hibernate.cfg.xml")
//				.addAnnotatedClass(Employee.class)
//				.addAnnotatedClass(Detail.class)
//				.buildSessionFactory();
//		
//		
//			Session session = factory.getCurrentSession();
//			Employee employee = new Employee("Oleg", "Smirnov", "Sales", 57500);
//			Detail detail = new Detail("Moscow", "88005552525", "olezhka@mail.ru");
//			employee.setEmpDetail(detail);
//			session.beginTransaction();
//			session.persist(employee);
//			session.getTransaction().commit();
//			
//			System.out.println("Done!");
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Detail.class)
				.buildSessionFactory();
		Session session = null;
		try {
//			session = factory.getCurrentSession();
//			session.beginTransaction();
//			Employee employee = session.get(Employee.class, 10);
//			System.out.println(employee.getEmpDetail());
//			session.getTransaction().commit();
//			
//			System.out.println("Done!");
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			Employee employee = session.get(Employee.class, 3);
			System.out.println(employee);
			session.remove(employee);
			session.getTransaction().commit();
			System.out.println("Done!");
		} finally {
			session.close();
			factory.close();
		}
	}
}
