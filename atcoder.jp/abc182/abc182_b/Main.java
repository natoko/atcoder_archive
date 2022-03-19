import java.util.Scanner;
public class Main {
	public static int N;
	public static int[] A;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N =  Integer.parseInt(scan.next());
		A = new int[N];
		int max_a = Integer.MIN_VALUE;
		for (int i = 0;i < N ;i++ ) {
			A[i] = Integer.parseInt(scan.next());
			max_a = Math.max(max_a,A[i]);
		}
		scan.close();

		int cnt = 0;
		int cnt_max = 0;
		int ans = 0;

		for (int a = 2;a <= max_a ;a++ ) {
			cnt = 0;
			for (int n = 0;n < N ;n++ ) {
				if (A[n]%a == 0) {
						cnt++;
				}
			}
			if (cnt > cnt_max) {
				cnt_max = cnt;
				ans = a;
			}
		}

		System.out.println(ans);

		}

	}
