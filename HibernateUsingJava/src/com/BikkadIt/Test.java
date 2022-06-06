package com.BikkadIt;

import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Student s=new Student();
		/*
		s.setId(80);
		s.setName("Nitesh");
		s.setEmail("bornarejagdish7@gmail.com");
		session.beginTransaction();
		Serializable save = session.save(s);
		System.out.println(save);
		
		//session.getTransaction().commit();*/
		//session.beginTransaction();
		//Student student=session.get(Student.class, 80);//if entry not founded in database returns null
		//System.out.println(student);
		//session.getTransaction().commit();
		//Student student = session.load(Student.class,80);
		//if we are not printing object value no any query is getting executed
		//Student student2 = session.load(Student.class,70);
		//Student student3 = session.load(Student.class,80);
		//Student student4 = session.load(Student.class,70);
		Student student = session.get(Student.class, 80);
		//if we are not printing object still select query is fired
		
		
		//if entry is not founded in database it throws exception:org.hibernate.ObjectNotFoundException
		/*System.out.println(student);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);*/
		//Student s1=new Student();
		//s1.setId(50);
		//s1.setEmail("bornarejagdish99@gmail.com");
		//session.beginTransaction();
		//session.update(s1);
		//session.getTransaction().commit();
		/*Student student2 = session.get(Student.class, 70);
		session.beginTransaction();
		student2.setEmail("bornarenitesh20@gmail.com");
		session.update(student2);
		session.getTransaction().commit();*/
//if data is already there in session object and we want to update it again it will give exception
	//	to avoid this use merge method
 session.get(Student.class, 70);
 Student s2=new Student();
 s2.setId(70);
 s2.setName("naveen");
 s2.setEmail("naveenreddy@gmail.com");
 session.beginTransaction();
 session.merge(s2);
 session.getTransaction().commit();
 
		
		//session.beginTransaction();
		//student2.setEmail("bornarenitesh20@gmail.com");
		//session.update(student2);
		//session.getTransaction().commit();
		/*Student s2=new Student();
		s2.setId(10);
		session.beginTransaction();
		
		session.delete(s2);
		session.getTransaction().commit();	*/
	}

}
