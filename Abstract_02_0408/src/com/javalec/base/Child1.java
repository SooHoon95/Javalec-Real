package com.javalec.base;

public class Child1 extends LunchMenu {

	
	
	
	
	
	public Child1() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Child1(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);	//없어도 됌
		// TODO Auto-generated constructor stub
	}




	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return rice + bulgogi + banana;	//어 변수없는데 어케 쓰지??  런치메뉴에서 상속받았기 때문에 막써도 가능
	}

}
