package com.javalec.base;

import java.util.Scanner;

public class Gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	선언
		
		int dan = 3;
		Scanner sc = new Scanner(System.in);
		
		
		//처리 과정 
		
		System.out.print("원하시는 구구단 숫자를 입력하세요 : ");
		dan = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " X " + i + "=" + ( dan *i));
		}
	}

}
