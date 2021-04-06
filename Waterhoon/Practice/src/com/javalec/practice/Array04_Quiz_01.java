package com.javalec.practice;

public class Array04_Quiz_01 {

	public static void main(String[] args) {

		System.out.println("10의 10^0 ~ 10^10 까지의 제곱승을 구하라.");
		
		long[] square = new long[11];
		long result = 1; 
				
		for(int i=0; i<=10; i++) {
			square[i] = result;
			System.out.println("10 ^ " + String.format("%2d", i) +
								"= " + String.format("%12d", result));
			result*= 10;
		}
		
//		=============더 간단한 방법 배열 안쓰고~~~============
		
		
//	long result = 1;
		
		System.out.println("10의 10^0 ~ 10^10 까지의 제곱승을 구하라.");
		
		
		
		for(int i=0; i<=10; i++) {
			System.out.println("10 ^ " + String.format("%2d",i) + " = " + String.format("%13d",result));
			result*= 10;
		}
		
		
		
		
		
	}

}
