import java.util.Scanner;

public class Ex01 { //���� �۾��ϰ� �ִ� ������ Java����
       //Java���Ͽ��� ������ �߰�ȣ��{} ����
	public static void main(String[] args) {
		    //Java������ ���۵��� �� ���� ���� ����Ǵ� ����
		
            //��°� �Է�
		    //�������
             System.out.print("hello world~!");
             System.out.println("hello world~!");
             System.out.println("hello world~!");
            //���� ���
             System.out.println(1+1);
             System.out.println(1-1);
             System.out.println(1*1);
             System.out.println(1/1);
            //����+����=���� ��� 
             System.out.println("1+1="+(1+1));
             System.out.println("1-1="+(1-1));
             System.out.println("1*1="+(1*1));
             System.out.println("1/1="+(1/1));
             
            //�Է� 
             Scanner sc = new Scanner(System.in);
             System.out.print("���� ��1 �Է� : ");
             int num1 = sc.nextInt();
            //� ������Ÿ��(����, ����, �Ǽ� ��)�� �������� �̸� ���س��� ��
             System.out.print("���� ��2 �Է� : ");
             int num2 = sc.nextInt();
             System.out.println("����ڰ� �Է��� ���� ��: " + num1);
             System.out.println("����ڰ� �Է��� ���� ��: " + num2);
             System.out.println("���� ��1 + ���� ��2 =  "+ (num1+num2));
             
             
	}

}

//1. Java�� ��ҹ��ڸ� ��Ȯ�ϰ� �����������
//2. ���ڸ� �Է��� �� ''�� �ȵǰ� ""�� �Է�
//3. �ϳ��� �ڵ� ������ ���� �� �� �ڿ�; (�����ݷ�) �ٿ���� ��
//4. Java���� ctr1+space�� �ڵ� �ϼ�
//5. ���ڿ� ���ڸ� ȥ���ؼ� ����� �� + ��ȣ�� ���
//6. ���ڸ� ���ڷ� �ٲ� �� ���ڿ� ȥ���ؼ� ���
// python : Runtime Eroor��Ÿ�ӿ���(������ �ؾ����� ������ �� �� ����)
// java : Statement Error(�ڵ带 �Է��� �� �ٷ� ������ ���)
// Java������ �������
//.Java(�����ڰ� �����ϴ� ����) -> .class(��谡 ���� �� �ִ� ����)