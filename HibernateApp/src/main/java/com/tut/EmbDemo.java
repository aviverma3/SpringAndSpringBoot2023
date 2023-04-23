package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory =  cfg.buildSessionFactory();

        Student st1 =  new Student();
        st1.setName("Abhilash");
        st1.setCity("Gwalior");

        Certificate crt1 = new Certificate();
        crt1.setCourse("Java");
        crt1.setDuration("1.5 months");
        st1.setCrt(crt1);

        Session session =  factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st1);
        tx.commit();
        factory.close();
    }
}
