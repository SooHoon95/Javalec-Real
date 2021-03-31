package com.javalec.base;

public class Exercise_02 {

	public static void main(String[] args) {
		// Exercise
		
		// 1부터 100까지의 수 중 짝수의 합과 홀수의 합을 구하시오(단if문 사용.)
		
		// 선언
		
		int tot = 0;
		int ror = 0;
		
		
		// 처리과정 
		
		for(int a=1; a<=100; a++) {
			if (a %2==0) {
				tot = tot + a;
			}else if ( a % 2 == 1) {
				ror = ror + a;
			}
		}
		
		//결과값 출력
		
		System.out.println("1부터 100까지 수 중 짝수의 합은 " + tot + "입니다.");
		System.out.println("1부터 100까지 수 중 홀수의 합은 " + ror + "입니다.");
		
		
		
		
		//Exercise 
		// 1부터 100까지의 수 중 짝수의 합 구하기 ( 단, if 문 사용하지 않기)
		
		
		//선언
		int tit = 0;
		
		//처리과정

		for(int a=1; a<=100; a+=2) {
			tit = tit + a;
			
			}
		}
		
	
	}


