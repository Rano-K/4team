package com.javalec.function;

public class Cal_reminder {
	
	//field
	private int firstNum = 0;
	private int secondNum = 0;
	private int reminder1 = 0; //몫
	private int reminder2 = 0; //나머지
	
	//constructor생성자-main에서 생성자를 불러옴
	public Cal_reminder() {
		
	}

	public Cal_reminder(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		
		result1(); //몫
		result2(); //나머지
	}
	
	//method
	private void result1() {
		reminder1 = this.firstNum / this.secondNum;
		System.out.println(firstNum + " / " + secondNum + " = " + reminder1);
	}
	
	private void result2() {
		reminder2 = this.firstNum % this.secondNum;
		System.out.println(firstNum + " % " + secondNum + " = " + reminder2);
	}
	

}
