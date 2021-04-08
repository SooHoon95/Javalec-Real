package com.javalec.base;

public abstract class LunchMenu {

	//Field
	public int rice;
	public int bulgogi;
	public int banana;
	public int milk;
	public int almond;
	
	//Constructor
	public LunchMenu() {
		// TODO Auto-generated constructor stub
	}

	public LunchMenu(int rice, int bulgogi, int banana, int milk, int almond) {
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.banana = banana;
		this.milk = milk;
		this.almond = almond;
	}
	
	
	//Method

	public abstract int calc(); //메소드 반드시 만들어줘야함  
	
	/*런치메뉴상속받는애들은 오버라이드 가능*/
	
	
	
	
	
	
	
	
	
	
	
}
