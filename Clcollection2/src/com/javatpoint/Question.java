package com.javatpoint;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String name;
	private List<Answer> answers;
	
	public Question() {
		
	}
	public void displayInfo() {
		System.out.print(id+""+name);
		System.out.print("answers are:");
		Iterator<Answer> itr=answers.iterator();
		 while(itr.hasNext()){  
		        System.out.println(itr.next());  
		    }  
		
		
	}
	public Question(int id, String name, List<Answer> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
}
