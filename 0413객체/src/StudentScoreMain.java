import java.util.Scanner;

public class StudentScoreMain {

	public static void main(String[] args) {
		StudentScore[] ssArr = new StudentScore[3];
		Scanner sc = new Scanner(System.in);
         
       for (int i = 0; i < ssArr.length; i++) {
		System.out.print(i+1+"��° �л��� �̸��� �Է��ϼ���. >> ");
		String name = sc.next(); 
		System.out.print(i+1+"��° �л��� Java������ �Է��ϼ���. >> ");
		int javascore = sc.nextInt();
		System.out.print(i+1+"��° �л��� Web������ �Է��ϼ���. >>");
		int Webscore = sc.nextInt();
		System.out.print(i+1+"��° �л��� Android������ �Է��ϼ���. >>");
		int Androidscore = sc.nextInt();
		ssArr[i] = new StudentScore(name,javascore,Webscore,Androidscore);
	}
       System.out.println();
       for (int i = 0; i < ssArr.length; i++) {
    	   int sum = ssArr[i].getScoreJava()+ssArr[i].getScoreWeb()+ssArr[i].getScoreAndroid();
    	   System.out.printf("%s���� ������ %d��, ����� %d�� �Դϴ�.\n",ssArr[i].getName(),sum,sum/3);
	}
        
       
	    
	}

}
