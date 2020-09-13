package com.bestbright.onlie_course.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Student_enrolment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long enrolment_id;
	private Date start_date;
	private Date end_date;
	
	
	@OneToOne(mappedBy="student_enrolment",cascade=CascadeType.ALL)
	private Level level;
	
	
	@OneToOne(mappedBy="student_enrolment",cascade=CascadeType.ALL)
	private Student student;
	
	
	public Student_enrolment() {
		
	}
	public Long getEnrolment_id() {
		return enrolment_id;
	}
	public void setEnrolment_id(Long enrolment_id) {
		this.enrolment_id = enrolment_id;
	}
	
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
