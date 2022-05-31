package ch4;

import java.util.*;

public class FlowEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("달을 입력하세요: ");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄이네요 !");
			break;
		case 6: case 7: case 8:
			System.out.println("여름입니다 !");
			break;
		case 9: case 10: case 11:
			System.out.println("가을이네요 !");
			break;
		default:
		case 12: case 1: case 2:
			System.out.println("겨울입니다 !");
		}
	} // main 의 끝

}
