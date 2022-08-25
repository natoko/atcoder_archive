import java.util.*;
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		long N,M,T;
		long[] use;
		long[] rest = new long[100001];

		N = nextLong();
		M = nextLong();
		T = nextLong();
		use = nextLongArray((int)N-1);
		for (int i=0;i < M;i++) {
			int X = nextInt();
			long Y = nextLong();
			rest[X - 1] = Y;
		}

		boolean ans = false;

		for (int i=0;i <= N;i++) {
			if(i == (N-1)) {
				ans = true;
				break;
			}
			if (T <= use[i]) break;
			T-=use[i];
			T+=rest[i+1];
		} 


		System.out.println(ans?"Yes":"No");

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
