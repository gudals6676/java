
public class AddressMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address m = new Address();
		//�Ӽ��� ����
		m.name = "������";
		m.address = "�縲��";
		m.phonenumber = "010-1234-5678";
		
		m.showAddr();
		
		Address m2 = new Address();
		m2.name = "������";
		m2.address = "����";
		m2.phonenumber = "123-4567-8970";
		m2.showAddr();
		
		Address m3 = m2;
		m3.name = "ȣ����";
		System.out.println(m2.name);
	}

}
