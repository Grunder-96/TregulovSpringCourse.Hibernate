package com.zaurtregulov.spring.hibernate.many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zaurtregulov.spring.hibernate.many_to_many.entity.Child;
import com.zaurtregulov.spring.hibernate.many_to_many.entity.Section;

public class Test {
	
	public static void main(String[] args) {
		try (		
				SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Child.class).addAnnotatedClass(Section.class)
					.buildSessionFactory(); Session session = factory.getCurrentSession()
		) {
//			Section section1 = new Section("football");
//			Child child1 = new Child("Zaur", 5);
//			Child child2 = new Child("Anna", 7);
//			Child child3 = new Child("Peter", 12);
//			
//			section1.addChildToSection(child1);
//			section1.addChildToSection(child2);
//			section1.addChildToSection(child3);
//			
//			session.beginTransaction();
//			
//			session.persist(section1);
//			
//			session.getTransaction().commit();
//			System.out.println("Done!");
//****************************************************************************************************		
//			Section section1 = new Section("volleyball");
//			Section section2 = new Section("chess");
//			Section section3 = new Section("math");
//			Child child1 = new Child("Igor", 10);
//			
//			child1.addSectionToChild(section1);
//			child1.addSectionToChild(section2);
//			child1.addSectionToChild(section3);
//			
//			session.beginTransaction();
//			
//			session.persist(child1);
//			
//			session.getTransaction().commit();
//			System.out.println("Done!");
//****************************************************************************************************
//			session.beginTransaction();
//			Section section = session.get(Section.class, 1);
//			System.out.println(section);
//			System.out.println(section.getChildren());
//			session.getTransaction().commit();
//			System.out.println("Done!");
//****************************************************************************************************
			session.beginTransaction();
			Child child = session.get(Child.class, 4);
			System.out.println(child);
			System.out.println(child.getSections());
			session.getTransaction().commit();
			System.out.println("Done!");
		}
	}
}
