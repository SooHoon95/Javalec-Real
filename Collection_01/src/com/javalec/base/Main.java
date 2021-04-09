package com.javalec.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
			

	
	
	//Linked List
	LinkedList<String> linkedlist = new LinkedList<String>();
	System.out.println(">>>> Linked List <<<<");
	linkedlist.add("str1");
	linkedlist.add("str2");
	linkedlist.add("str3");
	linkedlist.add("str4");
	//ArrayList
	
	ArrayList<String> arrayList = new ArrayList<String>();
	System.out.println("<<<<<Array List>>>>>");
	
//	//ArrayList 에  Data 추가하기
//	arrayList.add("str1");
//	arrayList.add("str2");
//	arrayList.add("str3");
//	arrayList.add("str4");
//	
//	System.err.println(arrayList);
	
	
	//ArrayList의 Data불러오기
	String str1 = linkedlist.get(3);
	System.out.println("Index 3 : " + str1);
	
	//ArrayList의 특정 index의 data를 수정하기
	
	linkedlist.set(1, "str2222");// 어레이 리스트의 1번지를 2222로 바꿀거임
	System.out.println(linkedlist);
	
	
	//ArrayList의 크기 확인하기
	int size = linkedlist.size();
	System.out.println("Size : " + size);
	
	
	//ArrayList의 내용 삭제하기
	linkedlist.remove(1);
	System.out.println(linkedlist);
	linkedlist.remove("str4");
	System.out.println(linkedlist);
	
	//ArrayList의 내용 전부 초기화 하기
	
	linkedlist.clear();
	System.out.println(linkedlist);
	
	
	//ArrayList
	
	
	//Vector
	
	Vector<String> vector = new Vector<String>();
	System.out.println(">>>>> Vector <<<<<<");
	vector.add("str1");
	vector.add("str2");
	vector.add("str3");
	vector.add("str4");
	
	String str2 = vector.get(3);
	System.out.println(str2);
	
	vector.set(1, "str22222");
	System.out.println(vector);
	
	int size1 = vector.size();
	System.out.println(size1);
	
	vector.remove(1);
	System.out.println(vector);
	vector.remove("str4");
	System.out.println(vector);
	
	vector.clear();
	System.out.println(vector);
	
	
	
	}
	

}
