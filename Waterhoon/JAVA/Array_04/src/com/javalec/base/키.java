package com.javalec.base;

import java.util.Scanner;

public class 키 {
	public static void main(String[] args) {
		
		
		
		int total =0;
		
		
		String[] name = {"James", "Cathy", "Kenny", "Martin" ,"Crystal"};
		int[] height = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
//		 #1
		for(int i=0; i < name.length; i++) {
			System.out.print(name[i] + "의 신장을 입력하세요" + "\t");
			height[i] = sc.nextInt();
			total+= height[i];
		}
		
		//평균
		System.out.println("평균 : "  + total/ name.length);
		
		//가장큰신장
		
		//가장작은 신장
		
		
	}
	
}
