package com.javalec.base;

import java.util.Scanner;

public class Quiz_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int counter =0;
		int[] inputValue = new int[100];
//		int searchNum =0;
		int delCoun = 0;
//		int injectNum = 0;
//		int[] result = new int[0];
		
		System.out.print("입력할 숫자의 갯수 : ");
			counter = sc.nextInt();						//개산할 갯수 입력
			
		System.out.println(counter + "개의 숫자를 입력하세요 !");
		
		for(int i=0; i<counter; i++) {
			System.out.print((i+1) + "의 숫자 : ");
			inputValue[i] = sc.nextInt();				//배열에 숫자 지정
		}
		
		System.out.print("숫자를 삭제하고자 하는 위치는? ");
			delCoun = sc.nextInt();
			
			for(int j=delCoun; j<=(counter-1); j++) {
				inputValue[j-1] = inputValue[j];
			}
			
			for(int i=0; i<=(counter-2); i++){
				System.out.println(inputValue[i]);
			}
		
	}

}
