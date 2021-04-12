package com.javalec.function;

import java.util.Scanner;

public class AddNumP {

	//Field
	Scanner sc = new Scanner(System.in);
	public int num1, num2;
	
	//Constructor
	public AddNumP() {
		
	}
	public AddNumP(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	
	//Method
	public void Start() {
		System.out.println("첫번째 숫자를 입력하세요.");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		num2 = sc.nextInt();
		System.out.println("===========Result");
		
	}
	
	public void Plus() {
		int addResult = num1 + num2;
		System.out.println("덧셈 : " + addResult);
	}
	
	public void Minus() {
		int	subResult = num1 - num2;
		System.out.println("뺄셈 : " + subResult);
	}
	
	public void Multi() {
		int mulResult = num1 * num2;
		System.out.println("곱셈 : " + mulResult);
	}

	public void Share() {
		
		if ( num2==0 ) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}else if (num1==0 && num2==0) {
			System.out.println("숫자를 다시입력하세요");
		}else {
		double divResult = (double)(num1 / num2);
		System.out.println("나눌셈 : " + String.format("%.3f",divResult));
		}
		
	}


	
	
}
