package com.javalec.function;

public class Cal_sub {

	// Field
	private int firstNum = 0;
	private int secondNum = 0;
	private int result = 0;
	
	// Constructor
	public Cal_sub() {
		
	}

	public Cal_sub(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		sub();
	}
	
	// Method
	public void sub() {
		result =  firstNum - secondNum;
		System.out.println(firstNum + " - " + secondNum + " = " + result);
	}
	
	
}
