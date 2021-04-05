package com.javalec.practice;

import java.util.Scanner;

public class Array01_Quiz_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] subject = { "Korean" , " English" , "Mathmatics" , "Total" , "Average"};
		int[] num = new int[4];
		int[] score = new int [5];
		
			for(int i=0; i <(num.length-1); i++) {
				System.out.println(subject[i] + "의 성적을 입력");
				
				for(int j=0; j < 4; j++) {
					System.out.print("No" + (j+1) + "의 성적은 : ");
						score[j] = sc.nextInt();
				}
			}
			
			
		
		
	}

}
