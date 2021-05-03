package 추상Employee;

import java.util.ArrayList;

public class EmployeeMain {

	public static void main(String[] args) {
	    //추상클래스는 객체 생성 불가능 -> 상속을 통해서 서브클래스로 객체 생성해야함
		//new Employee(); 
			
		//regular, parttime, temp객체생성
		RegularEmployee r = new RegularEmployee("aaa", "헤으응", 3000, 200);
		PartTimeEmployee p = new PartTimeEmployee("bbb", "호으응", 100000, 20);
		TempEmployee t = new TempEmployee("ccc", "응애",2000);
		
		Employee []arr = new Employee[3];
		arr[0] = r;   //업캐스팅(자동 형변환)
		arr[1] = p;
		arr[2] = t;
		
		for (Employee e : arr) {
			e.print();
		}
		//다운캐스팅
//		RegularEmployee r2 = (RegularEmployee)arr[0];
//		r2.print();
//		PartTimeEmployee p2 = (PartTimeEmployee)arr[1];
//		p2.print();
	}

}
