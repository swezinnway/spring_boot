package com.bestbright.onlie_course.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Level_material {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Level_material_id;
	private String Level_material_name;
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name="level_id")
	private Level level;
	
	
	
	
	@OneToOne
	private Question questions;
	
	private Level_material() {}
	
	

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}



	public Long getLevel_material_id() {
		return Level_material_id;
	}



	public void setLevel_material_id(Long level_material_id) {
		Level_material_id = level_material_id;
	}



	public String getLevel_material_name() {
		return Level_material_name;
	}



	public void setLevel_material_name(String level_material_name) {
		Level_material_name = level_material_name;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public Question getQuestions() {
		return questions;
	}



	public void setQuestions(Question questions) {
		this.questions = questions;
	}
}
