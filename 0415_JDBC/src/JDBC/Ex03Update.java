package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;



public class Ex03Update implements Rule_inter{

	public void execute() {
		// 사용자에게 id pw 를 입력반은 후
		// 해당 id의 pw를 입력받은 pw 로 변경하시오
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
			System.out.println("수정성공");
		} else {
			System.out.println("수정실패");
		}
	}
}