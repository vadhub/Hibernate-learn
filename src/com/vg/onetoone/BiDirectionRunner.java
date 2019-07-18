package com.vg.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vg.hibernate.entity.Instructor;
import com.vg.hibernate.entity.InstructorDetail;

public class BiDirectionRunner {

	public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();		
	
		int theId = 4;
		
		InstructorDetail instDetail = session.get(InstructorDetail.class, theId);
		
		System.out.println("instucter associate "+ instDetail.getInstructor());
		
		session.getTransaction().commit();
		
		factory.close();
		
		session.close();
		
		System.out.println("Woohoo");
	}

}
