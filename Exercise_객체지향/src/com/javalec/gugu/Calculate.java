package com.javalec.gugu;

import java.util.Scanner;

public class Calculate {

	//Field
		Scanner sc = new Scanner(System.in);
		int num1 , num2;
//		int num2 = 0;
	//Constructor
	
	public Calculate(int num1, int num2) {
		
		this.num1 =num1;
		this.num2 =num2;
		System.out.print("첫번째 숫자를 입력하세요 : ");
			this.num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
			this.num2 = sc.nextInt();
		System.out.println(">>>>>> 결과 <<<<<<");
	}

	
	//Method
	
	public int plus(int num1, int num2) {
		return (num1+num2);
//		System.out.println("덧셈 : " + (num1 + num2));
	}
//	public void minus() {
//		System.out.println("뺄셈 : " + (num1 - num2));
//	}
//	public void multiple() {
//		System.out.println("곱셈 : " + (num1 * num2));
//	}
//	public void share() {
//		if (num2 == 0) {
//			System.out.println("0으로는 나눌 수 없습니다.");
//		}else {
//			System.out.println("나눌셈 : " + String.format("%.2f",((double)num1 / (double)num2)));
//			
//		}
//	}
	
	
}
	
	
	
	

