package com.javalec.base;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//선언  
				
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int tot = 1;
	
		//처리과정
		
		System.out.print("In put number : ");
		for(int i=num; i>=1; i--) {
			tot = tot * i;
			
		}
		// 결과값 출력
		
		System.out.println(num + " factorial is " + tot);
		
		
		
	}

}
