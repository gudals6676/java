package pestival2;

import java.util.Scanner;

public class m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
        int result = sc.nextInt();
        System.out.println("���('-')�� �� �� >> "+toNum(result));
	}
	
   public static int toNum(int num) {
	int result = 0;
	int[]nums = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
	while (num > 0 ) {
		int num2 = num % 10;
		num /= 10;
		result += nums[num2];
	}
	return result;
}
}
