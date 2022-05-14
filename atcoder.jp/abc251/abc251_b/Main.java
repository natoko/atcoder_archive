import java.util.Scanner;
import java.util.*;
public class Main {
	public int i,j,k;
	public static int N,W;
	public static int[] A;
	public static int[] num;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		W = Integer.parseInt(scan.next());
		A = new int[N];
		num = new int[W];
		for (int a=0;a<N ;a++ ) {
			A[a] = Integer.parseInt(scan.next());
		}
		scan.close();

		int cnt = 0;

		for (int i =0;i < N ;i++ ) {
			if (A[i] <= W) {
				num[A[i]-1] = 1;
			}
		}

		for (int i =0;i < N ;i++ ) {
			for (int j = i+1;j < N ;j++ ) {
				if (A[i] + A[j] <= W) {
					num[A[i] + A[j] - 1] = 1;
				}
			}
		}

		for (int i =0;i < N ;i++ ) {
			for (int j = i+1;j < N ;j++ ) {
				for (int k=j+1;k < N ;k++ ) {
					if (A[i]+A[j]+A[k] <= W) {
						num[A[i]+A[j]+A[k] - 1] = 1;
					}
				}
			}
		}

		for (int w=0;w < W ;w++ ) {
			cnt+=num[w];
		}

		System.out.println(cnt);

	}


}
