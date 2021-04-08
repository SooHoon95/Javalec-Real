package com.javalec.base;

public class FirstSon {

	//Field
	
	
	//Constructor
	public FirstSon() {
		// TODO Auto-generated constructor stub
	}
	
	//Method
//	public void takeChoco(){
////		MamaBag mamaBag = new MamaBag();
////		mamaBag.choco = mamaBag.choco -1;
//		MamaBag.choco-= 1;
//		
//		if(MamaBag.choco < 0 ) {
//			System.out.println("첫 쨰는 초코파이 먹고 싶어요 !");
//		}else {
//			System.out.println("첫째는 맛있게 먹었어요....");
//		}
//	}
	
	public void takeChoco() {
		MamaBag.choco-=1;
		if (MamaBag.choco < 0) {
			System.out.println("첫째 하나 주지??");
			
		}else {
			System.out.println("첫째 잘 먹었다 꺼억~");
		}
	}
	
	
	
	
}
