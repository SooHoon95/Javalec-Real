package com.javalec.base;

public class ThrowsClass {

	//Field
	
	
	//Constructor
	public ThrowsClass() {
		doC();
	}
	
	//Method
	private void doA() {
		System.out.println("doA");
		int[] arr = {1,2,3,4};
		System.out.println(arr[3]);
		System.out.println("endA");
	}
	
	private void doB() {
		System.out.println("doB");
		try {
			doA();
		}catch(Exception e) {
			System.out.println("Exception은 여기서");
			System.out.println(e.getMessage());
		}
		System.out.println("endB");
	}
	
	private void doC() {
		System.out.println("do C");
		doB();
		System.out.println("endC");
	}
	
}
