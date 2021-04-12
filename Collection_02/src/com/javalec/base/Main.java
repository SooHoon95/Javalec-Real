package com.javalec.base;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
//		HashMap
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
 		hashMap.put(1, "str0");
 		hashMap.put(2, "str1");
 		hashMap.put(3, "str2");
 		hashMap.put(4, "str3");
		
		System.out.println(hashMap);
		System.out.println(hashMap.get(hashMap.get(1)));		// Map 타입은 순서가 없다 그래서 프린트하면 null값으로 나옴

		HashMap<String, String> hashmap2 = new HashMap<String, String>();
		hashmap2.put("a", "apple");
		hashmap2.put("b", "banana");
		hashmap2.put("c", "coke");
		System.out.println(hashmap2);
		System.out.println(hashmap2.get("c"));
		
		
		//map 값 지우기
		
		hashmap2.remove("a");
		System.out.println(hashmap2);
		
		hashmap2.clear();
		
		System.out.println(hashMap);
	}

}
