package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		
		int monthSalary = 1000000;
		
		int bonus = monthSalary * 20 / 100 * 4;
		int bonustax = bonus * 55 / 1000;
		int yearSalary = monthSalary * 12;
		int yeartax = yearSalary * 10 / 100;
		int totalMoney = yearSalary - yeartax + bonus - bonustax;
		
		System.out.println("���� : " + yearSalary + ", ���� ���� : " + (yearSalary - yeartax));
		System.out.println("���ʽ� : " + bonus + ", ���� ���ʽ� : " + (bonus - bonustax));
		System.out.println("���޾� : " + totalMoney);
		
		
		

	}

}
