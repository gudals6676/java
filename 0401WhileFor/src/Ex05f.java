import java.util.Scanner;

public class Ex05f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		while(true) {
			System.out.println("���ڸ� �Է��ϼ��� ");
			int num = sc.nextInt();
			if (num > 0 && num <= 100) {
				sum += num;
				cnt++; // cnt+=1; 
			}else {
				break;
			}
			
		}
		System.out.println("�հ�:"+ sum);
		System.out.println("���:"+ ((float)sum / cnt));

	}

}
