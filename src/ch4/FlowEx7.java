package ch4;

import java.util.*;

public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("가위(1) 바위(2) 보(3) 중 고르세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random()*3)+1; // 1,2,3 중 하나가 com 에 저장됨
		
		System.out.println("당신은 "+user+" com은 "+com+" 를 골랐습니다");
		
		switch(user-com) {
		case 2: case -1:
			System.out.println("당신이 졌습니다");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다");
			break;
		case 0:
			System.out.println("비겼습니다");
			// 마지막 문장 break 생략 가능
		}
	} // main 끝

}
