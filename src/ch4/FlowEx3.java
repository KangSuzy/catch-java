package ch4;

import java.util.*; // Scanner Ŭ������ ����ϱ� ���� �߰�

public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("���ڸ� �Է��ϼ��� : ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� input�� ����
		
		if (input == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
		} else {
			System.out.printf("�Է��Ͻ� ���ڴ� %d �Դϴ�", input);
		}
	}

}
