package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i = 0;
		int j = 1;
		System.out.println("Add : " + (i + j));
		System.out.println("sub : " + (i - j));
		System.out.println("Mul : " + (i * j));
		try {
			System.out.println("Div : " + (i / j));
		} catch(Exception e) {
//			System.out.println(e.getMessage());			// 에러는 안걸리고 에러 메세지만 보인다.
			System.out.println("숫자를 확인하세요 ~!");
		}
		
		
		
		
		
	}

}
