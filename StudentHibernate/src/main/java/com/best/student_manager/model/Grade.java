package com.best.student_manager.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Grade")
public class Grade {
	@Id
	@GeneratedValue
 private Integer id;
	@Column(name="name")
 private String name;
	
	
	@OneToMany(mappedBy = "grade")
	private Set<Section> sections;
	
	@OneToMany(mappedBy = "student")
	private Set<Student> students;
	
 public Grade() {
	 
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

public Set<Section> getSections() {
	return sections;
}

public void setSections(Set<Section> sections) {
	this.sections = sections;
}

public Set<Student> getStudents() {
	return students;
}

public void setStudents(Set<Student> students) {
	this.students = students;
}
 
	
}
