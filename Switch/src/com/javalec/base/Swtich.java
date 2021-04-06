package com.javalec.base;

import java.util.Scanner;

public class Swtich {

	public static void main(String[] args) {
		//if 문
		//선언문
		
		Scanner scanner = new Scanner(System.in); 
		int inputNumber = 0; //사용자 입력
		String result = ""; // 처리 결과 저장
	
		//처리
		
		System.out.print("숫자를 입력하세요 : ");  	// 뭘 할지 제시
		inputNumber = scanner.nextInt(); 						// next Int 는 정수만 가져오는 것
		
//		if(inputNumber % 2 == 0) { //짝수 판
//			result = "짝수";
//		}else { 					// 홀수판단
//			result = "홀수";
//		}
	
		switch(inputNumber % 2 ) {
		case 0:
			result = "짝수";
			break;
		case 1:
			result = "홀수";
			break;
		default:					// 디폴트는 왜 적는거? 브레이크 안적으면 4가 왜 홀수가 되는가?
			break;
		}
		
//		2021.3.31 수훈 제
		//기능 : 결과보여주기  >>>		저기 위에 else 밑에다가syso	써도 되지만 안 깔끔 따라서 그냥 결과창에 따로 정리하는거싱 깔
		
		System.out.println("입력하신 숫자 " + inputNumber + "는" + result + "입니다.");
		
		
		
		
	}

}


