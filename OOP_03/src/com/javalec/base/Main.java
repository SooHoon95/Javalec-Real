package com.javalec.base;


import com.javalec.function.AddNum;
import com.javalec.function.AddNum2;

public class Main {

	public static void main(String[] args) {

		
		int num1 = 10, num2 = 20;		//팀장님이 변수를 줌. 이거줄테니까 만들어와. 
		//어떻게 만들어 올까요 ?? Method의 매개변수로 호출 	
		 
		AddNum addNum = new AddNum();
		int resultNum = addNum.addAction(num1,num2);
		System.out.println(resultNum);
		
		
		//결과값과 Sub Class에서 실행
		addNum.addPrint(num1,num2); // addPrint 라는 메소드가 우리가사용하는 펑션에는 없으니까. 그래서 새로 하나 더 만들어주면됌 서브클라스에.
		
		
		
		//Constructor로 호출
		AddNum addNum2 = new AddNum(num1, num2);
		int resultNum2 = addNum2.addAction2(num1,num2);
		System.out.println(resultNum2);
		
		//Field 값으로 호출
		addNum.num1 = num1;
		addNum.num2 = num2;
		int resultNum3 = addNum.addAction2(num1,num2);
		System.out.println(resultNum3);
		
		
		
	}

}
