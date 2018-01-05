package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalculatar {

	public static void main(String[] args) {
		int totalmoney = 0;
		int member = 0;
		System.out.print("모임이 몇차까지 진행되었나요? : ");
		int moim = getUserInput();
		System.out.println("==================");
		for(int i = 1; i <= moim; i++) {
			System.out.print(i + "차 비용 : ");
			totalmoney += getUserInput();
		}
		System.out.println("총 비용은 " + totalmoney + "원 입니다.");
		System.out.println("==================");
		
		System.out.print("모임의 인원수를 입력하세요 : ");
		member = getUserInput();
		int avgMoeny = totalmoney/member;
		System.out.println("==================");
		System.out.println("더치페이 금액은?");
		for(int i= 1; i <= member; i++) {
			if( i != member) {
				totalmoney -= avgMoeny;
				System.out.print(i + " : " + avgMoeny+"원");
			}
			else {
				System.out.print(i + " : " + totalmoney +"원");
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
