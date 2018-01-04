package icehs.science.chapter03;

public class StatisticCastingTest {

	public static void main(String[] args) {
	
		double lottoProbability = 0.0000001235;  // 로또 확률
		long population = 6973738433L;           // 인구수
		int intLotto = (int)lottoProbability;    // 로또확률 정수
		int intPopulation = (int)population;     // 인구수 정수
		
		System.out.println(lottoProbability);
		System.out.println(intLotto);
		System.out.println(population);
		System.out.println(intPopulation);
	}

}
