package icehs.science.chapter05;

public class GuGuDanOddNumberTest {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 5; i++) {
			for(int j = 1; j <= 9; j++) {
				if((i*j) % 2 == 1) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}
			}
			System.out.println("");
		}

	}

}
