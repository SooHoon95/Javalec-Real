package com.javalec.base;

import javax.swing.JOptionPane;

public class Calculator extends Exercise_01 {

	

	//Field
	
	//Constructor
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Method
	public String Plus(String a , String b) {
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		
		return Integer.toString(num1 + num2);
	}
	public String Minus(String a , String b) {
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		
		return Integer.toString(num1 - num2);
	}
	public String Multi(String a , String b) {
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		
		return Integer.toString(num1 + num2);
	}
	public String Share(String a , String b) {
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		String result;
		if (num2 == 0 ) {
			result = "0으로는 나눌 수 없습니다!";
		}else {
			result = String.format("%.3f", ((double)num1/(double)num2));
		}
			return result;
		
	}
	
	
}