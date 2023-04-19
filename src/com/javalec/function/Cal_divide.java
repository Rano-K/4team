package com.javalec.function;

public class Cal_divide {
	
	public int firstNum;
	public int secondNum;
	public int result=0;
	//Constructor
	
	public Cal_divide () {
		//TODO Auto-generated constructor stub
	}

	public Cal_divide(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		Divide();
	}
	
	//Method 곱셈 나눗셈
	
	private void Divide () {
		result =firstNum/secondNum;
		System.out.println((double)firstNum+"/"+secondNum+"="+result);
	}

}
