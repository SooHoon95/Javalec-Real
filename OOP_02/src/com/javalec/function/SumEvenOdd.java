package com.javalec.function;

public class SumEvenOdd {

		
		//Property
		
		//constructor(생성자)
		 public SumEvenOdd() {		//사원파일에서 여기를 불러낼거다.
			 
		 }
		//Method (함수)
		
		 public int sumCalc(int num1, int num2) {		//sun -- 는 메소드 이름 ()는 매게 변수.. 뭔가를 줘야 계산할 수 있어!
			 int sum = 0;
			 for(int i=num1; i<=num2; i++) {
				 sum += i;
				 
			 }
			 return sum;  				// return 이란 다시 sum 이라는 값을돌려준다는 뜻.. 누구한테??
			 
	}
		 
			 
		 
		 public String evenOdd(int num) {
			 String chk = "";
			 
			 if (num%2== 0) {
				 chk = "짝수";
			 }else if (num%2 ==1) {
				 chk = "홀수";
			 }
				return chk;
				 
			 
		 }
		 







}
