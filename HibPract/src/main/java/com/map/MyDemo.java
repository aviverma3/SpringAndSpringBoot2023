package com.map;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml").addAnnotatedClass(Answer.class)
                .addAnnotatedClass(Questions.class);
        SessionFactory factory =  cfg.buildSessionFactory();
        //create question
        Questions q1 = new Questions();
        q1.setQuestionId(1212);
        q1.setQuesString("What is java");

        //create answer
        Answer a1 =  new Answer();
        a1.setAnswerId(343);
        a1.setAnswer("Java is programming Language");
        q1.setAnswer(a1);

        //session
        Session session = factory.openSession();
        Transaction tx =  session.beginTransaction();
        session.save(q1);
      //  session.save(a1);
        session.close();

        factory.close();


    }
}
