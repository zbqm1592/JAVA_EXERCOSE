package icehs.science.chapter04;

public class GradeTest {

	public static void main(String[] args) {

		int myClass = 75 ;
		boolean a = (myClass >= 90);
		boolean b = (myClass >= 80) && (myClass < 90);
		boolean c = (myClass >= 70) && (myClass < 80);
		boolean d = (myClass >= 60) && (myClass < 70);
		
		System.out.println("A���� : " + a);
		System.out.println("B���� : " + b);
		System.out.println("C���� : " + c);
		System.out.println("D���� : " + d);
		
	}

}
