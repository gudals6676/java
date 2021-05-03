package pestival3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class abcd {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println(reverseStr("ZAbcdVefEg"));
	}

	private static char reverseStr(String s) {
		String[] list = s.split("");
		Arrays.sort(list);
	     for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]);
		}
		return 0;
	}

}
