package ch4;

import java.util.*;

public class FlowEx27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum = 0;
		boolean flag = true; // while 문의 조건식으로 사용될 변수
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요 (끝내려면 0 입력) : ");
		
		while(flag) { // flag 값이 true 이므로 조건식은 참이 된다 !
			System.out.print(">>");
			
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {
				sum += num; // 0 이 아니면 더한다
			} else {
				flag = false; // 0 인 경우 while 문 종료
			}
		}
		
		System.out.println("합계 : " + sum);
	}

}
