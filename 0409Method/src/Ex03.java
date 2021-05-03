
public class Ex03 {

	public static void main(String[] args) {
		// public int addNumber(int num1, int num2){
		   //int result = num1 + num2;
		   //return result;
      int result = addNumber(10, 15);
      System.out.println(result);
   }
	//메인method가 포함된 class안에서 새로운 method를 만들고자 할때는
	//staric 키워드를 붙여준다
   public static int addNumber(int n1, int n2) {
	   int result = n1 +n2;
	   return result;
   }
	
}
