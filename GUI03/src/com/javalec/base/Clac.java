package com.javalec.base;

import javax.swing.JOptionPane;

public class Clac extends Practice_03 {

	String a,b;
	
	
	public Clac() {
		// TODO Auto-generated constructor stub
	}

	public Clac(String a, String b) {
		this.a = a;
		this.b = b;
	}




	public String Plus(String a , String b) {
		int Num1 = Integer.parseInt(a);
		int Num2 = Integer.parseInt(b);
		
		String addresult = Integer.toString(Num1+Num2);
		return addresult;
	}
	public String Minus(String a , String b) {
		int Num1 = Integer.parseInt(a);
		int Num2 = Integer.parseInt(b);
		
		String minresult = Integer.toString(Num1-Num2);
		return minresult;
	}
	public String Multi(String a , String b) {
		int Num1 = Integer.parseInt(a);
		int Num2 = Integer.parseInt(b);
		
		String mulresult = Integer.toString(Num1*Num2);
		return mulresult;
	}
	public String Divide(String a , String b) {
		int Num1 = Integer.parseInt(a);
		int Num2 = Integer.parseInt(b);
		String divresult;
		try {
			divresult = String.format("%.3f",((double)Num1/(double)Num2));
		} catch (Exception e) {
			divresult =  "0으로는 나눌 수 없습니다.";
		}
		return divresult;
	}
}
