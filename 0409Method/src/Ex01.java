import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String data = "������ �� ���̳���?";
		   //indexOf("���ڿ�") -> �Ű������� ���� ������ ��ġ ����
//          System.out.println("==indexOf==");
//          System.out.println(data.indexOf("��"));
//          System.out.println(data.indexOf("��", 5)); // ã���� �ϴ� ��ġ����
//          
//          // ���ڿ�.contains("����") -> �Ű������� ���� ���ڿ��� ���ԵǾ��ִ��� �Ǻ�
//          System.out.println("==contains==");
//          System.out.println(data.contains("?"));
//          Scanner sc = new Scanner(System.in);
//          String phone = "010-2407-1065";
//          
//          System.out.print("�˻��� ���� �Է�: ");
//          String num = sc.next();
//          if(phone.contains(num)) {
//        	  System.out.println(num+"�� ���ڿ��� ���ԵǾ��ֽ��ϴ�.");
//          }else {
//        	  System.out.println(num+"�� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
//          }
//			
		// ���ڿ� . substring(start�ε���, end�ε���)->�Ű������� ���� ��ġ���� ���ڿ��� �߶� ����
		System.out.println(data.substring(data.length()/2,data.length()-1));
		System.out.println(data.substring(0));
		//���ڿ�.charAt(�ε���)-> ���ڿ����� �Ű������� ���� �ε�����° ���ڸ� ��ȯ
		System.out.println("==charAt==");
		char s = data.charAt(0); // ĳ���� Ÿ���� ���� �ϳ���
		System.out.println(s);
		System.out.println(data.charAt(data.length()-1));
		//���ڿ�.split(���ڿ�) -> �Ű������� ���� ���ڿ��� �������� �߶� �迭�� ��ȯ
		String phone2 = "010-2407-1465";
		String[] cut = phone2.split("");
		System.out.println(Arrays.toString(cut));
	}

}
