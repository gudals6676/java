package �߻�Employee;

import java.util.ArrayList;

public class EmployeeMain {

	public static void main(String[] args) {
	    //�߻�Ŭ������ ��ü ���� �Ұ��� -> ����� ���ؼ� ����Ŭ������ ��ü �����ؾ���
		//new Employee(); 
			
		//regular, parttime, temp��ü����
		RegularEmployee r = new RegularEmployee("aaa", "������", 3000, 200);
		PartTimeEmployee p = new PartTimeEmployee("bbb", "ȣ����", 100000, 20);
		TempEmployee t = new TempEmployee("ccc", "����",2000);
		
		Employee []arr = new Employee[3];
		arr[0] = r;   //��ĳ����(�ڵ� ����ȯ)
		arr[1] = p;
		arr[2] = t;
		
		for (Employee e : arr) {
			e.print();
		}
		//�ٿ�ĳ����
//		RegularEmployee r2 = (RegularEmployee)arr[0];
//		r2.print();
//		PartTimeEmployee p2 = (PartTimeEmployee)arr[1];
//		p2.print();
	}

}
