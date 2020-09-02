package com.javapoint;

public class A {
B b;

A() {
	System.out.println("A is created");
	
}
public B get() {
	return b;
	
}

public void setB(B b) {
	this.b=b;
}


void print() {
	System.out.println("Hello a");
}
void display() {
	print();
	b.print();
}
}
