package com.javalec.variable_02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수와 상수 변수는 뭐고 상수는 뭐다?
		
		String str = "James";
		int num = 10;
		double numDouble = 20.2;
		char chr = 'a';
		boolean bool = true; // or false
		
		// 변수선언
		
		
		
		System.out.println(str + ":" + num);
		System.out.println(num + num);
		System.out.println((double)num + numDouble);  //실수출력
		System.out.println(num + (int)numDouble);		// 정수출력 int를 쓰면은 정수 아래는 다 버린다.
		System.out.println(chr);	
		System.out.println(bool);
		
		
		
		
	}

}
