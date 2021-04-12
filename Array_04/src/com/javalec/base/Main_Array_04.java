//package com.javalec.base;

import java.util.Scanner;

public class Main_Array_04 {
		public static void main(String[] args) {
			
			
			
//			선언하기 
			
			int total = 0;
//			double avg = 1;
			
			String[] name = {"James", "Cathy", "Kenny", "Martin" ,"Crystal"};
			int[] height = new int[4];
			
			Scanner sc = new Scanner(System.in);
			
			
//			처리과정 
			
			for(int i=0; i < name.length; i++) {
				System.out.print(name[i] + "의 신장을 입력하세요" + "\t");
				height[i] = sc.nextInt();
			total+= height[i];
//				double avg = (double)total / name.length;
			}
				double avg = (double)total / name.length;
			
			
			
			
			
		}
}

