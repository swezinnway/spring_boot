package com.bestbright.onlie_course.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Question implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long question_id;
	private String question_name;
	
	@OneToOne(mappedBy="questions",cascade=CascadeType.ALL)
	private Level_material level_material;

	
	@OneToMany(mappedBy = "question")
	private Set<Answer> answers;
	public Question() {
		
	}
	
	public Long getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}

	public String getQuestion_name() {
		return question_name;
	}

	public void setQuestion_name(String question_name) {
		this.question_name = question_name;
	}

	public Level_material getLevel_material() {
		return level_material;
	}

	public void setLevel_material(Level_material level_material) {
		this.level_material = level_material;
	}
	

}
