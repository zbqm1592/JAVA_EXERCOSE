package icehs.science.chapter03;

public class StudentScore {

	public static void main(String[] args) {
		
		double mathScore = 94.7;        // 수학 점수
		double engScore = 83.2;         // 영어 점수
		double korScore = 87.1;         // 국어 점수
		int intMath = (int)mathScore;   // 수학 점수 정수형
		int intEng = (int)engScore;     // 영어 점수 정수형
		int intKor = (int)korScore;     // 국어 점수 정수형
		
		System.out.println("수학 : " + intMath);
		System.out.println("영어 : " + intEng);
		System.out.println("국어 : " + intKor);

	}

}
