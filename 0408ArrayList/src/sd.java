import java.util.ArrayList;
import java.util.Scanner;

public class sd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 2.
		ArrayList<String> musiclist = new ArrayList<String>();

		// 1. �뷡 �߰� ���� ��ȸ ���� �޴��� ���̰� ���Ḧ ������ ���ᰡ �Ǳ�.
		// 2. 1���� �������� �� ���� �������� ������
		// 3. �뷡�� ��� ��ġ�� �߰� ��ų�� �����ϱ�
		// 4.
		musiclist.add("NewFace!");
		musiclist.add("�Ա���");
		musiclist.add("SIGNAL");

		while (true) {
			System.out.println("1]�뷡�߰� 2]�뷡���� 3]�뷡��ȸ 4]����>> ");
			int menu = sc.nextInt();
			if (menu == 4) {
				System.out.println("����Ǿ����ϴ�.");
				break;

				// 2.
			} else if (menu == 1) {
				showmusicinfo(musiclist);
//						System.out.println("=====����������=====");
//				if (musiclist.size() == 0) {
//					System.out.println("�������� �����ϴ�.");
//				} else {
//					for (int i = 0; i < musiclist.size(); i++) {
//						System.out.println(musiclist.get(i));
//					}
//				} 
//				System.out.println("==================");

				// 3.
				System.out.println("1]������ ��ġ�� �߰� 2]���ϴ� ��ġ�� �߰�>> ");
				int loc = sc.nextInt();
				System.out.println("�߰��� �뷡 �Է�>>");
				String temp = sc.next();
				if (loc == 2) {
					System.out.println("�߰��� ��ġ �Է�>>");
					int in = sc.nextInt();
					musiclist.add(in - 1, temp); // �ε����� �����ִ� ����ϴ°� ����� �ٽ� �����غ���
				} else {
					musiclist.add(temp);
				}
				System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");

			} else if (menu == 2) {
				showmusicinfo(musiclist);
				
				
				System.out.print("1]���û��� 2]��ü����>>");
				
				int removemenu = sc.nextInt();

				if (removemenu == 1) {
					System.out.print("������ �뷡 ����>> ");
					int removeSong = sc.nextInt();
					musiclist.remove(removeSong);// �̷��� ������ �뷡�� ����
					System.out.println("�뷡�� �����Ǿ����ϴ�.");
				} else {
					musiclist.clear();
					System.out.println("��ü ����Ʈ�� �����Ǿ����ϴ�.");
				}

			}else if(menu == 3) {
				showmusicinfo(musiclist);
			}
		}
	}

	private static void showmusicinfo(ArrayList<String> musiclist) {
		System.out.println("=====����������=====");
		if (musiclist.size() == 0) {
			System.out.println("�������� �����ϴ�.");
		} else {
			for (int i = 0; i < musiclist.size(); i++) {
				System.out.println(musiclist.get(i));
			}
		} 
		System.out.println("==================");
	}

}
