package com.javalec.function;

public class CellPhone {

	
	//Fields
	public String model ;
	public String color ;
	
	//Constructor
	public CellPhone() {
	
	}
	
	//Method
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message)/*무슨말을 할지 모르니까 매개변수로 할 말을 불러오기*/ {
		System.out.println("본인 : " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}

	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

//	---------------------


}