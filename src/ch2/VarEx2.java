package ch2;

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =20 ,y = 10;
		int tmp = 0; // �� ������ ���� ��ȯ�ϱ�����
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x:"+x+" y:" +y);
	}

}
