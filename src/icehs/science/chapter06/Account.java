package icehs.science.chapter06;

public class Account {
	String accName;
	String accNo;
	int balance; //�ܾ�
	
	void deposit(int money) {   // �Ա�
		System.out.println(money + "���� �Ա��մϴ�.");
		if(money < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
		}
		else {
			balance += money;
		System.out.println("�ܾ� : " + balance + "��");
		}
	}
	
	void withdraw(int money) {  // ���
		System.out.println(money + "���� ����մϴ�.");
		if(money < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
		}
		else if(money > balance) {
			System.out.println("[����] �ܾ��� �����մϴ�.");
		}
		else {
			balance -= money;
		}
		System.out.println("�ܾ� : " + balance + "��");
	}
	
	
	void printAccountInfo() {
		System.out.println("����  " + accNo + "(������ : " + accName + " )");
		System.out.println("�ܾ� : " + balance + "��");
	}
}
