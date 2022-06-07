package ch5;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4]; // int tmp = score[3] +  score[4]
		
		//for문 배열 모든 요소 출력
		for (int i=0;i<score.length;i++) {
			System.out.printf("score[%d] :  %d%n",i,score[i]);
		}
		
		System.out.printf("tmp:%d%n", tmp);
		
	//System.out.printf("score[%d] :  %d%n",7,score[7]); // index 의 범위를 벗어난 값 : 에러 !
	}//main

}
