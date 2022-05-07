import java.util.Scanner;
import java.util.*;
public class Main {
	public static int[] Takahashi;
	public static int[] Aoki;
	public static int X;

	public static void main(String[] args) {
		Takahashi = new int[3];
		Aoki = new int[3];

		Scanner scan = new Scanner(System.in);
		for (int t = 0;t <  3;t++ ) {
			Takahashi[t] = Integer.parseInt(scan.next());
		}
		for (int a = 0;a <  3;a++ ) {
			Aoki[a] = Integer.parseInt(scan.next());
		}
		X = Integer.parseInt(scan.next());
		scan.close();

		int T = 0;
		int A = 0;

		T = jogging(Takahashi[0],Takahashi[1],Takahashi[2]);
		A = jogging(Aoki[0],Aoki[1],Aoki[2]);

		if (T > A) {
			System.out.println("Takahashi");
		} else if (T < A) {
			System.out.println("Aoki");
		} else {
			System.out.println("Draw");
		}

	}

	static Integer jogging(int a,int b,int c){
		int d = 0;
		int p = X/(a+c);
		int q = X%(a+c);
		if (q > a) {
			d = b*(a*p + a);
		} else {
			d = b*(a*p + q);
		}
		return d;
	}



}
