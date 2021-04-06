package com.javalec.base;

public class Main_Timer {

	public static void main(String[] args) {

		// String 과 StringBuilder의 측정
		
		String str1 =  "a";
		
		long startTime1 = System.currentTimeMillis();
		for(int i=1; i<=50000; i++) {
			str1 = str1 + "a";
		}

		long endTime1 = System.currentTimeMillis();
		System.out.println("term2 : " + (endTime1 - startTime1));
		
//		===================
		

		
		StringBuilder stringBuilder = new StringBuilder("a");
		long startTime2 = System.currentTimeMillis();
		for(int i=1; i<=50000; i++) {
			stringBuilder = stringBuilder.append("a");
			
		}

		long endTime2 = System.currentTimeMillis();
		System.out.println("term2 : " + (endTime2 - startTime2));
		
	}

}
