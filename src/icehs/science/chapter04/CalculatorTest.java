package icehs.science.chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 7;
		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int rem = num1 % num2;
		
		System.out.println("20 °ú 7");
		System.out.println("µ¡¼À °á°ú : " + (add));
		System.out.println("»¬¼À °á°ú : " + (sub));
		System.out.println("°ö¼À °á°ú : " + (mul));
		System.out.println("³ª´°¼À °á°ú : " + (div));
		System.out.println("³ª¸ÓÁö ¿¬»ê °á°ú : " + (rem));

	}

}
