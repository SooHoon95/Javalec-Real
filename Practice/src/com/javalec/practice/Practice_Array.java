package com.javalec.practice;

import java.util.Scanner;

public class Practice_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		선언문
		Scanner sc = new Scanner(System.in);
		int[] inputNum = new int[3];
		int total = 0;			// 합계 구하기 인수
		double avg = 0.0;		// 평균 구하기 인수

		//사용자로부터 입력 받아서 배열에 넣기
			System.out.print("계산할 숫자를" + inputNum.length + "개 입력하세요.");
			
			for(int i=0; i<inputNum.length; i++) {
				inputNum[i] = sc.nextInt();
			}
		
		//입력한 정보의 합계구하기
			for(int i=0; i<inputNum.length; i++) {
				total+= inputNum[i];
			}
			
		//평균구하기
			avg = (double)total / inputNum.length;
		
		//정보출력하기
			System.out.println("입력한 정보는 다음과 같습니다");
			System.out.println("합계는 " + total);
			System.out.println("평균은 " + avg);
			
			 
		
	}

}
