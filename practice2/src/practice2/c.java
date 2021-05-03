package practice2;

public class c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
       for (int i = 1; i < 101; i++) {
		if (i % 2 == 0) {
			System.out.print("-"+i+" ");
			j -= i;
		}else {
			System.out.print(i+" ");
			j += i;
		}
	}
       System.out.println();
       System.out.println("°á°ú : "+j);
	}

}
