package com.javalec.function;

public class Combine {
	
//	Field
	
	public int num1 , num2;
	
	
	//Constructor
	public Combine() {
		// TODO Auto-generated constructor stub
	}

	public Combine (int num1, int num2) {
		
		super();
		this.num1=num1;
		this.num2=num2;
	}
	
	
	//Method
	public String addAction(int i, int j) {
		int addresult = i + j;
	return Integer.toString(addresult);
		
//		return addresult;
	}
//	
//	
	public String minAction (int i, int j) {
		int minResult = ( i-j);
		return Integer.toString(minResult);
	}
//	
	public String multiAction (int i ,int j) {
		int mulResult = ( i*j );
		return Integer.toString(mulResult);
	}
//	
//	
	public String shareAction(double i, double j) {
		double resultshare = ( i/j );
		return Double.toString(resultshare);
	}
	
//	=============================
//	///프린트해서 내보내기
	
	public void plusprint(int i, int j) {
		System.out.println("덧셈 결과는 :  " + (i + j));
	}
//	
//	public void minprint(int i, int j) {
//		if ( i >= j ) {
//			System.out.println("숫자의 차는 :  " + (i-j));
//		} else if (i <j) {
//			
//			System.out.println("숫자의 차는 :  " + (j-i));
//		}
//	}
//	public void mulprint(int i, int j) {
//		System.out.println("곱셈 결과는 :  " + (i * j));
//	}
//	public void shprint(double i, double j) {
//		if(j == 0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
//		System.out.println("나누셈 결과는 :  " + String.format("%f",(i / j)));
//	}
	
//	===================================

//	///Constructor 로 호출하기 and field 값으로 호출하기
	public int addAction2(int num1, int num2) {
		return (num1+num2);
	}
	public int minAction2(int num1, int num2) {
		return (num1-num2);
	}
	public int mulAction2(int num1, int num2) {
		return (num1*num2);
	}
	public double shareAction2(double num1, double num2) {
		return (num1/num2);
	}
	
	
	
	
	
	
	
	
	
}
