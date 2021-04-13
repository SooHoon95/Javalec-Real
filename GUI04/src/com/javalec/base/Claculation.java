package com.javalec.base;

public class Claculation {

	int num1,num2;
	


	public Claculation() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Claculation(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	

	
	public String Add() {
		int addresult = num1 + num2;
		String str1 = (Integer.toString(num1) + " + " + Integer.toString(num2) + " = " + Integer.toString(num1 + num2));
		
		return str1;
	}
	public String Min() {
		int minresult = num1 - num2;
		String str2 = (Integer.toString(num1) + " - " + Integer.toString(num2) + " = " + Integer.toString(num1 - num2));
		
		return str2;
	}
	public String Mul() {
		int mulresult = num1 * num2;
		String str3 = (Integer.toString(num1) + " X " + Integer.toString(num2) + " = " + Integer.toString(num1 * num2));
		
		return str3;
	}
	public String Div() {
		double divresult = (double)num1 / (double)num2;
		String str4 = (Integer.toString(num1) + " / " + Integer.toString(num2) + " = " + String.format("%.3f",((double)num1 / (double)num2)));
		
		return str4;
	}


}