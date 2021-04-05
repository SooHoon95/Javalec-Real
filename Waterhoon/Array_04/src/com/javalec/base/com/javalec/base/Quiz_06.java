package com.javalec.base;

import java.util.Scanner;

public class Quiz_06 {

	public static void main(String[] args) {

		
//		몇개의 숫자를 입력할지 경정 한 후 숫자를검색해서 몇뻔째인지 구하라.
		
		
		Scanner sc = new Scanner(System.in);
		int num =0;
		int[] inputValue = new int[100];
		int searchNum =0;
		int data =0;
		
		System.out.print("입력할 숫자의 갯수 : ");
			num = sc.nextInt();						//개산할 갯수 입력
			
		System.out.println(num + "개의 숫자를 입력하세요 !");
		
		for(int i=0; i<num; i++) {
			System.out.print((i+1) + "의 숫자 : ");
			inputValue[i] = sc.nextInt();			//배열에 숫자 지정
		}
		
		System.out.println("-------------" + "\n");
		System.out.println("검색할 숫자는 ? ");
			searchNum = sc.nextInt();		// 검색할 숫자 입력
			
		for(data=0; data<num; data++) {
			if (inputValue[data]== searchNum) {
				System.out.println(searchNum + "의 위치는" + (data+1) + "번째 입니다.");
				break;
			}/*else if (inputValue[j]!= searchNum && j==(num-1)) {
				System.out.println(searchNum + "는 존재하지 않습니다");
				break;*/
			}
		
		if (data == num) {
			System.out.println("존재하지 않느다");
			
		}

		
		
	}

}
