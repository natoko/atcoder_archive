import java.util.Scanner;
import java.util.*;
public class Main {
	public static String S;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		S = scan.next();
		scan.close();

		String ans = "9";

		for (int i = 0;i < S.length() ;i++ ) {
			if(S.contains(String.valueOf(i))) {
				continue;
			} else {
				ans = String.valueOf(i);
				break;
			}
		}

		System.out.println(ans);

	}

}
