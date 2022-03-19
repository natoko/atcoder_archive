import java.util.Scanner;
public class Main {
	public static String S;
	public static String ans;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		S = scan.next();
		scan.close();

		int sl = S.length();
		// char[] change = new char[sl];
		StringBuilder change = new StringBuilder();
		for (int i = 0;i < sl ;i++ ) {
			char ss = S.charAt(i);
			if (ss == '6') {
				ss = '9';
			} else if (ss == '9') {
				ss = '6';
			}
			change.append(ss);
		}
		ans = String.valueOf(change.reverse());

		System.out.println(ans);
	}

}
