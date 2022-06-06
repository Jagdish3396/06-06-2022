package com.BikkadIt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		/*Student s = new Student();
		s.setName("nitesh");
		s.setEmail("bornarejagdish9@gmail.com");
		//Transient state end here( when object is created in jvm and values are assigned to an oject. )
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();*/
		//persistant Stage end here( in this stage data is available to session object as well as DataBase also)
		//if we call Save method Data is getting saved in session object and once we call commit() method
		//Data is getting saved in database also.
		//session.close();
		//Detatched state:if our Data is available in Database but not in session this Stage is called as Detached State
		//this can be done by closing session connection ie.-session.close();
		//in this case my data is available in database but not in session object.
		Student s1=new Student();
		s1.setId(2);
		session.beginTransaction();
		session.delete(s1);
		session.getTransaction().commit();
		//in removed State Data is deleted from Database but it remains in session Object it is called as Removed State.
	}

}
