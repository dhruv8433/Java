package com.hql.HQLExample;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 **/

public class App 
{
    public static void main( String[] args )
    {
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		
		SessionFactory sf = con.buildSessionFactory();

		// Step 3: Open a session
		// - The Session object is the interface between the application and the
		// database.
		Session session = sf.openSession();
//		
//		for (int i = 0; i < 50; i ++) {
//			Alien a1 = new Alien();
//			a1.setAid(i);
//			a1.setAname("Alien" + i);
//			a1.setColor("color"+ i);
//			session.save(a1);
//		}


		// Step 4: Begin a transaction
		// - Hibernate requires a transaction for any database operation.
		Transaction tx = session.beginTransaction();

		// Step 5: Save objects to the database
		// - Persist the Alien objects (a1 and a2) in the database.
//		tx.commit();
		
		Query q = session.createQuery("from Alien where aid = 40");
//		List<Alien> aliens =  q.list();
		
		// or
		
		Alien uniq = (Alien) q.uniqueResult();
		System.out.print(uniq);
		
//		for(Alien a : aliens) {
//			System.out.println(a);
//		}

		// Native Queries
//		SQLQuery query = session.createSQLQuery("select name, marks from student where marks>60"); 
//		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//		for(Object o: students)
//		{
//			Map m = (Map)o;
//			System.out.println(m.get("name")+ "" + m.get("marks") );
//		}
    }
}
