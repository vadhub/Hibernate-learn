package com.vg.hibernate.starter;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vg.hibernate.entity.Student;


public class Starter {
	public static void main(String[] args){
				
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		Student student1 = new Student("Vasya", "Pupkin", "yoao@vg.com");
		//Student student2 = new Student("Petya", "Bol", "yomay@vg.com");
		//Student student3 = new Student("Olya", "Soun", "ymoy@vg.com");
		
		session.beginTransaction();
		//CRUD
		
		//add to db student "C"
		//session.save(student);
		//session.save(student2);
		//session.save(student3);
		
		//students to list "R"
		//List<Student> studentosy = session.createQuery("from Student").list();
		
		//for(Student temp: studentosy) {
		//	System.out.println(temp);
		//}
		
		//update data "U"
		
		
		session.getTransaction().commit();
		
		factory.close();
		
		System.out.println("woohoo!");
	}
	
}
