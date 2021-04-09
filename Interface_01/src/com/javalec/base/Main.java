package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		
		SmartPhone aphone = new Aphone();
		SmartPhone bphone = new BPhone();
		SmartPhone cphone = new CPhone();
//		
//		aphone.callSenderReceiver();
//		aphone.tellMethod();
//		aphone.tvRemoteController();
//		
		SmartPhone[] smartPhone = {aphone, bphone, cphone};
		for(int i=0; i<smartPhone.length; i++) {
			smartPhone[i].callSenderReceiver();
			smartPhone[i].tellMethod();
			smartPhone[i].tvRemoteController();
			System.out.println("=------------------------=");
		}
		
	}

}
