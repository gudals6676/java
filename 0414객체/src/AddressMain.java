import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Address> min = new ArrayList<Address>();

		while (true) {
			System.out.print("1]�߰� 2]��ü��ȸ 3]���� 4]�˻� 5]���� >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.print("�̸�: ");
				String name = sc.next();
				System.out.print("����: ");
				int age = sc.nextInt();
				System.out.print("��ȭ��ȣ : ");
				String phone = sc.next();

				min.add(new Address(name, age, phone));
			} else if (menu == 2) {
				if (min.size() == 0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
				} else {
					for (int i = 0; i < min.size(); i++) {
						System.out.println(i + 1 + ". " + min.get(i).getName() + "(" + min.get(i).getAge() + "��) : "
								+ min.get(i).getPhonenum());
					}
				}
			} else if (menu == 3) {
				if (min.size() == 0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
				}else {
					System.out.print("������ ��ȣ �Է�: ");
				  int num = sc.nextInt();
				  min.remove(num-1);
				
					
				}
				
			} else if (menu == 4) {
				System.out.print("�˻��� �̸� �Է�: ");
				String Sname = sc.next();
				for (int i = 0; i < min.size(); i++) {
					if (Sname.equals(min.get(i).getName())) {
						System.out.println(i + 1 + ". " + min.get(i).getName() + "(" + min.get(i).getAge() + "��) : "
								+ min.get(i).getPhonenum());
						
					} else {
						System.out.println("�˻��� �̸��� ������ �����ϴ�.");
						break;
					}
				}

			}else {
				System.out.println("���α׷��� ����");
				break;
			}
		}

	}

}
