package com.javalec.base;

import java.util.Scanner;

public class Quiz_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("입력한 한 자리수 정수의 합을 구하여라.");
		
		
		//선언
		
		
		int rem = 0;
		int mok = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
//				
//		//처리
//		for ( int i=1; i<=50; i++) {
//			rem = rem + (integer%10);
//			integer = (integer/10);
//						
//		}
//		
//		//결과
//		
//		System.out.println(rem);
		
		// int = int /10 -> int /= 10;
//		i++ -> i += 1 -> i = i+1
		
		
		for(int integer=sc.nextInt(); integer!=0; integer/=10) {
			rem = rem + integer%10;
			
		}
		System.out.println(rem);
		
		
		
		
		
		
		
		
		
	}

}
