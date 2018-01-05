package icehs.science.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {

		int num1 = 2;
		int num2 = 3;
		int result = num1 * num2;
		
		if(result >= 0) {
			System.out.println(num1 + " * " + num2 + " : 한 자리 수입니다.");
		}
		
		else if(result >= 10) {
			System.out.println(num1 + " * " + num2 + " : 두 자리 수입니다.");
		}

		else if(result >= 100) {
			System.out.println(num1 + " * " + num2 + " : 세 자리 수 이상입니다.");
		}
		
		else {
			System.out.println(num1 + " * " + num2 + " : 음수는 확인하지 않습니다.");
		}
	}

}
