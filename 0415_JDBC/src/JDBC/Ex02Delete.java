package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex02Delete implements Rule_inter {

	public void execute() {
		// 사용자에게 id값을 입력받아 해당 id값을 테이블에서 삭제하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("ID>>");
		String id = sc.next();

		DAO dao = new DAO();
		int cnt = dao.DAO_delete(id);
		if (cnt > 0) {
			System.out.println("삭제성공");
		} else {
			System.out.println("삭제실패");
		}
	}

}
