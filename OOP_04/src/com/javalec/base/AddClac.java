package com.javalec.base;

public class AddClac {

	
	//Field (생성자)
	
	//Constructor 
	public AddClac() {

		
	}
	
	
	//Method
	public int sumClac(int[] arr) {
		int tot = 0;
		for (int i=0; i<arr.length; i++ ) {
//	시범 작동		System.out.println(arr[i]);
			tot+= arr[i];
		}
			return tot;
	}
	
	
//	배열값으로 다시 해보기
}
