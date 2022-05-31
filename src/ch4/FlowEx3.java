package ch4;

import java.util.*; // Scanner 클래스를 사용하기 위해 추가

public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("숫자를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 input에 저장
		
		if (input == 0) {
			System.out.println("입력하신 숫자는 0입니다");
		} else {
			System.out.printf("입력하신 숫자는 %d 입니다", input);
		}
	}

}
