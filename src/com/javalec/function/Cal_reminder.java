package com.javalec.function;

public class Cal_reminder {
	
	//field
	private int firstNum = 0;
	private int secondNum = 0;
	private int reminder1 = 0; //¸ò
	private int reminder2 = 0; //³ª¸ÓÁö
	
	//constructor
	public Cal_reminder() {
		
	}

	public Cal_reminder(int firstNum, int secondNum, int reminder1, int reminder2) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.reminder1 = reminder1;
		this.reminder2 = reminder2;
		
		result1(); //¸ò
		result2(); //³ª¸ÓÁö
	}
	
	//method
	private void result1() {
		reminder1 = this.firstNum / this.secondNum;
		System.out.println(firstNum + "/" + secondNum + "=" + reminder1);
	}
	
	private void result2() {
		reminder2 = this.firstNum % this.secondNum;
		System.out.println(firstNum + "%" + secondNum + "=" + reminder2);
	}
	

}
