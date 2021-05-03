
public class AddressMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address m = new Address();
		//속성값 지정
		m.name = "박형민";
		m.address = "양림동";
		m.phonenumber = "010-1234-5678";
		
		m.showAddr();
		
		Address m2 = new Address();
		m2.name = "헤으응";
		m2.address = "광주";
		m2.phonenumber = "123-4567-8970";
		m2.showAddr();
		
		Address m3 = m2;
		m3.name = "호으응";
		System.out.println(m2.name);
	}

}
