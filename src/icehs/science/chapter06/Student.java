package icehs.science.chapter06;

public class Student {
	String stuName;
	String stuId;
	
	int korScore;
	int engScore;
	int mathScore;
	
	int avgScore;
	
	void printStudentInfo() {
		System.out.println("�л� �̸� : " + stuName);
		System.out.println("�л� ��ȣ : " + stuId);
		System.out.println("���� ���� : " + korScore);
		System.out.println("���� ���� : " + engScore);
		System.out.println("���� ���� : " + mathScore);
		System.out.println("���� ���� : " + ((int)korScore + engScore + mathScore));
		System.out.println("���� ��� : " + calculateAvg());
		
	}
	
	int calculateAvg() {
		avgScore = ( korScore + engScore + mathScore ) /3 ;
		return avgScore;
	}
	
	void changeStudentId(String newStuId) {
		stuId = newStuId;
	}
}