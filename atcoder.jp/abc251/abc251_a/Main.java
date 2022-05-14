import java.util.Scanner;
import java.util.*;
public class Main {
	public static String S;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		S = scan.next();
		scan.close();

		String ss = S;

		while(S.length() <6) {
			S = S+ss;
		}

		System.out.println(S);

	}


}
