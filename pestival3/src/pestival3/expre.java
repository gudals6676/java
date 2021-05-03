package pestival3;

import java.beans.Expression;

public class expre {

	public static <Expressions> void main( ) {
		Expressions expressions = new Expressions();
		System.out.println();
	}

	public  int Expressions(int num) {
		int cnt = 0;
		for (int i = 1; i <= num; i++) {
			int sum = 0;
			for (int j = i; j <= num; j++) {
				sum += j;
				if(sum == num) {
					cnt++;
				}else if(sum > num) {
					break;
				}
			}
		}
		return cnt;
	}
}
