package icehs.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student hong = new Student();
		
		hong.stuName = "ȫ�浿";
		hong.stuId = "stu001";
		hong.korScore = 94;
		hong.engScore = 80;
		hong.mathScore = 89;
		
		hong.printStudentInfo();
		
		System.out.println("");
		System.out.println("�й� ����");
		hong.changeStudentId("STU0001");
		
		hong.printStudentInfo();
	}

}
