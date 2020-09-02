package com.best.student_manager.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Student implements Serializable {
	
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
 private String name;
 


 @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="grade_id")
	private Grade grade;
 
 @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="section_id")
	private Section section;
 
 public Student() {
	 
 }

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Grade getGrade() {
	return grade;
}

public void setGrade(Grade grade) {
	this.grade = grade;
}

public Section getSection() {
	return section;
}

public void setSection(Section section) {
	this.section = section;
}


	
}
