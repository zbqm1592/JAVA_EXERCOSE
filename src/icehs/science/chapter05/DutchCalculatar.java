package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalculatar {

	public static void main(String[] args) {
		int totalmoney = 0;
		int member = 0;
		System.out.print("������ �������� ����Ǿ�����? : ");
		int moim = getUserInput();
		System.out.println("==================");
		for(int i = 1; i <= moim; i++) {
			System.out.print(i + "�� ��� : ");
			totalmoney += getUserInput();
		}
		System.out.println("�� ����� " + totalmoney + "�� �Դϴ�.");
		System.out.println("==================");
		
		System.out.print("������ �ο����� �Է��ϼ��� : ");
		member = getUserInput();
		int avgMoeny = totalmoney/member;
		System.out.println("==================");
		System.out.println("��ġ���� �ݾ���?");
		for(int i= 1; i <= member; i++) {
			if( i != member) {
				totalmoney -= avgMoeny;
				System.out.print(i + " : " + avgMoeny+"��");
			}
			else {
				System.out.print(i + " : " + totalmoney +"��");
			}
			System.out.println();
		}
		

	}
public static int getUserInput() {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
}
