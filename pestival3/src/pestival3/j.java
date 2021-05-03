package pestival3;

public class j {

	public static void main(String[] args) {
		// TODO Auto-generated method stubu
		int startValue = 2;
		int endValue = 1000;
		
            getPerfectNumber(startValue, endValue);
	}

	public static void getPerfectNumber(int startValue, int endValue) {
		System.out.print("2~1000까지의 완전수: ");
		for (int i = startValue; i <= endValue; i++) {
			int sum = 0;
			for (int j = 1; j <= i; j++) {
				if(i % j == 0) {
					sum += j;
				}
			}
			if( sum - i == i) {
				System.out.print(i+" ");
			}
		}
	}

}
