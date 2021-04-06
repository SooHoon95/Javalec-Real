package com.javalec.base;

import java.util.Scanner;

public class Exercise_Gugu {

	public static void main(String[] args) {
		
		//원하시는 단을 입력하세요 : 7
		
		/*7x2
		 * 7x4
		 * 7x6
		 * 7x8
		 * 	짝수일경우만 출
		 */
		
		
		//선언
		Scanner sc = new Scanner(System.in);
		
		int tot = 1;
		int num = 0;
		
		//처리
		System.out.print("원하시는 구구단 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			if(i%2== 0) {
				System.out.println(num + " X " + i + "=" + (tot* i));		}
		}		
		//결과
		
		
		
		
//		
		//Exercise 2
		
		/*원하시는 단을 입력하세요 7 : 
		 * 7 X _ = 7
		 * 7 x 2 = 14
		 * 7 X _ = 21
		 * 7 X 4 = 28
		 * - - 
		 * -
		 * -
		 * 7 X _ = 63
		 * 
		 * 
		 * 
		 */
		
		//선언 
//		Scanner  scanner = new Scanner(System.in);
//		int dan = 0;
//		
//		//처리과정 
//		
//		System.out.print("원하시는 구구단 숫자를 입력하세요 : ");
//		dan = scanner.nextInt();
//		
//		for(int i=1; i<=9; i++) {
//			if (i % 2==1) {
//				System.out.println(dan + " X " + " _ " + "= " + (dan*i));
//			}else {
//				System.out.println(dan + " X " + i + " = " + (dan*i));
//			}
//		}
		
		
		//결과값 출력 
		
		
		
		
		
		
		
		
		
	}
}


