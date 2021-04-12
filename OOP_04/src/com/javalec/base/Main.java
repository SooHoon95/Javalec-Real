package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		int[] num = {1,2,3,4,5};
		
		AddClac addCalc = new AddClac();
		int sum = addCalc.sumCalc(num);
		System.out.println(sum);
		
	}

}
