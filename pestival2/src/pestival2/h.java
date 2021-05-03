package pestival2;

public class h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[]point = {92,32,52,9,81,2,68};
     int min1 = point[0];
     int min2 = point[0];
     int m1 = 0;
     int m2 = 0;
     
     for (int i = 0; i < point.length; i++) {
		for (int j = 0; j < point.length; j++) {
			if(i != j) {
				min1 = point[i]-point[j];
			}
			if(Math.abs(min2)>Math.abs(min1)) {
				min2 = min1;
				m1 = i;
				m2 = j;
				
			}
		}
	}
    System.out.printf("result = [%d, %d]",m1,m2);		 
	}

}
