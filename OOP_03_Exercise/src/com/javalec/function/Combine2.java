package com.javalec.function;

import java.util.Scanner;

public class Combine2 {

	
	//Field
	Scanner sc = new Scanner(System.in);
	int num1 , num2;
	
	//Constructor
	public void Combine2() {
//		this.num1 = num1;
//		this.num2 = num2;
		
	}
	
	//Method
	public void start(){
		System.out.print("첫번째 숫자 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		num2 = sc.nextInt();
		System.out.println(">>>>> 결과 <<<<<");
	}
	public void plus() {
		int addresult = ( num1 + num2 );
		System.out.println("덧셈 : " + addresult);
	}
	public void minus() {		int minresult = ( num1 - num2 );
		System.out.println("뺼셈 : " + minresult);
	}
	public void multi() {
		int multiresult = ( num1 * num2 );
		System.out.println("곱셈 : " + multiresult);
	}
	public void share() {
		double shareresult = ( (double)num1 / (double)num2 );
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {
				
				System.out.println("나누셈 : " + String.format("%.3f", shareresult));
			}
	}

}
