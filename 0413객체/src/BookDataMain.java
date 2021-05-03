import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BookDataMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookData[] a = new BookData[5];
		a[0] = new BookData("Java",21000,"홍길동");
		a[1] = new BookData("C++",29000,"박문수");
		a[2] = new BookData("Database", 31000, "김장독");
		a[3] = new BookData("Android", 18000, "이순신");
		a[4] = new BookData("Web",26000, "김철수");
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		System.out.println("구매 가능한 책 목록");
		for (int i = 0; i < a.length; i++) {
			if(money > a[i].getPrice()) {
				System.out.println("["+a[i].getTitle()+","+a[i].getWriter()+","+a[i].getPrice()+"원 ]");
			}
		}
		
	}

}
