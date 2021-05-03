import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Student ��ü ����
		Student s = new Student("�賲��", 23);
		// Teacher ��ü ����
		Teacher t = new Teacher("�����", 25, 5000);

		// �迭���� (���� 2)
		Person[] arr = new Person[2];
		//Student ��ü�� Teacher��ü �ڵ�����ȯ ->PersonŸ���� ��
		arr[0] = s;
		arr[1] = t;

		for (Person p : arr) {
			System.out.println("�̸�: " + p.getName());
			System.out.println("����: " + p.getJob());
			System.out.println("����: " + p.getAge());
		}
		// Student study() ȣ��
		Student s2 = (Student) arr[0];// Person���� ��ĳ���õ� ��Ʃ��Ʈ�� �ٿ�ĳ����(��������ȯ)
		s2.study();
		Teacher t2 = (Teacher) arr[1];
		System.out.println();
		System.out.println(t2.getPay());		
		t2.teach();
	}

}
