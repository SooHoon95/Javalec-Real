package com.javalec.base;

import java.util.Scanner;

public class Main_String {

	public static void main(String[] args) {

		
		String str = "Hello";   //개발자들이 편하게 만들어 놓은거.. 원래는!
		
//		String str1 = new String("Hello"); 		//객체형
		
		Scanner sc= new Scanner(System.in);
		//new 뒤는 생성자.  sc 는 object or instance 또는 객체 =변
		

		String str1 = "avcdefg";
		String str2 = "HIJKLMN";
		String str3 = "opqrstu";
		String str4 =  " abv def ghi ";
		
		System.out.println(str1.concat(str2));  	// concat 은 문자열 연결시켜주는 애
		System.out.println(str1.substring(3)); 		//3까지는 출력 안함
		System.out.println(str1.substring(3, 5)); 	//해당 문자열에 3/5 번째 글짜 출력
		System.out.println(str1.length());  		//글자 갯수 출력
		System.out.println(str1.toUpperCase());		//대문자 출력
		System.out.println(str2.toLowerCase());		//소문자 출력
		System.out.println(str1.charAt(3));			// 3번째 뒤에 값만출력
			
		// str 1을 알파벳 하나씩 출력하기
		
		for (int i=0; i< str1.length(); i++) {
			System.out.println(str1.charAt((i)));
		}

		System.out.println(str1.indexOf('c')); 	// c라는 글자의 인덱스를 출력 = 몇번 째 값이냐?
		System.out.println(str1.equals(str3));  // ()안에 거랑 같냐?
		System.out.println(str4.trim());		//	패드의 노트 봐라
		System.out.println(str1.replace('a', 'Z'));  	//바꿀거
		System.out.println(str1);				// 위에서 replace 썻다고 다음에도 바뀌는 거 아님. 해당코드에서만 바뀜.ㅎ 
		System.out.println(str1.replaceAll("avc" , "ZZZZZ")); // 해당 문자열 바꾸기 ㅋ

		
		
		
		
	}

}
