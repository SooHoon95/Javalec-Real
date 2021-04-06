//package com.javalec.base;
//
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		
//		
//		
//		
////		선언하기 
//		
//		int total = 0;
////		double avg = 1;
//		int max = 0;
//		int min = 1000;
//		int maxname = 0;
//		int minname = 0;
//		double avg = 0;
//		
////		처리하기
//		
//		String[] name = {"James", "Cathy", "Kenny", "Martin" ,"Crystal"};
//		int[] height = new int[5];
//		
//		Scanner sc = new Scanner(System.in);
//		
////		 #1
//		for(int i=0; i < name.length; i++) {
//			System.out.print(name[i] + "의 신장을 입력하세요" + "\t");
//			height[i] = sc.nextInt();
//			total+= height[i];
//		}
////				double aver = total / name.length;
////		 
////				System.out.println("평균신장은 : " + aver + "입니다. ");
////		
//////		 #2
////		 
////		for(int i=0; i<(name.length); i++ ) {
////			if(max<height[i] ) {
////				max = height[i];
////				maxname = heighth
////			}else if(min > height[i]) {
////			 }
////				
//////				for (int i=0; i<name.length; i++)
//////				if (min <= height[i]) { 
////					min = height[i];
////			}
////			
////		}
////
////		
////		 System.out.println("가장 큰 키는" + max);
////		 System.out.println("가장 작은 키" + min);
//		 
//		 
//		 
////		정답
////		 
////		선언
//		
//		int temp = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		 
//		 for(int i=0; i < name.length; i++) {
//				System.out.print(name[i] + "의 신장을 입력하세요" + "\t");
//				height[i] = sc.nextInt();
//				total+= height[i];
//			}
//		 
////		 평균구하기
//		 
//		 
//		avg = (double)total  /  name.length;
//		System.out.println("평균시장 : " + avg);
//		
////		가장 큰신장구하기
//		
//		for(int i=0; i<name.length; i++) {
//			if (height[i] > max) {
//				max = height[i];
//			}
////		가장 작은 신장 구하기
//			
//			int maxindex = 0; // 이름이랑 키는 똑같은 번지에 있으니
//			
//			if( height[i]<min) {
//				min= height[i];
//				maxindex = i;
//			}
//			
//			
//		}
//
//			 System.out.println("가장 큰 키는"+ max);
//			 System.out.println("가장 작은 키" + min);
//		
//		 
//		 
//	}
//
//}
