package icehs.science.chapter06;

public class Building {
	String name; //건물명
	String address; //주소
	int totalFloor; //전체 층 수
	
	void moveElevator() {
		System.out.println("엘리베이터를 운행합니다.");
	}
	void changeAddress(String newAddress) {
		address = newAddress;
	}
}
