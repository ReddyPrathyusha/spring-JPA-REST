package com.example.DemoHib;

import org.hibernate.Session;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        //System.out.println( "Hello World!" );
    	StudentName an= new StudentName();// this object is created becoz we created another class for names.
    	an.setFname("PradeepReddy");
    	an.setLname("Padi");
    	an.setMname("Reddy");
    	
    	Student s =new Student();
    	s.setRollno(11);
    	s.setSname(an);
    	//s.setSname("Nikhil");
    	// as this session factory is interface we can't create object to it so create a class called configuration
    	Configuration con= new Configuration().configure().addAnnotatedClass(Student.class);
    	
    	
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(reg);
    	//here we can't create object for session becoz it is an interface so we create session factory
    	Session session =sf.openSession();// open session is the method which gives the object of session
    	
    	//Here this save method belongs to the interface called session and this session belongs to hibernate framework
    	Transaction tx= session.beginTransaction();
    	session.save(s);//save method is used when we want to save data into database.
    	//if i want fetch any data from database with the  help of hibernate s = (Student)session.get(Student.class,1);
             tx.commit();
    	
    }
}