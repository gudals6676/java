import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		if (num%10>5) {
          System.out.print("�ݿø� ��: "+(10-num%10+num));
	}else {
         System.out.println("�ݿø� �� : "+ (num-(num%10)));
}
}
}