package com.javalec.practice;

import java.util.Scanner;

public class Practice_main01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		
		///  		방법 1 =================

//		선언
		String[] name = {"James", "Cathy", "Kenny", "Martin" ,"Crystal"};
		int[] height = new int[5];
		int total = 0;
		double avg = 0.0;
		int max = 0;
		int min = 1000;
		String maxName = "";
		String minName = "";
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "의 신장을 입력하세요 " + "\t");
			height[i] = sc.nextInt();
			total += height[i];
			avg = total / name.length;
		}
		
		for(int j=0; j<name.length; j++) {		// 가장 큰 키 구하기
			if (height [j] > max) {
				max = height[j];
				maxName = name[j];
			}
		}
			System.out.println("가장 큰 키는 " + maxName + "이고 " + "키는 " + max + "입니다.");
		
		for(int k=0; k < name.length; k++) {
			if(height[k] < min ) {
				min = height[k];
				minName = name[k];
			}
		}
			System.out.println("가장 작은 키는 " + minName + "이고 " + "키는 " + min + "입니다.");
			
//			===============================================
			
//			방법 2
		
	}

}

