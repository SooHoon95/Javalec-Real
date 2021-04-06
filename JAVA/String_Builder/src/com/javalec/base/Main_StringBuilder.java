package com.javalec.base;

public class Main_StringBuilder {

	public static void main(String[] args) {

	//String의 문제점을 해결하기 위해 나온 문자열 선언자들
		String string = new String("abcdef");
		
		StringBuilder stringBuilder = new StringBuilder("abcdef");
		stringBuilder.append("hijklmn");
		System.out.println(stringBuilder);
		
		stringBuilder.insert(3, "zzz");			//추가하기 한국말로는 덮어쓰기 3번째에 ㅋㅋ추가하겠다는 뜻 
		System.out.println(stringBuilder);

		stringBuilder.delete(3, 6);
		System.out.println(stringBuilder);
//--------------------
		StringBuilder stringBuffer = new StringBuilder("abcdef"); // 똑같이 덧붙
		stringBuffer.append("hijklmn");			
		System.out.println(stringBuffer);
//		==================
//		stringBuilder.delete(3, 6);
//		System.out.println(stringBuilder);
//		
//		stringBuilder.insert(3, "zzz");			//추가하기 한국말로는 덮어쓰기 3번째에 ㅋㅋ추가하겠다는 뜻 
//		System.out.println(stringBuilder);
//		
//		stringBuilder.delete(3, 6);
//		System.out.println(stringBuilder);
	}

}
