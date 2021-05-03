package pestival1;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] point = {92,32,52,9,81,2,68};
       int min = point[0];
       int min2 = point[0];
       int m1 = 0;
       int m2 = 0;
       for (int i = 0; i < point.length; i++) {
		for (int j = 0; j < point.length; j++) {
			if(i != j) {
				min = point[i]-point[j];
			}
			if(Math.abs(min2)>Math.abs(min)) {
				min2 = min;
				m1 = i;
				m2 = j;
			}
		}
	}
       System.out.printf("°á°ú : [%d, %d]",m1,m2);
	}

}
