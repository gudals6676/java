package pestival1;

import java.util.Random;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
       int[]lotto = new int[6];
       for (int i = 0; i < lotto.length; i++) {
		int num = rd.nextInt(45)+1;
		lotto[i] = num;
		
		for (int j = 1; j <= i; j++) {
			if(lotto[i]==lotto[j-1]) {
				i--;
				break;
			}
		}
	}
       for (int i = 0; i < lotto.length; i++) {
		System.out.println("행운의 숫자 : "+lotto[i]);
	}
	}

}
