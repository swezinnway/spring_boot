package com.best.bright.onile_course.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Level implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long level_id;
	private int course_id;
	private String level_name;
	
	@ManyToOne
	private Course course;

	@OneToOne
	
	private Student_enrolment student_enrolment;
	
	public Level() {}
	
	
	public Long getLevel_id() {
		return level_id;
	}


	public void setLevel_id(Long level_id) {
		this.level_id = level_id;
	}


	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getLevel_name() {
		return level_name;
	}
	public void setLevel_name(String level_name) {
		this.level_name = level_name;
	}
	
	

}
