import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int now = 0, goal =0, num = 0, week = 0;
		 System.out.print("���� ������: ");
		 now = sc.nextInt();
		 System.out.print("��ǥ ������: ");
		 goal = sc.nextInt();
		 
		 while(now > goal) {
			 week++;
			 System.out.print(week+"���� ���� ������ : ");
			 num = sc.nextInt();
			 now -= week;
		 }
		    System.out.println(now+"kg �޼�!! �����մϴ�!");
		 
		 
		 
		 
		 
		 
		 
	}

}
