package com.javalec.function;

public class Cal_add {
	private int inputNum1;
	private int inputNum2;
	private int result;
	
	public Cal_add() {
		// TODO Auto-generated constructor stub
	}

	public Cal_add(int inputNum1, int inputNum2) {
		super();
		this.inputNum1 = inputNum1;
		this.inputNum2 = inputNum2;
		
		add();
		printAdd();
	}
	
	private void add() {
		result = this.inputNum1+this.inputNum2;
	}
	
	private void printAdd() {
		System.out.println(this.inputNum1 + " + " + this.inputNum2 + " = " + result);
	}
}
