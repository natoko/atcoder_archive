import java.util.*;
public class Main {
	int N,M;
	long[] X;
	long[] bonus;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		N = nextInt();
		M = nextInt();

		X = nextLongArray(N);
		bonus = new long[5001];
		for (int i = 0;i < M;i++) {
			int c = nextInt();
			bonus[c] = nextLong();
		}

		long ans = 0;
		int cnt = 0;

		System.out.println(calc());
		
	}

	public long calc(){
		long[][] dp = new long[N+1][N+1];
		dp[0][0] = 0;

		for (int i = 1;i <= N;i++) {
			for (int j = 1;j <= i;j++) {
				dp[i][j] = dp[i-1][j-1] + X[i-1] + bonus[j];
				dp[i][0] = Math.max(dp[i][0],dp[i - 1][j]);
			}
		}
		long ans = 0;
		for (int i =0;i <= N;i++) {
			ans = Math.max(ans,dp[N][i]);
		}
		return ans;
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
