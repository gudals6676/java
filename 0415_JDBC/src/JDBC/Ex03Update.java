package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;



public class Ex03Update implements Rule_inter{

	public void execute() {
		// ����ڿ��� id pw �� �Է¹��� ��
		// �ش� id�� pw�� �Է¹��� pw �� �����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("ID>>");
		String id = sc.next();
		System.out.print("1.PW 2.TEL");
		System.out.print("CHOICE>>");
		String choice = sc.next();
		System.out.print("DATA>>");
		String data = sc.next();
		

        DAO dao = new DAO();
        int cnt = dao.DAO_update(id,choice,data);
		if (cnt > 0) {
			System.out.println("��������");
		} else {
			System.out.println("��������");
		}
	}
}