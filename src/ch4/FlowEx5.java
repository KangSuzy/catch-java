package ch4;

import java.util.*;

public class FlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = ' ', opt = '0';
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("������ �Է��ϼ��� : ");
		score = scanner.nextInt();
		
		if (score>=90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score <94) {
				opt = '-';
			}
		} else if (score>=80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score <84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		System.out.printf("����� ������ %c%c �Դϴ�", grade, opt);
	}

}
