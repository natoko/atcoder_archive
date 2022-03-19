import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N;
	public static int[] T;
	public static Double[] L;
	public static Double[] R;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		T = new int[N];
		L = new Double[N];
		R = new Double[N];
		for (int n = 0;n < N ;n++ ) {
			T[n] = Integer.parseInt(scan.next());
			L[n] = Double.parseDouble(scan.next());
			R[n] = Double.parseDouble(scan.next());
			if (T[n] == 2) {
				R[n]-=0.5;
			} else if (T[n] == 3) {
				L[n]+=0.5;
			} else if (T[n] == 4) {
				L[n]+=0.5;
				R[n]-=0.5;
			}
		}
		scan.close();

		long cnt = 0;
		for (int i = 0;i < N ;i++ ) {
			for (int j = i + 1;j < N;j++ ) {
				if (Math.max(L[i],L[j]) <= Math.min(R[i],R[j])) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
