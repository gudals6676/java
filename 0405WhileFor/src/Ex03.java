import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           System.out.print("�� �Է�: ");
           int dan = sc.nextInt();
           System.out.print("���� �Է�: ");
           int bum = sc.nextInt();
           
           for (int i = 1; i <= bum; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
			}
		}
	}


