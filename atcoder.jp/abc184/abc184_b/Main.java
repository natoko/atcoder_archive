import java.util.Scanner;
public class Main {
	public static int N;
	public static int X;
	public static String s;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		X = Integer.parseInt(scan.next());
		s = scan.next();

		char[] ss = s.toCharArray();

		for (int i = 0;i < N ;i++ ) {
			if (ss[i] == 'o') {
				X+=1;
			} else if (X != 0) {
				X-=1;
			}
		}

		System.out.println(X);
	}

}
