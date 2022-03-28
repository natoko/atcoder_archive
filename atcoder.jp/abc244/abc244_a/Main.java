import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N;
	public static String S;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		S = scan.next();
		scan.close();

		char[] N_char = S.toCharArray();

		System.out.println(N_char[N-1]);

	}

}
