import java.util.Scanner;
import java.util.*;
public class Main {
	public static String S;
	public static boolean upper;
	public static boolean lower;
	public static boolean dup;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		S = scan.next();
		scan.close();

		upper = false;
		lower = false;
		dup = false;

		Stringis stis = new Stringis();
		for (int i = 0;i < S.length();i++ ) {
			String ss = S.substring(i,i+1);
			if (stis.isUpper(ss)) {
				upper = true;
			}
			if (stis.isLower(ss)) {
				lower = true;
			}
			if (i+1 == S.length()) {
				continue;
			}
			int dupS = S.indexOf(ss,i+1);
			if (dupS != -1) {
				if ((stis.isUpper(ss)) && (stis.isUpper(S.substring(dupS,dupS+1))) ||
				    (stis.isLower(ss)) && (stis.isLower(S.substring(dupS,dupS+1)))) {
					dup = true;
				}
			}
		}

		if ((upper == true)&&(lower == true)&&(dup == false)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static class Stringis {
		public boolean isLower(String str) {
			return str.equals(str.toLowerCase());
		}

		public boolean isUpper(String str) {
			return str.equals(str.toUpperCase());
		}
	}


}
