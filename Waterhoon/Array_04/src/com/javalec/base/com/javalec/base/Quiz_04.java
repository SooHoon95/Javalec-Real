package com.javalec.base;

import java.util.Scanner;

public class Quiz_04 {

	public static void main(String[] args) {

		
//	10개의 점수 ( 0부터 99까지)를 입력받아 점수의 분포를 10점 간격의 등급으로 된 히스토그램을 표시하라.
		
		//선언
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[10];
//		int histo = 0;
		
		
//		int[] people = new int [10];
		
		
		
		//처리
		
		System.out.println("Input Score : ");
		
		for(int i=0; i<10; i++) {
			System.out.print(i+1 + "의 " + "score:");
			score[i] = sc.nextInt();
		}
		
		
		System.out.println("-------- Histogram --------");
		
		
		for(int i=90; i>=0; i-=10) {
			System.out.print(i + " : ");
			for (int k=0; k<score.length; k++) {
				if (i<=score[k] && score[k]<(i+10)) {
					System.out.print("#");
				
				}else {
					System.out.println();
//					break;
				}
			}
		}
		
		
		
		
//		정답(Ver.강사님)
//		
//			histo에 대한 초기 작업
//		int[] histo = new int[10];
//		int[] score = new int[10];
//		
//		System.out.println("Input scroe : ");
//		
//		
//		// 점수를 입력 받으면서 배열의 갯수를 정한다.
//			for (int i=0; i<10; i++) {
//				System.out.println( (i+1) + "의 score : ");
//				score[i] = sc.nextInt();
//				histo[score[i] / 10]++; // >> histo[score[i]/10] += 1 >>>> = histo[]+1 >>>> histo 
//											//배열에 갯수가 하나 더 추가 된다. 라는 뜻
//			}
//		
//			sc.close();
//			System.out.println( "--------=------");
//			
//			
//		for(int i=(score.length-1); i>0; i--) {
//			System.out.println(String.format("%3d : " , i *10));
//			for(int j=1; j<=histo[i]; j++) {
//				System.out.print("#");
//			}
//		}
//		
//		System.out.println();
//			i++ >> i= i+1;
//			
//			histo[score
//			
//			
//			
			
	}

}
