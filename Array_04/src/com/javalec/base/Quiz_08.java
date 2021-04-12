//package com.javalec.base;

import java.util.Scanner;

public class Quiz_08 {

	public static void main(String[] args) {
		
//		선언

		Scanner sc = new Scanner(System.in);
		
		String[] option = { "입금", "출금" , "현황 ", "종료" };
		String[] customer = { "1" , "2" , "3" , "4" , "5"};
		int[] account = new int[5];			// 계좌 배
		int cash = 0;						//입력할 금액 
		int select = 0;						// 메뉴선
		int customerNum =0;					// 고객번호 입
		
		
		
		 while (true) {
			 
			 for(int i=0; i < 4; i++) {
				 System.out.println((i+1) + "." + option[i]);
			 }
			 System.out.print("번호를 선택하세요! "); 
			 select = sc.nextInt(); // 							선택한 번호 
			 	if (select ==4 ) { // 							4.종료
			 		System.out.println(" >>>>>> Thank You <<<<<<");
			 	break;
			 	}else if (select == 1 || select == 2) {				// 1번이나 2번 메뉴 선택시 다음 프로세스 진
			 		
			 		System.out.print("고객번호 : ");
			 		customerNum = sc.nextInt()-1; 
//			 		customer[(customerNum-1)] = sc.next();
			 		System.out.println("금액 : ");
			 		if(select ==1) {								// 1번이면 전 배열 값에 더한다.
			 			account [(customerNum)] += sc.nextInt();
			 		}else if(select ==2) {
			 			account [(customerNum)] -= sc.nextInt();	// 2번이면 전 배열 값에 뺀
			 			if (account[customerNum]<0 ) {
			 				System.out.println("잔액이 부족합니다 !!");
			 				break;
			 			}
			 		}
			 		else {
			 			System.out.println("잘못 입력하였습니다!!"); // 		에러 발생시 
			 		}

			 		System.out.println("입금결과 >> 고객번호 : " + (customerNum+1) + " 잔액 : " + account[(customerNum)]);
			 		System.out.println("---------------------------------------------------------");
			 	
			 	}else if (select ==3) {
			 		System.err.println("\t" + "\t" + "고객명" + "\t" + "잔액");
			 		System.out.println("\t" + "\t" + "----" + "\t" + "----");
			 		for(int j=0; j<5; j++) {
			 			System.out.print("\t" + "\t" + customer[j]);
			 			System.out.println("\t" + account[j] + "\t");
			 		}
			 			System.out.println();
			 	}
		 
		 }
				
		
		
			
//			switch ( i ) {
//			
//			case 1 :
//				System.out.print("고객번호 : ");
//				customNum = sc.nextInt();
//				System.out.print("금액 : ");
//				cash = sc.nextInt();
//			
//				System.out.println("입금 결과 : ");
//				
//				
//			}
//		
//			
		
		
		
		
		
	}

}
