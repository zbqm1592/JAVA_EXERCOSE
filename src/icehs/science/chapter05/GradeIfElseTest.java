package icehs.science.chapter05;

public class GradeIfElseTest {

	public static void main(String[] args) {

		int dong = 92;
		int sun = 85;
		
		if( dong >= 90 ) {
			System.out.printf("ȫ�浿 : �����մϴ�! %d���� �޾� A���� �Դϴ�.",dong);
		}
		
		else {
			System.out.printf("ȫ�浿 : �ƽ��Ե� %d�� �̳׿� ���� ����",dong);
		}
			System.out.println(" ");
		if( sun >= 90 ) {
			System.out.printf("ȫ��� : �����մϴ�! %d���� �޾� A���� �Դϴ�.",sun);
		}
		
		else {
			System.out.printf("ȫ��� : �ƽ��Ե� %d�� �̳׿� ���� ����",sun);
		}

	}

}
