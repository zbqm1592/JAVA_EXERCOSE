package icehs.science.chapter03;

public class StatisticCastingTest {

	public static void main(String[] args) {
	
		double lottoProbability = 0.0000001235;  // �ζ� Ȯ��
		long population = 6973738433L;           // �α���
		int intLotto = (int)lottoProbability;    // �ζ�Ȯ�� ����
		int intPopulation = (int)population;     // �α��� ����
		
		System.out.println(lottoProbability);
		System.out.println(intLotto);
		System.out.println(population);
		System.out.println(intPopulation);
	}

}
