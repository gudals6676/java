package pestival2;

import java.util.Random;

public class g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(45) + 1;
		
			for (int j = 1; j <= i; j++) {
				if (lotto[i] == lotto[j - 1]) {
					i--;
					break;
				}
			}
		}
		for (int j = 0; j < lotto.length; j++) {
			System.out.println("행운의숫자: " + lotto[j]);
		}

	}

}
