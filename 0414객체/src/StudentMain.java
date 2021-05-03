import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> min = new ArrayList<Student>();
		System.out.println("========================학점관리=================");
		while(true) {
			System.out.print("1]성적입력 2]전체조회 3]학생검색 4]프로그램종료");
			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.print("이름: ");
				String name = sc.next();
				System.out.print("학번: ");
				String Snum = sc.next();
				System.out.print("Java점수: ");
				int Jnum = sc.nextInt();
				System.out.print("Web점수: ");
				int Wnum = sc.nextInt();
				System.out.print("Android점수: ");
				int Anum = sc.nextInt();
				
				min.add(new Student(name, Snum, Jnum, Wnum, Anum));
			}else if(menu == 2) {
				System.out.println("=====================전체조회============");
				System.out.println("이름\t학번\tJava\tWeb\tAndroid");
				if(min.size() != 0) {
				for (int i = 0; i < min.size(); i++) {
					System.out.println(min.get(i).getName()+"\t"+min.get(i).getNumber()+"\t"+
				min.get(i).getScoreJava()+"\t"+min.get(i).getScoreWeb()+"\t"+min.get(i).getScoreAndroid());
				}
				}else {
					System.out.println("조회 할 데이터가 없습니다.");
					System.out.println("====================================");
				}
			}else if(menu == 3) {
				
			}else {
				System.out.println("학점 관리 프로그램을 종료");
				break;
			}
		}

	}

}
