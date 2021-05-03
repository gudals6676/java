package JDBC;
import java.util.Scanner;

public class Ex00Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===회원관리시스템===");
		System.out.println("1.회원가입 2.회원삭제 3.회원수정 4.회원전체검색 5.회원검색");
		
        boolean sw = true;//스위칭변수
        Rule_inter inter = null;
		while (sw) {
			
			int input = sc.nextInt();
			
			switch (input) {
			case 1:
				System.out.println("회원가입기능실행");
				inter = new Ex01Insert();
				inter.execute();
				break;
			case 2:
				System.out.println("회원삭제기능실행");
				inter = new Ex02Delete();
				inter.execute();
				break;
			case 3:
				System.out.println("회원수정기능실행");
				inter = new Ex03Update();
				inter.execute();
				break;
			case 4:
				System.out.println("회원전체검색기능실행");
				inter = new Ex04Select();
				inter.execute();
				break;
			case 5:
				System.out.println("회원검색기능실행");
				inter = new Ex05OneSelect();
				inter.execute();
				break;
			case 6:
				System.out.println("프로그램종료");
				sw = false;//스위칭변수
				break;
			}
		}
		// 기능이 계속 반복되게 만들어야함

	}

}
