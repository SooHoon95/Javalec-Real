//package com.javalec.base;

import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		
//		학생수가 4명이고 그 과목이 3과목일 경우의 점수 합계와 평균 구하기 기능
		
		Scanner sc = new Scanner(System.in);
		
		String[] subject = { "Korean" , "Engilsh" , "Mathamtichs" , "Total" , "Average"};
		int[] krScore = new int[4];
		int[] enScore = new int[4];
		int[] mathScore = new int[4];
		int[] total = new int[4];
		
		
//		
		for(int k=0; k<3; k++) {
			switch (k){
			case 0:
				System.out.println(subject[k] + "의 성적을 입력 ");
				
				for (int i=0; i<4; i++) {
					System.out.print("No" + (i+1) + "의 성적은 : " );
					krScore[i] = sc.nextInt();
				} break;
				
			case 1 :
				System.out.println(subject[k] + "의 성적을 입력 : ");
				for (int i=0; i<4; i++) {
					System.out.print("No" + (i+1) + "의 성적은 : " );
					enScore[i] = sc.nextInt();
				} break;
				
			case 2 :
				
				System.out.println(subject[k] + "의 성적을 입력 : ");
				for (int i=0; i<4; i++) {
					System.out.print("No" + (i+1) + "의 성적은 : " );
					mathScore[i] = sc.nextInt();
				} break;
			}
			
			
		}
		
		
		// 정리판
			System.out.print("\t");
		for(int i=0; i<5; i++) {
			System.out.print(subject[i]+ "\t");
		}
			System.out.println();
			
		
		
		for(int i=0; i<4;i++) {
			total[i] = krScore[i] + enScore[i] + mathScore[i];
			System.out.println("No." + (i+1) + "\t" + krScore[i] + "\t" + enScore[i] + "\t" + mathScore[i] + "\t" + "\t" + total[i] + "\t" + total[i]/3);
		}
		
		
	}
}
