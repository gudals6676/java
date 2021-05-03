package pestival3;

public class m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(reverseStr("ZabcdVefEg"));
	}

	public static String reverseStr(String word) {
		  int min = 0;
	      char temp = 0;
	      char[] arr = new char[word.length()];
	      
	      for(int i = 0; i < arr.length-1; i+=1) {
	         arr[i] = word.charAt(i);
	      }
	      
	      for (int i = 0; i < arr.length-1; i += 1) {
	         int minIndex = i;

	         for (int j = i + 1; j < arr.length; j += 1) {
	            if (arr[minIndex] > arr[j]) {
	               minIndex = j;
	            }
	         }
	         temp = arr[i];
	         arr[i] = arr[minIndex];
	         arr[minIndex] = temp;
	      }

	      // 1. charactertostring
	      String str2 = "";
	      for (int i = 0; i < arr.length; i++) {
	         str2 += Character.toString(arr[i]);
	      }
	      // valueof
	      String str3 = "";
	      str3 = String.valueOf(arr);

	      return str2;
	   }
}
