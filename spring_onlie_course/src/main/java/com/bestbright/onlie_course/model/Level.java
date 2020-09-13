package com.bestbright.onlie_course.model;

import java.io.Serializable;
import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	private String level_name;
	
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;

	@OneToOne
	private Student_enrolment student_enrolment;
	
	@OneToMany(mappedBy = "level")
	private Set<Level_material> level_material;
	
	public Level() {}
	
	
	public Long getLevel_id() {
		return level_id;
	}


	public void setLevel_id(Long level_id) {
		this.level_id = level_id;
	}

	public String getLevel_name() {
		return level_name;
	}
	public void setLevel_name(String level_name) {
		this.level_name = level_name;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}
	
	

}
