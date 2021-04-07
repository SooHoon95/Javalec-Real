package com.javalec.gugu;

import java.util.Scanner;

public class Gugudan {

	
//	Field
	public int dan = 0;
	
//	Constructor
	
	public Gugudan() {
	}
	
	
//	Method
	
	public void spread() {
		System.out.println("구구단을 출력할 숫자를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		 dan = sc.nextInt();
		 
		for(int j=1; j<=9; j++) {
			System.out.println(dan + " X " + j + " = " + (dan*j));
		}
	}
	
	
	
	
	

}
