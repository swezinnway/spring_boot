package com.bestbright.onlie_course.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class StudentResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long studentResult_id;
	private double mark;
	private boolean status;
	
	@OneToOne(mappedBy="studentResult",cascade=CascadeType.ALL)
	private Answer answer;

	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	public StudentResult () {}
	
	public Long getStudentResult_id() {
		return studentResult_id;
	}

	public void setStudentResult_id(Long studentResult_id) {
		this.studentResult_id = studentResult_id;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
}
