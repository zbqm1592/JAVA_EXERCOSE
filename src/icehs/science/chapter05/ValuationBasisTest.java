package icehs.science.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		int firstNo = 10;
        int secondNo = 20;
        int thirdNo = 40;
        int forthNo = 50;
        int fifthNo = 80;
        
        double result = 0;
        result += firstNo * secondNo / 2 * 0.6;
        result += (thirdNo + forthNo) / 2 * 0.13;
        result += fifthNo * 0.27;
        
        System.out.println("�� ���� : "+result);
        if(result >= 95 && result <=100) {
            System.out.println("Special Class �Դϴ�.");
        }else if(result >= 90){
            System.out.println("Gold Class �Դϴ�.");
        }else if(result >= 85) {
            System.out.println("Silver Class �Դϴ�.");
        }else if(result >= 80) {
            System.out.println("Bronze Class �Դϴ�.");
        }else {
            System.out.println("Member");
        }
	}
}
   
 
 
