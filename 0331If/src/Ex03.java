import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		   System.out.print("������ �Է� : ");
		   String opr =sc.next();
	       System.out.print("ù��° ���� : ");
		   int num = sc.nextInt();
		   System.out.print("�ι�° ���� : ");
	       int num1 = sc.nextInt();		
			
		    if (opr.equals  ("+")) {
		    System.out.println(num+"�� "+ num1+"�� ����"+(num+num1)+"�Դϴ�");
		   }else if (opr.equals ("-")) {	   
			System.out.println(num+"�� "+ num1+"�� ������"+(num-num1)+"�Դϴ�");
		   }else if (opr.equals ("*")) {	
			System.out.println(num+"�� "+ num1+"�� ������"+(num*num1)+"�Դϴ�");
		   }else {
			System.out.println(num+"�� "+ num1+"�� �������"+(num/num1)+"�Դϴ�");
			
		    switch (opr) {
			case "+":
				System.out.println(num+num1);	
				break;
			case "-":
				System.out.println(num-num1);
				break;
			case "*":
				System.out.println(num*num1);
				break;
			case "/":
				System.out.println(num/num1);
				break;

			default:
				break;
			}
/*		switch(num) {
		
		case 1:
			System.out.println("�Է��� ���� ���� 1 �Դϴ�.");
			break;
		case 2 :
			System.out.println("�Է��� ���� ���� 2 �Դϴ�.");
			break;
		
	    default :
	    	System.out.println("�Է��� ���� 1, 2�� �ƴմϴ�.");
	    	break;
		//if���� switch�� ������
		//if�� : ������ ���������� �ϳ��ϳ� ��(����1~100)
        //switch : ������ ���� �ش� ���ǿ� ���๮ ����
*/	    	
	    	
	}

 }
}