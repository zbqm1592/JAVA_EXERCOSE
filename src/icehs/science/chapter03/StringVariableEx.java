package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		String name = "����ȣ" ;
		String mathScore = "100" ;                  // �������� ������
		int engScore = 100 ;
		
		int intMath = Integer.parseInt(mathScore);  // �������� ���������� ��ȯ
		
		System.out.println("�̸�        |  " + name + "   |");
		System.out.println("��������  |  " + intMath + "   |");
		System.out.println("��������  |  " + engScore + "   |");
		System.out.println("�հ�����  |  " + (intMath + engScore + "   |"));
		System.out.println("----------------");

	}

}
