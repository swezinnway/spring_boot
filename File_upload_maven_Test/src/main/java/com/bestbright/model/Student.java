package com.bestbright.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String rollno;
	private String email;
	private String address;
	private String gender;
	private String phone;
	private String photoPath;
	private int age;
	
	public Student() {}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	public String getRollno() {
		return rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public Student(Long id, String name, String rollno,String email, String address, String gender, String phone, String photoPath,int age) {
		super();
		this.id = id;
		this.name = name;
		this.rollno=rollno;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.phone = phone;
		this.photoPath = photoPath;
		this.age=age;
	}
	
	
	
	
	
}
