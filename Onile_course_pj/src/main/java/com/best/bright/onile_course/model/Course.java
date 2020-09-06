package com.best.bright.onile_course.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Course implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long course_id;
	private String course_name;
	private String course_description;
	
	@OneToMany(mappedBy = "course",targetEntity=Level.class,cascade = CascadeType.ALL)

	private Set<Level> levelList;
	 
	
	public Course() {}

	

	public Long getCourse_id() {
		return course_id;
	}



	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
	}



	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_description() {
		return course_description;
	}

	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}
	
	
	

}
