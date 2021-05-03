package pestival3;

public class f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(getMiddle("test"));
	}
   public static String getMiddle(String s) {
	  String result;
	  if(s.length()%2 != 0) {
		  result = s.substring(s.length()/2,s.length()/2+1);
	  }else {
		  result = s.substring(s.length()/2-1, s.length()/2+1);
	  }
	  return result;
   }
}
