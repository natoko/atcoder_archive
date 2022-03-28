import java.util.Scanner;
import java.util.*;
public class Main {
	public static int A;
	public static int B;
	public static int C;
	public static int D;
	public static String ans;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		A = Integer.parseInt(scan.next());
		B = Integer.parseInt(scan.next());
		C = Integer.parseInt(scan.next());
		D = Integer.parseInt(scan.next());
		scan.close();

		if (A < C) {
			ans = "Takahashi";
		} else if((A == C) && (B <= D)) {
			ans = "Takahashi";
		} else {
			ans = "Aoki";
		}

		System.out.println(ans);

	}

}
