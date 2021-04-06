package com.javalec.base;

import java.util.Calendar;

public class Main_Calender {

	public static void main(String[] args) {

		//Calender
		
		Calendar calendar = Calendar.getInstance();	// 카렌다는 new 안쓴다.
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1; 		///먼쓰는 1월달이 0으로 돼있어서 항상 +1붙여서 써야한
		int day = calendar.get(Calendar.DAY_OF_MONTH);
	
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int secound = calendar.get(Calendar.SECOND);
		
		
		System.out.println(year + ": " + month + " : " + day);
		System.out.println(hour + " : " + minute + " : " + secound);
	}

}
