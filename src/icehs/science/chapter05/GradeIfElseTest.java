package icehs.science.chapter05;

public class GradeIfElseTest {

	public static void main(String[] args) {

		int dong = 92;
		int sun = 85;
		
		if( dong >= 90 ) {
			System.out.printf("홍길동 : 축하합니다! %d점을 받아 A학점 입니다.",dong);
		}
		
		else {
			System.out.printf("홍길동 : 아쉽게도 %d점 이네요 ㅎㅎ ㄲㅈ",dong);
		}
			System.out.println(" ");
		if( sun >= 90 ) {
			System.out.printf("홍길순 : 축하합니다! %d점을 받아 A학점 입니다.",sun);
		}
		
		else {
			System.out.printf("홍길순 : 아쉽게도 %d점 이네요 ㅎㅎ ㄲㅈ",sun);
		}

	}

}
