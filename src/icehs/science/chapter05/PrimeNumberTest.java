package icehs.science.chapter05;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = getUserInput();
		for(int i = 2; i < num; i++) {
			if((num % i != 0)) {
				System.out.print(num + "�� �Ҽ��Դϴ�."); break;
			}
			else {
				System.out.print(num + "�� �Ҽ��� �ƴմϴ�."); break;
				}
			
		}
		
	}
public static int getUserInput() {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
}
