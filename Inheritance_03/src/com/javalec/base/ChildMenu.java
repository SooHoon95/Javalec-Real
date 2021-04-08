package com.javalec.base;

public class ChildMenu extends ParentsMenu {

	
	//Field
	
	
	//Constructor
	public ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	
	//Method
//	public void makeBeefChung() {
//		System.out.println("소고기 청국장"); 		//내 메뉴 바꾼거. 
//	}
	
//	public void makeHotDoen() {
//		System.out.println("얼큰 된장");
//	}

	@Override
	public void makeChung() { //메이크 청 이라는 애는 페런츠에 있는애랑 이름이 같은 거구나!
		// TODO Auto-generated method stub	
		System.out.println("냄새 없는 청국장");
	}
	
	@Override
	public void makeDoen() {
		// TODO Auto-generated method stub
		super.makeDoen();
		System.out.println("얼큰된장");
		System.out.println("미역된장");
		
	}
	
	}
	
	

