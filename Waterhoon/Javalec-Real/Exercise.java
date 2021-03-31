package com.javalec.bass;

import java.util.Scanner;

public class Exercise {
	
	public static void main(String[] args) {
		
		//선언
		
		Scanner scanner = new Scanner(System.in);
		String result = "";
		
		
				
		
		
		//처리
		System.out.print("성적을 입력하세요 : ");
		int score = scanner.nextInt();
		
		switch (score / 10) {
		
		case 10 : case 9:
			result = "A";
			break;
		case 8 :
			result = "B";
			break;
		case 7 : 
			result = "C";
			break;
		case 6 :
			result = "D";
			break;
		case 5 : 
			result = "F";
			break;
		default:
			result = "F";
			break;
		}
			
		
		//결과보여주기

		if (score > 100 || score < 0) {
			System.out.println("Error");
		}else {
			System.out.println("당신의 성적은 " + result + "입니다.");
		}
		
	}

}
