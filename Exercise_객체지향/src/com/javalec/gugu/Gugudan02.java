package com.javalec.gugu;

import java.util.Scanner;

public class Gugudan02 {

	
//	Field
	public int dan = 0;
	
//	Constructor
	
	public Gugudan02() {
	}
	
	
//	Method
	
	public void spread2() {
		System.out.println("구구단을 출력할 숫자를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		 dan = sc.nextInt();
		 
		for(int j=1; j<=9; j++) {
			switch (j%2) {
			case 0: 
				System.out.println(dan + " X " + "*" + " = " + (dan*j));
				break;
			case 1:
				System.out.println(dan + " X " + j + " = " + (dan*j));
			}
		}
		
	}
	
	public void spread3() {
		System.out.println("구구단을 출력할 숫자를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		 dan = sc.nextInt();
		 for(int i=1; i<=9; i++) {
			 System.out.println(dan + " X " + ((i%2==0) ? "*" : i) + " = " + dan*i);
			 
		 }
		
	}
	
	
	
	
	

}
