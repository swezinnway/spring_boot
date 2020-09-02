package com.javatpoint;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Question {

	private int id;  
	private String name;  
	private Set<String> answers; 
	
	
	public Question() {
		
	}


	
	
	public void displayInfo() {
		System.out.print(id+""+name);
		System.out.print("answer are:");
		Iterator<String> itr=answers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}




	public Question(int id, String name, Set<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
}
