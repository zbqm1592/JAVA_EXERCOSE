package icehs.science.chapter03;

public class TypeCastingEx {

	public static void main(String[] args) {
		
		long billWealth = 7000000000L;
		System.out.println("Original Value : " + billWealth);
		
		double doubleBill = billWealth;
		System.out.println("double������ ��ȯ  : " + doubleBill);
		
		int intBill = (int) billWealth;
		System.out.println("int������ ���� ��ȯ : " + intBill);

	}

}
