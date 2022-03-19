import java.util.Scanner;
import java.util.*;
public class Main {
	public static int n;
	public static String S;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = Integer.parseInt(scan.next());
		S = scan.next();
		scan.close();

		String[] player = {"Takahashi","Aoki"};
		int lose = 0;

		for (int i=0;i < n ;i++ ) {
			char card = S.charAt(i);
			if (card == '1') {
				lose = i%2;
				break;
			}
		}

		System.out.println(player[lose]);
	}

}
