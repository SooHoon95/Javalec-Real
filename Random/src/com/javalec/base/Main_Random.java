package com.javalec.base;

import java.util.Random;
import java.util.Scanner;

public class Main_Random {

	public static void main(String[] args) {

		//Random
		
//		for(int i=1; i<=6; i++) {
//			double d = Math.random(); 		// 시작할때마다 불규칙한 값을 주는 것  like 가위바위보 
//			int a = (int)(d*3) + 1;
//			System.out.println(a);
//		}
		
			
//		
//		Random random = new Random();
//		int i = random.nextInt(3);
//		System.out.println(i+1);
		
		Scanner sc = new Scanner(System.in);
		String[] user = { "가위" , "바위" , "보"};
		
		
		Random random  = new Random();
		int i = random.nextInt(3);
		
		int choice = 0;
		
		while (true) {
			i = random.nextInt(3);
			System.out.print("가위 바위 보!! : ( 가위:1 ,바위:2, 보:3 )");
				choice = sc.nextInt();
				if (choice == 1 && (i+1)==1) {
					System.out.println("DRAW");
//					break;
				}else if (choice==1 && (i+1)==2) {
					System.out.println(" You lose.");
//					break;
				}else if (choice ==1 && (i+1)==3) {
					System.out.println("You win!");
//					break;
					
				}else if (choice==2 && (i+1)==2) {
					System.out.println("비겼습니다.");
//					break;
					
				}else if (choice==2 && (i+1)==3) {
					System.out.println(" You lose.");
//					break;
					
				}else if (choice ==2 && (i+1)==1) {
					System.out.println("You win!");
//					break;
				}
				
				else if (choice==3 && (i+1)==3) {
					System.out.println("비겼습니다.");
//					break;
				}else if (choice==3 && (i+1)==1) {
					System.out.println(" You lose.");
//					break;
				}else if (choice ==3 && (i+1)==2) {
					System.out.println("You win!");
//					break;
				}
				
			
			}
		
	}

}