package com.javalec.base;

import java.util.ArrayList;

public class Exercise_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1부터 100까지 수 중 짝수만 골라서 어레이리스트 만들고\n 어레이리스트의 짝수의 합 구하기");
		
		
		int num = 1;
		int tot = 0;
		int sum = 0;

		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		for(int i=0; i <99; i+=2) {
			arraylist.add(num*2);
			num++;
		}
		
		System.out.println(arraylist);
		
		for(int i=0; i<50; i++) {
			tot += arraylist.get(i);
			
			
		}
		System.out.println("짝수의 합은 " + tot);
		
	}
}
