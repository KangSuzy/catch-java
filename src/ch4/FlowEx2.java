package ch4;

import java.util.*; // Scanner Ŭ������ ����ϱ� ���� �߰�

public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		input = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		
		if (input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0 �Դϴ�");
		}
		if (input!=0) {
			System.out.printf("�Է��Ͻ� ���ڴ� %d �Դϴ�", input);
		}
	} // main ��

}
