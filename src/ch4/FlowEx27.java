package ch4;

import java.util.*;

public class FlowEx27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum = 0;
		boolean flag = true; // while ���� ���ǽ����� ���� ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ��� (�������� 0 �Է�) : ");
		
		while(flag) { // flag ���� true �̹Ƿ� ���ǽ��� ���� �ȴ� !
			System.out.print(">>");
			
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {
				sum += num; // 0 �� �ƴϸ� ���Ѵ�
			} else {
				flag = false; // 0 �� ��� while �� ����
			}
		}
		
		System.out.println("�հ� : " + sum);
	}

}
