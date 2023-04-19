package com.javalec.function;

public class Cal_mul {
	
	//Field
	
	public int firstNum;
	public int secondNum;
	public int result=0;
	//Constructor
	
	public Cal_mul () {
		//TODO Auto-generated constructor stub
	}

	public Cal_mul(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		Mul();
	}
	//Method 곱셈 나눗셈
	
	private void Mul () {
		result =firstNum*secondNum;
		System.out.println(firstNum+"X"+secondNum+"="+result);
		}
	
	
	
}
