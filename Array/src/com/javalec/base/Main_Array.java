package com.javalec.base;

public class Main_Array {
	public static void main(String[] args) {
		
		
		
//		초기값이 없는 배열 선언 및 데이터 추가하기
	//=====================================	
//		String[] str/*문자열 배열이야 라는 뜻*/ = new String[7]; // 배열을 7개 만들거다. 즉 str이라는 변수는 
//																//데이터를 7개 이용해서 쓸거다 라는 
////		
//		str[0] = "일요일" ; // str[일요일,   ,   ,   ...]
//		str[1] = "월요일";
//		str[2] = "화요일";
//		str[3] = "수요일";
//		str[4] = "목요일";
//		str[5] = "금요일";
//		str[6] = "토요일";
//		
//		
		//초기값이 있는경우
//		====================
		String[] str = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일","토요일"};
//						0		1		2		3		4			5		6
		
//		System.out.println(str);
//		System.out.println(str[0]);
//		System.out.println(str[1] + "," + str[3] + " ," + str[5]);
//		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		
		
		
		
		
		
		
		
	}
}
