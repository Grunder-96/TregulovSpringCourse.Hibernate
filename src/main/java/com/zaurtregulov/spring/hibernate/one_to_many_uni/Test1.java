package com.zaurtregulov.spring.hibernate.one_to_many_uni;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zaurtregulov.spring.hibernate.one_to_many_uni.entity.Employee;
import com.zaurtregulov.spring.hibernate.one_to_many_uni.entity.Department;


public class Test1 {
	
	public static void main(String[] args) {

		try (SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Department.class)
				.buildSessionFactory(); 
			 Session	session = factory.getCurrentSession()) 
		{
//			Department department = new Department("IT", 400, 1200);
//			Employee emp1 = new Employee("Grigoriy", "Taran", 400);
//			Employee emp2 = new Employee("Andrey", "Sidorov", 1000);
//			department.addEmployeeToDepartment(emp1);
//			department.addEmployeeToDepartment(emp2);
//			session.beginTransaction();
//			session.persist(department);
//			session.getTransaction().commit();
//			System.out.println("Done!");
			
//			session.beginTransaction();
//			Department department = session.get(Department.class, 4);
//			System.out.println(department);
//			System.out.println(department.getEmps());
//			session.getTransaction().commit();
//			System.out.println("Done!");
			
//			session.beginTransaction();
//			Employee emp = session.get(Employee.class, 1);
//			System.out.println(emp);
//			System.out.println(emp.getDepartment());
//			session.getTransaction().commit();
//			System.out.println("Done!");

			session.beginTransaction();
			Department department = session.get(Department.class, 3);
			session.remove(department);
			session.getTransaction().commit();
			System.out.println("Done!");
		}
	}
}
