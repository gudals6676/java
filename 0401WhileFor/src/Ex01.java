import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		do {
//			���๮��!
//		} while(���ǽ�);
//		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��������� :");
        int now = sc.nextInt();
        System.out.print("��ǥ������ :");
		int goal = sc.nextInt();
		int i =1;
		
		do {

		System.out.print(i+"���� ���� ������ : ");
		int num = sc.nextInt();
        now-=num;  // now = now-num
		i ++;  //i+=1 
		
		}while (now>goal);
		System.out.println(now+"kg �޼�!! �����մϴ�!");
		
		
		
		
		
		
		
		
		
		
		
	}

}
