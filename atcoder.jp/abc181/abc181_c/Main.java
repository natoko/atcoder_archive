import java.util.Scanner;
public class Main {
	public static int N;
	public static int[] Y;
	public static int[] X;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N =  Integer.parseInt(scan.next());
		X = new int[N];
		Y = new int[N];
		String ans = "No";
		for (int i = 0;i < N ;i++ ) {
			X[i] =  Integer.parseInt(scan.next());
			Y[i] =  Integer.parseInt(scan.next());
		}

		for (int a = 0;a < N ;a++ ) {
			for (int b = 0;b < N ;b++ ) {
				for (int c = 0;c < N ;c++ ) {
					if ((b == a)||(c == b)||(c == a)) continue;
					int abX = X[a] - X[b];
					int abY = Y[a] - Y[b];
					int bcX = X[b] - X[c];
					int bcY = Y[b] - Y[c];
					if (abX*bcY == bcX*abY) {
								ans = "Yes";
								break;
					}
				}
			}
		}

		System.out.println(ans);

		}

	}
