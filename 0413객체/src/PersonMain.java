
public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("������");
		p1.setAge(20);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person p2 = new Person("�ּ���", 21);
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
		Person p3 = new Person("������", 19);
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		
		Person[] personArr = new Person[3]; //person �� ����ִ°� �迭�� �ű��.
		personArr[0] = new Person("������",20);  // = p1; ����
		personArr[1] = new Person("�ּ���", 21); // = p2; ����
		personArr[2] = new Person("������", 19);
		System.out.println(personArr[0].getName());
		for (int i = 0; i < personArr.length; i++) {
			System.out.println(personArr[i].getName());
		}
//		p1.name = "������";
//		p1.age = 20;
//
//		Person p2 = new Person("�ּ���");
//      
		
		
	}
}
