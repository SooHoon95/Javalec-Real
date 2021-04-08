package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		
		Child child = new Child();
		System.out.print("아버지 성명 : ");
		child.getFather();					// child에 아무 메소드가 없어도 페런츠에서 상속받았기 때문에 
											// Child Constructor 에서 가져와도 사용 가
		System.out.print("어머니 성명 : ");
		child.getMother();
		
		
		
	}

}
