package com.javalec.gugu;

import java.util.Scanner;

public class IntegerSum {

	
	// Field
	public int tot = 0;
	
	
	
//	//Constructor
	public IntegerSum() {
	
	}
	
	
	//Method
	
	public void spread() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer(0~9) : ");
		int num = sc.nextInt();
//		String num1 = Integer.toString(num);
		
		
//		for (int i=0; i<=num1.length(); i++) {
//			tot+= num%10;
//			num = num/10;
//		}
		while (num>0) {
			tot+= num%10;
			num = num/10;
		}
			System.out.println("Sum of digits : " + tot);
			
	}
	
	
	
	

}
