package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int num = 456;
		int num100 = num / 100; 
		int num10 = (num / 10) % 10;
		int num1 = num % 10;
				
		System.out.println(num100);
		System.out.println(num10);
		System.out.println(num1);

	}

}
