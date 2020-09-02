package com.best.student_manager.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
 private Integer id;
 private String name;
 
 @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="section_id")
 private Section section;
 
 
 
 
 @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="grade_id")
 private Grade grade;




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




public Section getSection() {
	return section;
}




public void setSection(Section section) {
	this.section = section;
}




public Grade getGrade() {
	return grade;
}




public void setGrade(Grade grade) {
	this.grade = grade;
}
	
	
}
