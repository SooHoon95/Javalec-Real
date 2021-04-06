package com.javalec.base;

public class Main_OOP_01 {

	public static void main(String[] args) {

		// 1~10까지의 합을 구하여 출력하고. 그 합이 짝수인지 홀수인지 판다하라.
		int total = 0;
		String holJak = "";
		
		for(int i=1; i<=10; i++) {
			total+= i;
			
		}
			
			switch (total%2) {
			
			case 0: {
				holJak = "짝수 ";
				break;
				} 
			
			case 1 : {
				holJak = "홀수";
				
				break;
				}
			
			}
	
			System.out.println("1~10까지의 합은 " + total + "이고 " + holJak + "입니다.");
	
			
			
//			======갑자기 누군가는 100 까지 누군가는 1000까지 원할 수도 있다. 또, 누구는 짝 홀 필요없다고할수도 있음. 
//			이럴경우에는 데이터를 불러쓰면 되는 거임.  OOP_02 로 가
	}

}
