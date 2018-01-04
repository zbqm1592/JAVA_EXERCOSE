package icehs.science.chapter04;

public class InDeOperatorEx {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(++num1);   // num1 = 11
		System.out.println(num2++);   // num2 = 3으로 출력된 후 4가 됨
		
		int result = --num1 + num2-- ;
				
		System.out.println(result);   // result = (11-1) + 4 = 14 | 그 후 num2 = (4-3) = 3
	}

}
