package com.javatpoint;

public class Employee {

private Integer id;
private String name;
private Address address;

public Employee(Integer id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}

void show(){  
    System.out.println(id+" "+name);  
    System.out.println(address.toString());  
}  

}
