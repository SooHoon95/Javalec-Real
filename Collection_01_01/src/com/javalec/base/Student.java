package com.javalec.base;

public class Student {

	
	
	//Field
	String name;
	int score;
	
	//Constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}


	
	//Method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
}
