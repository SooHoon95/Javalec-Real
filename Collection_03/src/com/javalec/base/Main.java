package com.javalec.base;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		//Set
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("c");
		
		System.out.println(hashSet);	// c값은 한번만 나온다. 쓰는 방법은 동일하다 .
		
	}

}
