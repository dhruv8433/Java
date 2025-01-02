package com.hibernate.DemoHibernatee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * A simple Hibernate application to demonstrate saving objects to the database.
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create the first Alien object
        Alien a1 = new Alien();
        a1.setAid(101); // Set Alien ID
        a1.setAname("dhruv"); // Set Alien name
        a1.setColor("red"); // Set Alien color
        
        // Create the second Alien object
        Alien a2 = new Alien();
        a2.setAid(102); // Set Alien ID
        a2.setAname("rni"); // Set Alien name
        a2.setColor("blue"); // Set Alien color

        // Step 1: Configure Hibernate
        // - Load the Hibernate configuration from hibernate.cfg.xml
        // - Add the Alien class (with annotations) to the configuration
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

        // Step 2: Build the SessionFactory
        // - The SessionFactory is a heavyweight object used to create sessions.
        SessionFactory sf = con.buildSessionFactory();

        // Step 3: Open a session
        // - The Session object is the interface between the application and the database.
        Session session = sf.openSession();

        // Step 4: Begin a transaction
        // - Hibernate requires a transaction for any database operation.
        Transaction tx = session.beginTransaction();

        // Step 5: Save objects to the database
        // - Persist the Alien objects (a1 and a2) in the database.
        session.save(a1);
        session.save(a2);

        // Step 6: Commit the transaction
        // - Ensure all operations within the transaction are applied to the database.
        tx.commit();

        // The session and factory should ideally be closed after use to release resources.
        // session.close();
        // sf.close();
    }
}
