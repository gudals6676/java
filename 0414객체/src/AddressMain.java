import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Address> min = new ArrayList<Address>();

		while (true) {
			System.out.print("1]추가 2]전체조회 3]삭제 4]검색 5]종료 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.print("이름: ");
				String name = sc.next();
				System.out.print("나이: ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String phone = sc.next();

				min.add(new Address(name, age, phone));
			} else if (menu == 2) {
				if (min.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else {
					for (int i = 0; i < min.size(); i++) {
						System.out.println(i + 1 + ". " + min.get(i).getName() + "(" + min.get(i).getAge() + "세) : "
								+ min.get(i).getPhonenum());
					}
				}
			} else if (menu == 3) {
				if (min.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				}else {
					System.out.print("삭제할 번호 입력: ");
				  int num = sc.nextInt();
				  min.remove(num-1);
				
					
				}
				
			} else if (menu == 4) {
				System.out.print("검색할 이름 입력: ");
				String Sname = sc.next();
				for (int i = 0; i < min.size(); i++) {
					if (Sname.equals(min.get(i).getName())) {
						System.out.println(i + 1 + ". " + min.get(i).getName() + "(" + min.get(i).getAge() + "세) : "
								+ min.get(i).getPhonenum());
						
					} else {
						System.out.println("검색한 이름의 정보가 없습니다.");
						break;
					}
				}

			}else {
				System.out.println("프로그램이 종료");
				break;
			}
		}

	}

}
