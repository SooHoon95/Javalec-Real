package com.javalec.bass;

public class Veriable_01 {

	public static void main(String[] args) {
		// 변수(Variable)
		// 문자열 변수 선언
		String str = "Hello, World!"; 		// 변수 선언 
		
		System.out.println(str);
		System.out.println(str);
		
		str ="abc";
		System.out.println(str);
		
		
		// 정수 변수 선언 (문자열 타입과 정수 타입 변수)
		int num1 = 10;
		int num2 = 20;
		int plusResult; 								// 선언은 무조건 위에 두는게 정석
				
		plusResult = num1 + num2;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println((double)num1 / (double)num2);
		
		System.out.println((double)num1 / num2);
		System.out.println((double)(num1 / num2));		//잘못된 거 why? 변환의미 없음
														//이미 정수로 바꿨는데 괄호안부터 계산했기 때문에
		
		System.out.println((double)num1 /num2); 		// 옳은 예
		System.out.println(plusResult);
		
		num1 = 100;
		
		
		// ---- Exercise
		int startNum = 30, endNum = 40;
		int plusResults = startNum + endNum;
		int minusResult = startNum - endNum;
		int complexResult = startNum * endNum;
		double devResult = (double)startNum / (double)endNum;
		
				
		 
		System.out.println(startNum + "과" + endNum + "의 덧셈 결과는 " + plusResults + "입니다.");
		
		System.out.println(startNum + "과" + endNum + "의 뺄셈 결과는 " + minusResult + "입니다." );
		System.out.println(startNum + "과" + endNum + "의 곱셈 결과는 " + complexResult + "입니다.");
		System.out.println(startNum + "과" + endNum + "의 덧셈 결과는 " + plusResults + "입니다.");
		System.out.println(startNum + "과" + endNum + "의 나눗셈 결과는 " + devResult + "입니다.");
		System.out.println(startNum + "과" + endNum + "의 덧셈결과와 뺄셈 결과의 곱은" + plusResults * minusResult + "입니다.");
		
		
		
	}

}


		