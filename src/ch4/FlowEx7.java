package ch4;

import java.util.*;

public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("����(1) ����(2) ��(3) �� ������ : ");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random()*3)+1; // 1,2,3 �� �ϳ��� com �� �����
		
		System.out.println("����� "+user+" com�� "+com+" �� ������ϴ�");
		
		switch(user-com) {
		case 2: case -1:
			System.out.println("����� �����ϴ�");
			break;
		case 1: case -2:
			System.out.println("����� �̰���ϴ�");
			break;
		case 0:
			System.out.println("�����ϴ�");
			// ������ ���� break ���� ����
		}
	} // main ��

}
