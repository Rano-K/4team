package com.javalec.function;

public class Cal_reminder {
	
	//field
	private int firstNum = 0;
	private int secondNum = 0;
	private int reminder1 = 0; //��
	private int reminder2 = 0; //������
	
	//constructor������-main���� �����ڸ� �ҷ���
	public Cal_reminder() {
		
	}

	public Cal_reminder(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		
		result1(); //��
		result2(); //������
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
