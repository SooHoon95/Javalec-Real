package com.javalec.practice;

import java.util.Scanner;

public class practice_array04_Main {

	public static void main(String[] args) {

		
		String[] name = {"James", "Cathy", "Kenny", "Martin" ,"Crystal"};
		int[] height = new int[5];
		int total = 0;
		double avg = 1.0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "의 신장을 입력하세요 : ");
			height[i] = sc.nextInt();
			total+= height[i];
//			avg = (double)total / name.length;
		}
		avg = (double)total / name.length; // 어디에다가 위치해도 상관없음
		
		System.out.println(avg);
	}

}
