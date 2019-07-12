package com.vg.hibernate.starter;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vg.hibernate.entity.Student;


public class Starter {
	public static void main(String[] args){
				
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		Student student = new Student("Vasya", "Pupkin", "yoao@vg.com");
		
		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction().commit();
		
		factory.close();
		
		System.out.println("woohoo!");
	}
	
}
