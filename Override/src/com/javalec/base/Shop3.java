package com.javalec.base;

public class Shop3 extends StoreHQ {
	
	//Field
	
	
	//Constructor
	public Shop3() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Method
	
	@Override
	public void orderKim() {
		// TODO Auto-generated method stub
		System.out.println("김치찌개 : 6,000원");
	}

	@Override
	public void orderBu() {
		// TODO Auto-generated method stub
		System.out.println("부대찌개 : 7,000원");
	}

	@Override
	public void orderBi() {
		// TODO Auto-generated method stub
		System.out.println("비빔밥 : 7,000원");
	}

	@Override
	public void orderSoon() {
		// TODO Auto-generated method stub
		System.out.println("순대국 : 6,000원");
	}
	
	@Override
	public void orderKong() {
		// TODO Auto-generated method stub
		super.orderKong();
	}
	
	public void printmenu() {
		System.out.println("shop3--------------");
		orderKim();
		orderBu();
		orderBi();
		orderSoon();
		orderKong();
		
	}
}
