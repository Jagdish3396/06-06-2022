package com.BikkadIt;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class CrudeDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		/*OldStudent o = new OldStudent();
		o.setId(30);
		o.setName("satish");
		o.setAddress("vaijapur");
		o.setEmail("satishmagar@gmail.com");

		OldStudent o1 = new OldStudent();
		o1.setId(40);
		o1.setName("ganesh");
		o1.setAddress("nandgaon");
		o1.setEmail("bodkheganesh@gmil.com");
		session.beginTransaction();
		session.save(o);
		session.save(o1);
		session.getTransaction().commit();*/
		
		
		//this are the three ways for inserting data into database with hql 
		//we do not have direct query for inserting data into hql so we are having these queries mentioned below.
		/*String sql="insert into Student(id,name,address,email)"+"select id,name,address,email from OldStudent";
		String sql="insert into Student(id,name,address,email)select id,name,address,email from OldStudent";
		String sql="insert into Student(id,name,address,email)select os.id,os.name,os.address,os.email from OldStudent os";


		session.beginTransaction();
		Query query = session.createQuery(sql);
		int i=query.executeUpdate();
		session.getTransaction().commit();
		System.out.println(i);*/
		
		//update value hard coded values
		//String hql="update Student set name='govinda' where id =10";
		/*session.beginTransaction();
		Query query = session.createQuery(hql);
		int i = query.executeUpdate();
		session.getTransaction().commit();
		System.out.println(i);*/
		
		
		//update query by using user input single column value update
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int a1=sc.nextInt();
		System.out.println("enter name");
		String a2=sc.next();
		String hql="update Student set name=:name where id=:id";
		session.beginTransaction();	
		Query query = session.createQuery(hql);
		query.setParameter("name",a2);
		query.setParameter("id",a1);
		query.executeUpdate();
		session.getTransaction().commit();*/
		
		//update multiple column data.
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int a=sc.nextInt();
		System.out.println("enter name");
		String a1=sc.next();
		System.out.println("enter address");
		String a2=sc.next();
		System.out.println("enter email");
		String a3=sc.next();
		String hql="update Student set name=:name,address=:address,email=:email where id=:id";
		session.beginTransaction();
		Query query = session.createQuery(hql);
	
		query.setParameter("name", a1);
		query.setParameter("address", a2);
		query.setParameter("email", a3);
		query.setParameter("id", a);
		query.executeUpdate();
		session.getTransaction().commit();*/
		
		
		//update id
		/*String hql="update Student set id=11 where id=20";
		session.beginTransaction();
		Query query = session.createQuery(hql);
		query.executeUpdate();
		session.getTransaction().commit();*/
		/*String hql="delete Student where id=:id";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int a=sc.nextInt();	
		Query query = session.createQuery(hql);
		query.setParameter("id", a);
		session.beginTransaction();
		query.executeUpdate();
		session.getTransaction().commit();*/
		
		//delete whole Data from table
	/*	String hql="delete Student";
		session.beginTransaction();
		Query query = session.createQuery(hql);
		query.executeUpdate();
		session.getTransaction().commit();*/
		
		
		
		
	
		
	

	}

}
