package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;



public class Ex04Select implements Rule_inter{

	public void execute() {
		// ���̺� �ִ� ��ü �����͸� ���� �ܼ�â�� ����غ��ÿ�.
		

		

		DAO dao = new DAO();
		ArrayList<VO> arr = dao.DAO_Select();
		for (int i = 0; i < arr.size(); i++) {
			System.out.println("ID : "+ arr.get(i).getId());
			System.out.println("PW : "+ arr.get(i).getPw());
			System.out.println("Tel : "+ arr.get(i).getTel());
			System.out.println("Email : "+ arr.get(i).getEmail());
			System.out.println("Address : "+ arr.get(i).getAddr());
			System.out.println("----------------");
		}
		
	}

}
