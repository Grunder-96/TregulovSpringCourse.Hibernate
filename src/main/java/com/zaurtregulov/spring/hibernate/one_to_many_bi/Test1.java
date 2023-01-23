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
//			Department department = new Department("Sales", 800, 1500);
//			Employee emp1 = new Employee("Grigory", "Taran", 800);
//			Employee emp2 = new Employee("Zaur", "Tregulov", 1300);
//			Employee emp3 = new Employee("Leonid", "Agutin", 1100);
//			department.addEmployeeToDepartment(emp1);
//			department.addEmployeeToDepartment(emp2);
//			department.addEmployeeToDepartment(emp3);
//			
//			session.beginTransaction();
//			session.persist(department);
//			session.getTransaction().commit();
//			
//			System.out.println("Done!");
//*****************************************************************************************			
			session.beginTransaction();
			System.out.println("Get department:");
			Department department = session.get(Department.class, 5);
			
			System.out.println("Подгрузка работников:");
			department.getEmps().get(0);
			session.getTransaction().commit();
			System.out.println("Show employees of the department");
			System.out.println(department.getEmps());
			System.out.println("Done!");
//*****************************************************************************************		
//			session.beginTransaction();
//			Employee emp = session.get(Employee.class, 1);
//			System.out.println(emp);
//			System.out.println(emp.getDepartment());
//			session.getTransaction().commit();
//			System.out.println("Done!");
//*****************************************************************************************
//			session.beginTransaction();
//			Employee emp = session.get(Employee.class, 4);
//			session.remove(emp);
//			session.getTransaction().commit();
//			System.out.println("Done!");
		}
	}
}
