package com.BikkadIt.Service;

import com.BikkadIt.DataBase.HibernateUtil;
import com.BikkadIt.Model.OldStudent;
import com.BikkadIt.Model.Student;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Parameter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class ServiceImpl implements Service {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Scanner sc=new Scanner(System.in);
	}

	@Override
	public void save() {
		SessionFactory sessionFactory = com.BikkadIt.DataBase.HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		OldStudent o = new OldStudent();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of entries you want to perform");
		int count = sc.nextInt();
		for (int i = 1; i <= count; i++) {
			System.out.println("enter id");
			int a = sc.nextInt();
			System.out.println("enter name");
			String b = sc.next();
			System.out.println("enter Address");
			String c = sc.next();
			System.out.println("enter email");
			String d = sc.next();
			o.setId(a);
			o.setName(b);
			o.setAddress(c);
			o.setEmail(d);

			session.beginTransaction();
			session.merge(o);
			session.getTransaction().commit();
		}
	}

	@Override
	public void copy() {
		SessionFactory sessionFactory = com.BikkadIt.DataBase.HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		String hql = "insert into Student(id,name,address,email)select id,name,address,email from OldStudent";
		session.beginTransaction();
		Query query = session.createQuery(hql);
		query.executeUpdate();
		session.getTransaction().commit();
	}

	@Override
	public void show() {
		Scanner sc = new Scanner(System.in);
		SessionFactory sessionFactory = com.BikkadIt.DataBase.HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("enter the ID");
		int a6 = sc.nextInt();
		String hql = "from Student where id=:ID";
		session.beginTransaction();
		Query query = session.createQuery(hql);
		Query query2 = query.setParameter("ID", a6);
		Student stu = (Student) query.getSingleResult();
		session.getTransaction().commit();
		System.out.println(stu);
	}

	@Override
	public void showAll() {
		SessionFactory sessionFactory = com.BikkadIt.DataBase.HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "from Student";
		Query query = session.createQuery(hql);
		List<Student> list = query.getResultList();
		for (Student stu : list) {
			System.out.println(stu);
		}

	}

	@Override
	public void update() {
		//27.02.22 m
		Scanner sc=new Scanner(System.in);
		SessionFactory sessionFactory = com.BikkadIt.DataBase.HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "update Student Set name=:name, where id=:Id";
		System.out.println("Enter id");
		int k=sc.nextInt();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		
		query.setParameter("Id", k);
		query.executeUpdate();
		session.getTransaction().commit();
		
		
		
		
		
		

	}

	@Override
	public void delete() {
		SessionFactory sessionFactory = com.BikkadIt.DataBase.HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter id");
		int i = sc.nextInt();
		String hql = "delete Student where id=:ID";
		Query query = session.createQuery(hql);
		query.setParameter("ID", i);
		session.beginTransaction();
		query.executeUpdate();
		session.getTransaction().commit();

	}

	@Override
	public void deleteAll() {

		SessionFactory sessionFactory = com.BikkadIt.DataBase.HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "delete Student";
		session.beginTransaction();
		Query query = session.createQuery(hql);
		query.executeUpdate();
		session.getTransaction().commit();
	}
}
