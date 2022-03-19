import java.util.Scanner;
public class Main {
	public static int N;
	public static int[] A;
	public static int[] B;
	public static int[] C;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		A = new int[N];
		B = new int[N];
		C = new int[N];
		for (int a = 0;a < N ;a++ ) {
			A[a] = Integer.parseInt(scan.next());
		}
		for (int b = 0;b < N ;b++ ) {
			B[b] = Integer.parseInt(scan.next());
		}
		for (int c = 0;c < N ;c++ ) {
			C[c] = Integer.parseInt(scan.next());
		}
		scan.close();

		int[] cnt = new int[N];
		long ans = 0;
		for (int i = 0;i < N ;i++ ) {
			cnt[B[C[i] - 1] - 1]++;
		}
		for (int j = 0;j < N ;j++ ) {
			ans+=(long)cnt[A[j] - 1];
		}

		System.out.println(ans);
	}

}
