package hibernateFirstAppUsingXml;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {

	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

		MetadataSources mds = new MetadataSources(registry);

		Metadata md = mds.getMetadataBuilder().build();

		SessionFactory sessionFactory = md.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		// 3 methods to save data.
		/*
		 * Student stu = new Student(); Scanner sc=new Scanner(System.in);
		 * System.out.println("enter roll no"); int a=sc.nextInt(); stu.setRollno(a);
		 * System.out.println("enter name"); String b=sc.next(); stu.setSname(b);
		 * System.out.println("enter city"); String c=sc.next(); stu.setSaddress(c);
		 * session.save(stu);
		 */
		/*
		 * Student stu1 = new Student(); Scanner sc=new Scanner(System.in);
		 * System.out.println("enter roll no"); int a=sc.nextInt(); stu1.setRollno(a);
		 * System.out.println("enter name"); String b=sc.next(); stu1.setSname(b);
		 * System.out.println("enter city"); String c=sc.next(); stu1.setSaddress(c);
		 * session.persist(stu1);//persist method also works same as save ie.to save
		 * data to database.
		 */

		Student stu1 = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter roll no");
		int a = sc.nextInt();
		stu1.setRollno(a);
		System.out.println("enter name");
		String b = sc.next();
		stu1.setSname(b);
		System.out.println("enter city");
		String c = sc.next();
		stu1.setSaddress(c);
		session.saveOrUpdate(stu1);


		session.beginTransaction().commit();

		sessionFactory.close();
		session.close();

	}

}
