package icehs.science.chapter05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		
		double sum = 0;
		
		for(int i = 0; i <= 500; i++) {
			sum += i;
		}
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + (double)sum/500);
	}

}
