import java.util.Random;
import java.util.Scanner;

public class Ex03plusgame {

	public static void main(String[] args) {
		// ���� ��ü ����
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        
        // �� ���� ��ģ ���� ������ ������ ����.
       
        // ���� �Է��� ���� �����͸� ������ ���� ����.
       
        // while������ ���ǽ����� �����(y/n) ���� ����.
        String opr ;
        int num1 = 0, num2 = 0, num3 = 0;
        // �ݺ����� ���� ���� ������ �� 2���� �� �� �Է½��� ���´�.
        num1 = r.nextInt( 10 )+1;
        num2 = r.nextInt( 10 )+1;        
        System.out.println( "==Plus Game==" );
        
        do {                    
           // result���� ���߱� ���� answer������ ������ ���� �Է�
          
          
           System.out.print( num1 + "+" + num2 + "=");
           num3 = sc.nextInt();
           // ���� ������ �´ٸ�
           if( num3==(num1+num2) ) {
              // Success��� �� �������ڸ� �ٲٱ�
              System.out.println( "Success" );
              num1 = r.nextInt( 10 )+1;
              num2 = r.nextInt( 10 )+1;
              // �׷��� ������ Fail ���
           } else {
              System.out.println( "Fail" );
           }
           
           // While���� ��� �ݺ��Ұ��� �����ϱ�.
           System.out.print( "��� �Ͻðڽ��ϱ�(y/n) >> " );
           opr = sc.next();
           
           // ��ҹ��� ���� ���� y�� �Է¹����� while�� �����
        } while (opr.equals("y") );
        
        System.out.println( "Plus Game ����" );


	}

}
