package com.javalec.base;

import java.util.Scanner;

public class Quiz_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rayer = 0;
		int num = 1;
		
		System.out.print("몇 단계의 피라미드로 구성할까 ? ");
			rayer = sc.nextInt();
		
		for(int i=1; i<=rayer; i++) {
			
			for(int k=1; k<=i; k++) {
				System.out.print( num + " ");
				num++;
			}
				System.out.println();
		}
		
		
	}

}

