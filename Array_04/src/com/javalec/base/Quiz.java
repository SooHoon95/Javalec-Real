//package com.javalec.base;

public class Quiz {

	public static void main(String[] args) {

		
//		선언
		long result = 1;
		
		System.out.println("10의 10^0 ~ 10^10 까지의 제곱승을 구하라.");
		
		
		
		for(int i=0; i<=10; i++) {
			result*= 10;
			System.out.println("10 ^ " + String.format("%2d",i) + " = " + String.format("%13d",result));
		}
		
		
		
		
	}

}
