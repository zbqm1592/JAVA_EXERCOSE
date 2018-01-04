package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		String name = "이준호" ;
		String mathScore = "100" ;                  // 수학점수 문자형
		int engScore = 100 ;
		
		int intMath = Integer.parseInt(mathScore);  // 수학점수 숫자형으로 변환
		
		System.out.println("이름        |  " + name + "   |");
		System.out.println("수학점수  |  " + intMath + "   |");
		System.out.println("영어점수  |  " + engScore + "   |");
		System.out.println("합계점수  |  " + (intMath + engScore + "   |"));
		System.out.println("----------------");

	}

}
