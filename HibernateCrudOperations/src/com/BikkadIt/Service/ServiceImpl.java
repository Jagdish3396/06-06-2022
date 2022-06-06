package com.BikkadIt.Service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.BikkadIt.Database.HibernateUtil;
import com.BikkadIt.Model.Student;

public class ServiceImpl implements Service {
	Scanner sc = new Scanner(System.in);
	Student s = new Student();

	public static void main(String[] args) {
		SessionFactory sessionFactory = com.BikkadIt.Database.HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

	}

	@Override
	public void save() {
		System.out.println("how many students Data you Want to save");
		int count = sc.nextInt();
		SessionFactory sessionFactory = com.BikkadIt.Database.HibernateUtil.getSessionFactory();
		Session session1 = sessionFactory.openSession();

		for (int i = 1; i <= count; i++) {
			System.out.println("enter id");
			int a = sc.nextInt();
			s.setId(a);
			System.out.println("enter name");
			String a1 = sc.next();
			s.setName(a1);
			System.out.println("enter email id");
			String a2 = sc.next();
			s.setEmail(a2);
			session1.beginTransaction();
			session1.merge(s);
			session1.getTransaction().commit();
			System.out.println("Data Saved Successfully");

		}

	}

	@Override
	public void showAll() {
		SessionFactory sessionFactory = com.BikkadIt.Database.HibernateUtil.getSessionFactory();
		Session session1 = sessionFactory.openSession();
		/*
		 * with this method we can display daya of perticuar id only
		 * System.out.println("enter id"); int a3 = sc.nextInt(); s.setId(a3); Student
		 * student = session1.get(Student.class, 10); System.out.println(student);
		 */
		// below method shows all data from DataBase
		String hql = " from Student";
		Query query = session1.createQuery(hql);
		List<Student> list = query.getResultList();
		for (Student s : list) {
			System.out.println(s);
		}

	}

	@Override
	public void update() {
		SessionFactory sessionFactory = com.BikkadIt.Database.HibernateUtil.getSessionFactory();
		Session session1 = sessionFactory.openSession();
		System.out.println("enter id ");
		int a3 = sc.nextInt();
		Student student = session1.get(Student.class, a3);
		student.setId(a3);
		boolean b1 = true;
		while (b1) {
			System.out.println("press 1 to update name");
			System.out.println("press 2 to update email");
			System.out.println("press 3 to exit");
			int ch1 = sc.nextInt();
			switch (ch1) {
			case 1:
				System.out.println("entername to update ");
				String a6 = sc.next();
				student.setName(a6);
				break;
			case 2:
				System.out.println("enter email to update");
				String a7 = sc.next();
				student.setEmail(a7);
				break;
			case 3:
				b1 = false;
				break;
			}
		}
		session1.beginTransaction();
		session1.update(student);
		session1.getTransaction().commit();
		System.out.println("Data updated Successfully");
	}

	@Override
	public void delete() {
		SessionFactory sessionFactory = com.BikkadIt.Database.HibernateUtil.getSessionFactory();
		Session session1 = sessionFactory.openSession();

		System.out.println("enter id");
		int a8 = sc.nextInt();
		Student student = session1.get(Student.class, a8);
		session1.beginTransaction();
		session1.delete(student);
		session1.getTransaction().commit();
		System.out.println("Data Deleted Successfully");

	}

}
