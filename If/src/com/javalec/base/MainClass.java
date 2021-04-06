package com.javalec.base;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// 비교문(조건문 = branch) #1
		
		int i = 10; // 어디어디에다가 쓰는 변수다 라고 정리해주는 것이 용이
		int j = 20;
		int k = 10;
//		
//		if( j > k ) {
//			System.out.println("j가 k보다 큽니다.");
//		}
//		
//		System.out.println(">>> End <<<");
		
		
		// 비교문 #2 : 비교문으로 입력한 숫자 크기의 차이구하기
		
//		if (i > j) { // 여기서 False 가 나오니까 else 로 들어가서 출력
//			System.out.println("i는 j보다" + (i - j) + "만큼 크다.");
//		}else {
//			System.out.println("j는 i보다" + (j-i) + "만큼 큽니다.");
//		}
//	
		
		
		// 비교문 # 3 : 비교문으로 크다, 작다, 같다의 3종류 이상의 비교문 만들기.
		
		
//		if(i > j) {
//			System.out.println("i가 j보다 큽니다");
//		}else if (i==j) {
//			System.out.println("i와 j가 같습니다");
//		}else {
//			System.out.println("i가 j보다 작습니다.");
//		}
//
//		
//		System.out.println(">>> End <<<");
		
//		int price = 5000;
		
		
//		if( price > 8000) {
//			System.out.println("너무 비쌉니다.");
//		}else if (price > 5000) {
//			System.out.println("조금 비쌉니다.");
//		}else if ( price > 3000) {
//			System.out.println("적당한 금액입니다.");
//		}else {
//			System.out.println("싼편입니다.");
//		}
//		
//		System.out.println("구매 하시겠습니까?");
		
		
		/*
		 성적을 입력하세요 : 90 >>>> 스캐너 필요
		 귀하의 학점은 A학점 입니다.
		 
		 
		 성적을 입력하세요 : 80
		 귀하의 학점은 B학점 입니다.
		 
		 40 
		 귀하의 학점은 F학점 입니다.
		 
		 */
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("성적을 입력해 주세요.");
//		int num = scanner.nextInt();
//		
		
//		if( num >= 90) {
//			System.out.println("귀하의 학점은 A입니다.");
//		} else if (num >= 80) {
//			System.out.println("귀하의 학점은 B입니다.");
//		}else if (num >= 70) {
//			System.out.println("귀하의 학점은 C입니다.");
//		}else if (num >= 60) {
//			System.err.println("귀하의 학점은 D입니다.");
//		}else if ( num >= 50) {
//			System.out.println("귀하의 학점은 E입니다.");
//		}else
//			System.out.println("귀하의 학점은 F입니다.");
		
		
		
//		Scanner scanner = new Scanner(System.in);
	//	
//		System.out.println("국어 성적을 입력해 주세요.");
//		int korean = scanner.nextInt();
//		
//		
//		Scanner scanner1 = new Scanner(System.in);
//		System.out.println("영어 성적을 입력해주세요");
//		int english = scanner1.nextInt();
//		
//		
//		Scanner scanner2 = new Scanner(System.in);
//		System.out.println("수학점수를 입력해주세요");
//		int math = scanner2.nextInt();
		
		
//		System.out.println("평균점수 : " + 
//				(double)(korean + english + math)/3);
		
		
//		double averDouble = 80.0;
		
//		System.out.println(korean > averDouble ? 
//					"국어점수는 평균보다 높습니다." : "국어점수는 평균보다 낮습니다.");
//		System.out.println(english > averDouble ? 
//				"영어점수는 평균보다 높습니다." : "영어점수는 평균보다 낮습니다.");
//		System.out.println(math > averDouble ? 
//				"수학점수는 평균보다 높습니다." : "수학점수는 평균보다 낮습니다.");
		
		
		
		// BMI 계산 및 과체중 여부 출력하기
		
		String low = "저체중";
		String normal = " 정상";
		String over = " 과체중";
		String obes = " 비만";
		String highfat = " 고도비만";
		String extrafat = "초고도비만";
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("키를 입력하시오");
		double tDouble = sc.nextDouble();
		System.out.println("몸무게를 입력하시오");
		double wDouble = sc.nextDouble();
		
		System.out.println("당신의 BMI 지수는 " + 
						(wDouble / ((double)tDouble*tDouble)));
		
		double bmiDouble = (wDouble / ((double)tDouble*tDouble));
		
		if (bmiDouble < 18.5) {
			System.out.print("당신은 " + low);
		}else if(bmiDouble >= 18.5) {
			System.out.print("당신은 " + normal);			
		}else if (bmiDouble >= 23 ) {
			System.out.print("당신은 " + over);			
		}else if (bmiDouble >= 25) {
			System.out.print("당신은 " + obes);			
		}else if (bmiDouble >= 30) {
			System.out.print("당신은 " + highfat);
		}else if (bmiDouble >= 35) {
			System.out.print("당신은 " + extrafat);
		}
			
		System.out.println("입니다.");
		
		
		
		
	}

}
