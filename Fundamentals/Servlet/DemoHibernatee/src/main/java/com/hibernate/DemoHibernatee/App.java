package com.hibernate.DemoHibernatee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Alien a1 = new Alien();
       // first alien
       a1.setAid(101);
       a1.setAname("dhruv");
       a1.setColor("red");
       
       Alien a2 = new Alien();
       a2.setAid(102);
       a2.setAname("rni");
       a2.setColor("blue");
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
       
       SessionFactory sf = con.buildSessionFactory();
       
       // this session is belongs to hibernate library and we have to import it in libraries
       Session session = sf.openSession();
       
       Transaction tx = session.beginTransaction();
       
       session.save(a1);
       session.save(a2);
       
       tx.commit();
    }
}
