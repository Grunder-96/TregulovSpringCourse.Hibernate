package com.zaurtregulov.spring.hibernate.one_to_many_bi;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zaurtregulov.spring.hibernate.one_to_many_bi.entity.Employee;
import com.zaurtregulov.spring.hibernate.one_to_many_bi.entity.Department;


public class Test1 {
	
	public static void main(String[] args) {

		try (SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Department.class)
				.buildSessionFactory(); 
			 Session	session = factory.getCurrentSession()) 
		{
//			Department department = new Department("IT", 1200, 400);
//			Employee emp1 = new Employee("Grigory", "Taran", 400);
//			Employee emp2 = new Employee("Zaur", "Tregulov", 1150);
//			department.addEmployeeToDepartment(emp1);
//			department.addEmployeeToDepartment(emp2);
//			session.beginTransaction();
//			session.persist(emp2);
//			session.getTransaction().commit();
//			System.out.println("Done!");
			
//			session.beginTransaction();
//			Department department = session.get(Department.class, 1);
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
			Employee emp = session.get(Employee.class, 4);
			session.remove(emp);
			session.getTransaction().commit();
			System.out.println("Done!");
		}
	}
}
