package com.best.student_manager.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;


import com.best.student_manager.model.Grade;
import com.best.student_manager.model.Section;
import com.best.student_manager.model.Student;
import com.best.student_manager.util.HibernateUtlity;

public class StudentDao {

	private final SessionFactory sessionFactory;
	
	public StudentDao() {
		sessionFactory=HibernateUtlity.getSessionFactory();
	}

public void saveGrade(Grade grade) {
	Session session=sessionFactory.openSession();
	
	session.beginTransaction();
	session.save(grade);
	session.getTransaction().commit();
	session.close();
}
public Grade getGradeById(Integer id) {
	Session session=sessionFactory.openSession();
	Criteria cr=session.createCriteria(Grade.class);
	cr.add(Restrictions.eq("id", id));
	return (Grade)cr.uniqueResult();
}

public Grade getSectionById(Integer id) {
	Session session=sessionFactory.openSession();
	Criteria cr=session.createCriteria(Section.class);
	cr.add(Restrictions.eq("id", id));
	return (Section)cr.uniqueResult();
}
public List<Grade> getGradeList(){
	Session session=sessionFactory.openSession();
	
	Criteria cr=session.createCriteria(Grade.class);
	return (List<Grade>)cr.list();
}

public void saveSection(Section sec) {
	Session session=sessionFactory.openSession();
	
	session.beginTransaction();
	session.save(sec);
	session.getTransaction().commit();
	session.close();
	
}

public List<Section> getSectionList(){
		Session session=sessionFactory.openSession();
		
		Criteria cr=session.createCriteria(Section.class);
		return (List<Section>)cr.list();
	}
public void saveStudent(Student stu) {
	Session session=sessionFactory.openSession();
	
	session.beginTransaction();
	session.save(stu);
	session.getTransaction().commit();
	session.close();
	
}
public Student getStudentById(Integer id) {
	Session session=sessionFactory.openSession();
	Criteria cr=session.createCriteria(Student.class);
	cr.add(Restrictions.eq("id", id));
	return (Student)cr.uniqueResult();
}



}