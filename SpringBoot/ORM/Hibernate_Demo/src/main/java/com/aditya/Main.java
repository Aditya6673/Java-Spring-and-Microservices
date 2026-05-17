package com.aditya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
//        Alien a = new Alien();
//        a.setAid(104);
//        a.setAname("Avni");
//        a.setTech("Database Engineer");
        SessionFactory factory = new Configuration()
                .addAnnotatedClass(com.aditya.Alien.class)
                .configure()
                .buildSessionFactory();
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction(); // save update delete
//        s.persist(a);
//        Alien a = s.byId(Alien.class).getReference(103); // lazy loading
//        s.merge(a);
        Alien a = s.find(Alien.class, 104);
        s.remove(a);
        tx.commit();
//        Alien a = s.get(Alien.class, 103); // eager loading
//        System.out.println(a.toString());


        s.close();
        factory.close();

    }
}
