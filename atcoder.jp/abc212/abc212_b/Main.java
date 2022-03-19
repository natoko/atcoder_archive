import java.util.Scanner;
import java.util.*;
public class Main {
	public static String XXXX;
	public static char[] X = new char[4];
	public static int ans = 1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		XXXX = scan.next();
		scan.close();

		X = XXXX.toCharArray();

		if ((X[0] == X[1]) &&(X[1] == X[2]) &&(X[2] == X[3])) {
			ans = 0;
		}

		int cnt = 0;

		if (ans != 0) {
			for (int x = 0;x < 3 ;x++ ) {
				int x1 = X[x] - '0';
				int x2 = X[x + 1] - '0';
				if ((x1 < 9) && (x2 == x1 + 1)) {
					cnt++;
				} else if((x1 == 9) && (x2 == 0)) {
					cnt++;
				}
			}
		}
		if (cnt == 3) {
			ans = 0;
		}

		System.out.println(ans == 0?"Weak":"Strong");
	}

}
