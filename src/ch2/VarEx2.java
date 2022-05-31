package ch2;

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =20 ,y = 10;
		int tmp = 0; // 두 변수의 값을 교환하기위해
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x:"+x+" y:" +y);
	}

}
