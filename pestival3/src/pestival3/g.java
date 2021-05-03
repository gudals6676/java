package pestival3;

public class g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String score = "A,A,B,C,D,A,C,D,D,D,F";
        String[] cut = score.split(",");
        int A =0, B = 0, C = 0, D = 0, F = 0;
        
        for (int i = 0; i < cut.length; i++) {
			if(cut[i].equals("A")) {
				A++;
			}else if(cut[i].equals("B")) {
				B++;
			}else if(cut[i].equals("C")) {
				C++;
			}else if(cut[i].equals("D")) {
				D++;
			}else {
				F++;
			}
		}
        System.out.println("A : "+ A+"명");
        System.out.println("B : "+ B+"명");
        System.out.println("C : "+ C+"명");
        System.out.println("D : "+ D+"명");
        System.out.println("F : "+ F+"명");
	}

}
