import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           System.out.print("단 입력: ");
           int dan = sc.nextInt();
           System.out.print("범위 입력: ");
           int bum = sc.nextInt();
           
           for (int i = 1; i <= bum; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
			}
		}
	}


