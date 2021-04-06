package com.javale.base;

import java.util.Scanner;

public class Main_Array_02 {
		public static void main(String[] args) {
			
			
		int[] inputValue = new int[3];
		Scanner sc = new Scanner(System.in);
		int tot =0; // 합계구하기
		double avg =0.0;
		
//		// 사용자로 부터 입력 받아서 배열에 넣기
//			System.out.println("계산할 숫자를" + inputValue.length + "개를 입력하세요.");
//			
////				int i =sc.nextInt(); // 얘를 다섯번 적던가 아니면 for 문돌리던 lije i j k l 
//			for(int i=0; i < inputValue.length; i++) {
//					inputValue[i] = sc.nextInt();
//			}
//		
//		// 입력한 정보의 합계 구하기
//				for ( int i = 0; i < inputValue.length; i++) {
//					tot+= inputValue[i];
//				}
//				
//		// 입력한 정보의 평균 구하기
//			avg = (double)tot / inputValue.length;
//				
//		// 입력한 정보 출력하기
//			System.out.println("귀하가 입력한 정보는 다음과 같습니다.");
//			System.out.println("----------------------------");
//			
//			for (int i=0; i < inputValue.length; i++) {
//				System.out.print(inputValue[i] + "\t");
//			}
//			System.out.println();
//			System.out.println("입력한 정보의 총합은" + tot + "입니다.");
//			System.out.println("입력한 정보의 평균은" + String.format("%.2f" /*소수점이하2자리*/, avg) + "입니다.");
//		
			
		System.out.println("계산할 숫자를" + inputValue.length + "개 입력하세요.");
		
		
		 for( int i=0; i < inputValue.length; i++) {
			 inputValue[i] = sc.nextInt();
		 }
		 
		 for(int i=0; i < inputValue.length; i++) {
			 tot+= inputValue[i];
		 }
		 for(int i=0; i < inputValue.length; i++) {
			 avg = tot / inputValue[i];
		 }

			
			
			
			
			
			
		}
	
	
}
