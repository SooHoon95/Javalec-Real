package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Combine;


public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
				int num1 = sc.nextInt();
		System.out.println("숫자를 하나 더 입력하세요 : ");
				int num2 = sc.nextInt();
				
		
		Combine addNum = new Combine();
		String resultplus = addNum.addAction(num1,num2);
		System.out.println("덧셈 결과는 :  " + resultplus);
//		
//		Combine addNum = new Combine();
		String resultmin = addNum.minAction(num1,num2);
		System.out.println("뺄셈 결과는 :  " + resultmin);
//	
//	
//		Combine addNum = new Combine();
		String resultmulti = addNum.multiAction(num1,num2);
		System.out.println("곱셈 결과는 :  " + resultmulti);
//	
//		
//		Combine addNum = new Combine();
		String resultsh = addNum.shareAction(num1, num2);
		System.out.println("나누셈 결과는 :  " + resultsh);
	
		
//				=============================
//		///프린트해서 내보내기 >> 프린트 메소드 만들기
		
//		addNum.plusprint(num1,num2);
//		addNum.minprint(num1, num2);
//		addNum.mulprint(num1, num2);
//		addNum.shprint(num1,num2);
//		
//		//Constructor 로 호출하기
//		
//		Combine addplus2 = new Combine(num1,num2);
//		int plusResult2= addplus2.addAction2(num1,num2);
//		System.out.println("덧셈 결과는 :  " + plusResult2);
	
		
//		//Field 값으로 호출하기
		
		addNum.num1= num1;
		addNum.num2= num2;
//		int plusResult = (num1 + num2);
//		int minusResult = (num1 - num2);
//		int multiResult = (num1 * num2);
//		double shResult = ((double)num1 / (double)num2);
//		
//		System.out.println("덧셈 결과는 :  " + plusResult);
//		System.out.println("뺼셈 결과는 :  " + minusResult);
//		System.out.println("곱셈 결과는 :  " + multiResult);
//		System.out.println("나누셈 결과는 :  " + shResult);
//	
	}

}
