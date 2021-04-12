//package com.javalec.base;

import java.util.Scanner;

public class Quiz_2 {
	public static void main(String[] args) {
		
		//몇개의 숫자를 입력한지 결정한 후 숫자를 입력하고 이중 최대값의 위치와 최대값을 구하라.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력할 숫자의 개수는 ? ( 100개 미만) ");
		int inputNum = sc.nextInt();
		int max = 0;
		int[] eachNum = new int [inputNum];
		int maxIndex = 0;
		
		
		
		System.out.println(inputNum + "개의 숫자를 " + "입력하세요! ");
		
		for(int i=0; i<inputNum; i++) {
				eachNum[i] = sc.nextInt();
				}
		for (int k=0; k<inputNum; k++) {
			if ( max < eachNum[k]); {
				max = eachNum[k];
				maxIndex = k;
			}		
		}
			
			System.out.println("입력한 숫자 중 최대값은 " + max + "이고 " + (maxIndex+1) + "번째 값입니다." );
	
		
	
		
		
		
	}
}
