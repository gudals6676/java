import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> min = new ArrayList<Student>();
		System.out.println("========================��������=================");
		while(true) {
			System.out.print("1]�����Է� 2]��ü��ȸ 3]�л��˻� 4]���α׷�����");
			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.print("�̸�: ");
				String name = sc.next();
				System.out.print("�й�: ");
				String Snum = sc.next();
				System.out.print("Java����: ");
				int Jnum = sc.nextInt();
				System.out.print("Web����: ");
				int Wnum = sc.nextInt();
				System.out.print("Android����: ");
				int Anum = sc.nextInt();
				
				min.add(new Student(name, Snum, Jnum, Wnum, Anum));
			}else if(menu == 2) {
				System.out.println("=====================��ü��ȸ============");
				System.out.println("�̸�\t�й�\tJava\tWeb\tAndroid");
				if(min.size() != 0) {
				for (int i = 0; i < min.size(); i++) {
					System.out.println(min.get(i).getName()+"\t"+min.get(i).getNumber()+"\t"+
				min.get(i).getScoreJava()+"\t"+min.get(i).getScoreWeb()+"\t"+min.get(i).getScoreAndroid());
				}
				}else {
					System.out.println("��ȸ �� �����Ͱ� �����ϴ�.");
					System.out.println("====================================");
				}
			}else if(menu == 3) {
				
			}else {
				System.out.println("���� ���� ���α׷��� ����");
				break;
			}
		}

	}

}
