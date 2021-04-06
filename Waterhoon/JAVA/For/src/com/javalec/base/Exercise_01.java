package com.javalec.base;

public class Exercise_01 {
public static void main(String[] args) {
	
	
	//Exercise 
			// 1 부터 100까지의 수중 짝수의 합을 구하시 (단 if 문 사용)
			
			
			// 선언
		
			int tot = 0;
			
			for(int a=1; a<=100; a++) {
				
				if (a % 2 == 0) {
					tot = tot + a;
				} else if (a % 2 == 1) {
						tot = tot;
				}
			}
			
					
			System.out.println("1부터 100까지의 짝수의 합은" + tot + "입니다.");
				

}

}
