package com.hibernate.model;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;






public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new App().showStuListBySelectList();
	}
	
	public void listStudent() {
		Session session = HibernateUtility.getSessionFactory().openSession();
		 Transaction tx = null;
		 try {
	           tx = session.beginTransaction();
	           List students = session.createQuery("FROM Student").list(); 
	           for (Iterator iterator = students.iterator(); iterator.hasNext();){
	        	   Student student=(Student) iterator.next();
	        	   
	        	   System.out.println("Student Id: " + student.getId()); 
	              System.out.println("Student Name: " + student.getName()); 
	              System.out.println(" Student Email: " + student.getEmail()); 
	              System.out.println("Student Phone: " + student.getPhone()); 
	              System.out.println("Student Address: " + student.getAddress()); 
	              System.out.println(" Student Gender: " + student.getGender()); 
	           
	           }
	           tx.commit();
	        } catch (HibernateException e) {
	           if (tx!=null) tx.rollback();
	           e.printStackTrace(); 
	        } finally {
	           session.close(); 
	        }
	     }
	
	
	public void showStuListBySelectList(){
   	 Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction tx = null;
        
        try {
        	 Criteria cr = session.createCriteria(Student.class);
           tx = session.beginTransaction();
           String hql = "FROM Student S ";
                   
      Query query = session.createQuery(hql);
      List<Student> results = (List<Student>)query.list();
      
      
      cr.add(Restrictions.like("name", "Mee%"));
     
   
  	//Output : A,B,C,D,E
  //	items.forEach(item->System.out.println(item));
          results.forEach(v-> System.out.println(v.getAddress()));
           tx.commit();
        } catch (HibernateException e) {
           if (tx!=null) tx.rollback();
           e.printStackTrace(); 
        } finally {
           session.close(); 
        }
   	
   	
   }
	}


