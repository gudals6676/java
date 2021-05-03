
public class Ex06 {
public static void main(String[] args) {
	int num = abs_Mathod(5);
	System.out.println(num);
	System.out.println(Math.abs(-15));
}
public static int abs_Mathod(int n) {
	int result = n;
	if(n < 0) {
		result = n * -1;
	}
	return result;
}
}
