package com.javalec.function;

public class SumEvenOdd02 {

	//Field 
	int num = 0;

	
	// Constructor
	public SumEvenOdd02() {
		
		
	}
	
	//Method
	
	 public void sumCalc(int num1, int num2) {		//sun -- 는 메소드 이름 ()는 매게 변수.. 뭔가를 줘야 계산할 수 있어!
		 int sum = 0;
		 for(int i=num1; i<=num2; i++) {
			 sum += i;
			 
		 }
		   num = sum;
		 System.out.println(num1 + " ~ "  + num2 + " 의 합은 " + sum + "입니다.");
//		 return sum;  				// return 이란 다시 sum 이라는 값을돌려준다는 뜻.. 누구한테??
		 
}
	 
		 
	 
	 public void evenOdd() {
		 String chk = "";
		 
		 if (num%2== 0) {
			 chk = "짝수";
		 }else if (num%2 ==1) {
			 chk = "홀수";
		 }
//			return chk;
		 System.out.println((chk + "입니다."));
			 
		 
	 }
	
}
