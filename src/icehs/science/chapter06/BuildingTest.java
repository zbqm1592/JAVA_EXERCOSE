package icehs.science.chapter06;

public class BuildingTest {

	public static void main(String[] args) {
	
		Building build1 = new Building();
		
		build1.name = "������Ÿ��";
		build1.address = "���";
		build1.totalFloor = 5;
		
		System.out.println("�ǹ��� :   " + build1.name);
		System.out.println("�ּ�    :   " + build1.address);
		System.out.println("����    :   " + build1.totalFloor);
		build1.moveElevator();
		System.out.println("���� ��");
		build1.changeAddress("������"); // �ּ� �ٲٱ�
		System.out.println("�ǹ��� :   " + build1.name);
		System.out.println("�ּ�    :   " + build1.address);
		System.out.println("����    :   " + build1.totalFloor);
	}

}
