package icehs.science.chapter05;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요 : ");
		int num = getUserInput();
		for(int i = 2; i < num; i++) {
			if((num % i != 0)) {
				System.out.print(num + "은 소수입니다."); break;
			}
			else {
				System.out.print(num + "은 소수가 아닙니다."); break;
				}
			
		}
		
	}
public static int getUserInput() {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
}
