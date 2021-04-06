package com.javalec.base;

import com.javalec.function.SumEvenOdd;
import com.javalec.function.SumEvenOdd02;


public class Main {

	public static void main(String[] args) {
		
		//펑션에서 작성한 코드를 처리..?
		//스캐너랑 똑같이 불러낸다. 팀장님 파일에서!
		
		int i=1, j=10;
		
//		SumEvenOdd sss = new SumEvenOdd();		// 	new =오브젝트라고 한다. 
//		int sum = sss.sumCalc(i,j);
//		
//		String chk = sss.evenOdd(sum);		//1) 팀장이 이 결과값을 원한다.
//		
//		System.out.println(i + " ~ "  + j + " 의 합은 " + sum + "입니다.");
//		System.out.println((chk + "입니다."));
		
		//===출력도되는 애 만들어오ㅘ!!====
		
		SumEvenOdd02 sumEvenOdd2 = new SumEvenOdd02();
		sumEvenOdd2.sumCalc(i,j);
		sumEvenOdd2.evenOdd();
		
		
	}
	
	
}
