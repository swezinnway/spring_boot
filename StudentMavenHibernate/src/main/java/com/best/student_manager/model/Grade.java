package com.best.student_manager.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="Grade")
public class Grade implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
 private Integer id;
	@Column(name="name")
 private String name;
	
	@OneToMany(mappedBy = "grade",targetEntity = Section.class)
	private Set<Section> sections;
	
	@OneToMany(mappedBy = "grade",targetEntity = Student.class)
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

public Grade(Integer id, String name, Set<Section> sections, Set<Student> students) {
	super();
	this.id = id;
	this.name = name;
	this.sections = sections;
	this.students = students;
}




}
