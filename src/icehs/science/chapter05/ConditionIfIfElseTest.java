package icehs.science.chapter05;

public class ConditionIfIfElseTest {

	public static void main(String[] args) {

		int age = 18;
		
		if ( age >= 19 ) {
			System.out.println("�����Դϴ�.");
			System.out.println("�����ϼ���.");
		}
		
		else if ( age >= 14 ) {
			System.out.println("û�ҳ��Դϴ�.");
			System.out.println("��ǳ�뵵�� �ñ��̱���.");
		}
		
		else {
			System.out.println("����Դϴ�.");
			System.out.println("������ ���ư�����.");
		}
	}
}
