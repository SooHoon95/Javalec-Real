package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.DmbCellPhone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		DmbCellPhone phone =new DmbCellPhone("자바폰" , "검정" , 10);
		
		System.out.println("모델 : " + phone.model);
		System.out.println("색상 : " + phone.color);
		phone.powerOn();
		phone.bell();
		phone.sendVoice("여보세요" );
		phone.receiveVoice("안녕하세요! 저는 홍길동 인데요");
		phone.sendVoice("아! 반갑습니다. 그럼 안녕히 ~~~");
		phone.turnOnDmb(10);
		phone.changeChannelDmb(12);
		phone.hangUp();
	}

}
