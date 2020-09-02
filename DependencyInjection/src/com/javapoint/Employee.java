package com.javapoint;

public class Employee {

	private Integer id;  
	private String name; 
	
	public Employee() {
		System.out.println("gfdwejdu");
	}

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(Integer id) {
		super();
		this.id = id;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}
	void show(){  
	    System.out.println(id+" "+name);  
	}  
}
