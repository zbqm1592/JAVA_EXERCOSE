package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		
		int totalSum = 0;
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i = 0; i <= 1000; i++) {
			totalSum += i;
			if (i%2==0) {
				oddSum += i ;
			}
			else if(i % 2 == 1) {
				evenSum += i ;
		}
		
			}
		System.out.println("1부터 1000까지의 합 : " + totalSum);
		System.out.println("1부터 1000까지 짝수들의 합 : " + oddSum);			
		System.out.println("1부터 1000까지 홀수들의 합 : " + evenSum);
			
		}
	
	}

