package icehs.science.chapter06;

public class Building {
	String name; //�ǹ���
	String address; //�ּ�
	int totalFloor; //��ü �� ��
	
	void moveElevator() {
		System.out.println("���������͸� �����մϴ�.");
	}
	void changeAddress(String newAddress) {
		address = newAddress;
	}
}
