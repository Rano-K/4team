package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Cal_add;
import com.javalec.function.Cal_reminder;
import com.javalec.function.Cal_sub;

public class Team4_Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int firstNum = 0, secondNum = 0; // ù��° ����, �ι�° ���� �ʱ�ȭ
		int add, sub, mul; // ����, ����, ���� ��
		double divide, reminder1, reminder2; // ������, ��, ������ ��
		int inputNumber = 0; // ���ϴ� ����� ������ �� �� ����
		boolean loop = true;
		// �Էºκ�
		System.out.print("ù��° ���ڸ� �Է��ϼ���: ");
		firstNum = scanner.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���: ");
		secondNum = scanner.nextInt();

		// ��ºκ�
		while (loop) {
			System.out.println("***���ϴ� ����� �����ϼ���***");
			System.out.println("1.����\n2.����\n3.����\n4.������\n5.��� ������\n6.����");
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
				System.out.println("�����մϴ�.");
				break;
			default:
				System.err.println("1���� 6���� ���ڸ� �Է� �����մϴ�.");
				break;
			}

		}
		
	}
}
