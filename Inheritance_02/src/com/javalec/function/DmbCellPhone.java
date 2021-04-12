package com.javalec.function;

public class DmbCellPhone extends CellPhone {

	//Fields
	public int channel ;
	
	//Constructor
	public DmbCellPhone() {	//기본컨스트럭트는 무조건 만들어 주는게 좋다 어떨 때 쓰일 지 모르니깐... 근데 어떨 때 쓰임..?
		// TODO Auto-generated constructor stub
	}

	public DmbCellPhone(String model, String color, int channel) {
//		super();  있어도 돼고 없어도 됌 지금은 ㅎ ㅋ 
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	
	//Method
	public void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB ㄴ방송 수신을 시작 합니다.");
	}

	public void changeChannelDmb(int channel) {
		this.channel = channel; //this 는 나의 필드 값에서 값을 불러서 주는 것.
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	
	
	
}
