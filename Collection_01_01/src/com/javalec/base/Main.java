package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		
//		//나는 다른 데이터베이스에서 가지고와서 담는 걸 표현하는 방법
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student("James", 100));
		arrayList.add(new Student("Robert", 95));
		arrayList.add(new Student("Cathy", 90));

			
		for(int i=0; i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i).getName());
			System.out.println(arrayList.get(i).getScore());
			
		}
		
		
//		ArrayList<Student> arrayList = new ArrayList<Student>();
//		
//		arrayList.add(new Student("James", 100));
		
	}

}
