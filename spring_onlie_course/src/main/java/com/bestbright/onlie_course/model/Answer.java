package com.bestbright.onlie_course.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Answer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Long answer_id;
	private String answer_name;
	private boolean status;
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="question_id")
	private Question question;
	
	
	
	
	@OneToOne
	private StudentResult studentResults;
	
	
	
	
	
	public Answer () {}
	public Long getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(Long answer_id) {
		this.answer_id = answer_id;
	}
	public String getAnswer_name() {
		return answer_name;
	}
	public void setAnswer_name(String answer_name) {
		this.answer_name = answer_name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
	
}
