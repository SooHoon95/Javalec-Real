package com.javalec.base;

import com.javalec.function.AddNumP;

public class MainP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int num1 =10 , num2 =20;
			
//			Method 매개변수 호출
			AddNumP addNum = new AddNumP();
			int resultNum = addNum.addAction(num1,num2);
			System.out.println(resultNum);
			
//			결과값 서브 클래스에서 만들어오기
			
			addNum.addPrint(num1,num2);
	}

}
