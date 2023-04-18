package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Cal_add;
import com.javalec.function.Cal_reminder;
import com.javalec.function.Cal_sub;

public class Team4_Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int firstNum = 0, secondNum = 0; // 첫번째 숫자, 두번째 숫자 초기화
		int add, sub, mul; // 덧셈, 뺄셈, 곱셈 값
		double divide, reminder1, reminder2; // 나눗셈, 몫, 나머지 값
		int inputNumber = 0; // 원하는 결과를 선택할 때 쓸 변수
		boolean loop = true;
		// 입력부분
		System.out.print("첫번째 숫자를 입력하세요: ");
		firstNum = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		secondNum = scanner.nextInt();

		// 출력부분
		while (loop) {
			System.out.println("***원하는 결과를 선택하세요***");
			System.out.println("1.덧셈\n2.뺄셈\n3.곱셈\n4.나눗셈\n5.몫과 나머지\n6.종료");
			inputNumber = scanner.nextInt();

			switch (inputNumber) {
			case 1:
				Cal_add cal_add = new Cal_add(firstNum, secondNum);
				break;
			
			case 2:
				Cal_sub cal_sub = new Cal_sub(firstNum, secondNum);
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				Cal_reminder cal_reminder = new Cal_reminder(firstNum, secondNum);
				break;
			case 6:
				loop =false ;
				System.out.println("감사합니다.");
				break;
			default:
				System.err.println("1부터 6사이 숫자만 입력 가능합니다.");
				break;
			}

		}
		
	}
}
