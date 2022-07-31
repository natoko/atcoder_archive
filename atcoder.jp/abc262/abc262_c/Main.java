import java.util.*;
public class Main {
	int N;
	int[] a;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		N = nextInt();
		a = nextIntArray(N);

		long ans = (long)0;
		long cnt = (long)0;

		for (int i =0;i < N;i++) {
			a[i]-=1;
			if(a[i] == i) cnt++;
		}

		ans += (cnt*(cnt - 1))/2;

		for (int i =0;i < N;i++) {
			if(a[a[i]] == i && i < a[i]) ans++;
		}
		System.out.println(ans);

	}

	Scanner scan = new Scanner(System.in);
	String next() { return scan.next(); }
	int nextInt() { return Integer.parseInt(next()); }
	long nextLong() { return Long.parseLong(next()); }
	double nextDouble() { return Double.parseDouble(next()); }
	int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++) { array[i] = nextInt(); }
			return array;
	}
	int[][] nextIntIntArray(int n,int m) {
			int[][] array = new int[n][m];
			for (int i = 0; i < n; i++) { 
				for (int j = 0; j < m; j++) { 
					array[i][j] = nextInt(); 
				}
			}
			return array;
	}
	long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) { array[i] = nextLong(); }
			return array;
	}


}
