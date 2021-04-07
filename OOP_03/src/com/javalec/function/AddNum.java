package com.javalec.function;

public class AddNum {		//메인 메소드 쓸거 아니니까 메인메쏘드는 사용할 필요 없다.
	
	
	
		//Field
//		int num1, num2;
		
//	file값으로 호출할때방식. 
		public int num1, num2;
			
		
	 
		//Constructor // 메쏘드 실행하기 전에 실행 하는 부분
		public AddNum() {
			
		}
		
	
		public AddNum(int num1, int num2) { // 이름이 똑같아도 쓸 수 있다. 오버로딩
			super();
			this.num1 = num1;
			this.num2 = num2;
		}



		//Method
		public int addAction(int i, int j){	 	//변수이름은 상관없음 main클라스에서 쓸거랑 같지 않아도 됌 왜냐하면 같은 클라스가아니니까	//(main 클라스에서 int로 쓸거니까
			int addResult = i + j;
			
			return addResult;
		}
		
		
//		addPrint 메쏘드 만들어주기
		public void addPrint(int i, int j) {
			System.out.println(i + j);
		}
		
//		constructor 사용해서 호출하기
		public int addAction2(int num1, int num2) {
			return num1 + num2;
		}
		
		
		

}
