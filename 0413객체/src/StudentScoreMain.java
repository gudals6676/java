import java.util.Scanner;

public class StudentScoreMain {

	public static void main(String[] args) {
		StudentScore[] ssArr = new StudentScore[3];
		Scanner sc = new Scanner(System.in);
         
       for (int i = 0; i < ssArr.length; i++) {
		System.out.print(i+1+"번째 학생의 이름을 입력하세요. >> ");
		String name = sc.next(); 
		System.out.print(i+1+"번째 학생의 Java점수를 입력하세요. >> ");
		int javascore = sc.nextInt();
		System.out.print(i+1+"번째 학생의 Web점수를 입력하세요. >>");
		int Webscore = sc.nextInt();
		System.out.print(i+1+"번째 학생의 Android점수를 입력하세요. >>");
		int Androidscore = sc.nextInt();
		ssArr[i] = new StudentScore(name,javascore,Webscore,Androidscore);
	}
       System.out.println();
       for (int i = 0; i < ssArr.length; i++) {
    	   int sum = ssArr[i].getScoreJava()+ssArr[i].getScoreWeb()+ssArr[i].getScoreAndroid();
    	   System.out.printf("%s님의 총점은 %d점, 평균은 %d점 입니다.\n",ssArr[i].getName(),sum,sum/3);
	}
        
       
	    
	}

}
