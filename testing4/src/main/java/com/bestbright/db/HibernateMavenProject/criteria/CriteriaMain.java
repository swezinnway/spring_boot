package com.bestbright.db.HibernateMavenProject.criteria;


import java.util.Iterator;
import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.hibernate.model.Employee;
import com.hibernate.model.HibernateUtility;
import com.hibernate.model.Student;


public class CriteriaMain {

	public static void main(String[] args) {
		
		CriteriaMain c=new CriteriaMain();
		
		
		c.studentList();
	}
//	public Integer addEmployee(String firstName,String lastName,double salary){
//		Session session = HibernateUtility.getSessionFactory().openSession();
//       
//        Transaction tx = null;
//        Integer employeeID = null;
//        // Check database version
//       try{
//    	   tx= session.beginTransaction();
//    	   Employee e1=new Employee(firstName,lastName,salary);
//   		
//   		session.save(e1);
//   		tx.commit();
//       }catch(Exception e){
//   	  if (tx!=null) tx.rollback();
//      e.printStackTrace(); 
//   } finally {
//      session.close(); 
//   }
//   return employeeID;
//		
//	}
	public void studentList(){
		Session session = HibernateUtility.getSessionFactory().openSession();
	       
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         Criteria cr = session.createCriteria(Student.class);
	         // Add restriction.
	         
//       cr.add(Restrictions.eq("name", "swe zin"));
//	         cr.add(Restrictions.ilike("name", "Mee%"));
	       //  cr.add(Restrictions.isNull("name"));
	        // cr.add(Restrictions.isEmpty("grade"));
	         Criterion address = Restrictions.eq("address", "dawei");
	         Criterion name = Restrictions.like("name","Swe%");
	         
//	         LogicalExpression orExp = Restrictions.or(address, name);
//	         cr.add(orExp);
//	         LogicalExpression andExp = Restrictions.and(address, name);
//       cr.add(andExp);
//	         
	         
	         List students = cr.list();

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
	   
//	   
//	   public void countEmployee(){
//		   Session session = HibernateUtility.getSessionFactory().openSession();
//	       
//	      Transaction tx = null;
//	      
//	      try {
//	         tx = session.beginTransaction();
//	         Criteria cr = session.createCriteria(Employee.class);
//
//	         // To get total row count.
//	         cr.setProjection(Projections.rowCount());
//	         List rowCount = cr.list();
//
//	         System.out.println("Total Coint: " + rowCount.get(0) );
//	         tx.commit();
//	      } catch (HibernateException e) {
//	         if (tx!=null) tx.rollback();
//	         e.printStackTrace(); 
//	      } finally {
//	         session.close(); 
//	      }
//	}
	   public void totalSalary(){
		   Session session= HibernateUtility.getSessionFactory().openSession();
		   Transaction tx = null;
		      
		      try {
		         tx = session.beginTransaction();
		         Criteria cr = session.createCriteria(Employee.class);

		         // To get total salary.
		         cr.setProjection(Projections.sum("salary"));
		         List totalSalary = cr.list();

		         System.out.println("Total Salary: " + totalSalary.get(0) );
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
	   }
}
