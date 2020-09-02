package com.best.student_manager.model;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="Section")
public class Section {

	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="name")
	private String name;
	
	
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="grade_id")
	private Grade grade;
	
	
	@OneToMany(mappedBy = "student")
	private Set<Student> students;
	
	public Section() {}



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



	public Set<Student> getStudents() {
		return students;
	}



	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	
}
