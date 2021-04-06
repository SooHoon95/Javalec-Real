package com.javalec.practice;

import java.util.Scanner;

public class Array04_Quiz_02 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int counter = 0;
	int max = 0; 
	int maxNum = 0;
	int maxCount = 0;
	
	System.out.println("입력할 숫자의 갯수는 ? (100개 미만)");
		counter = sc.nextInt();
		
		int[] inputNum = new int [counter];
	
		
		System.out.println(counter + "개의 숫자를 입력하세요 !");
	
		for(int i=0; i<=counter-1; i++) {
			inputNum[i] = sc.nextInt();
				
			}	
		for (int j=0; j <= counter-1; j++) {
			if (max < inputNum[j]) {
				max = inputNum[j];
				maxCount = (j+1);
			}
		}
		System.out.println("입력한 숫자 중 최댓값은 " + max + "이고 " + maxCount  + "번째 값입니다." );
		
		
		
		
		
	}

}
