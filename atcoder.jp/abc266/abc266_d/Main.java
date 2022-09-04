import java.util.*;
public class Main {
	long N;
	long[][] get = new long[100001][5];
		
	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		N = nextLong();
		int tmax = 0;
		for (int i = 0;i < N;i++) {
			int t = nextInt();
			int x = nextInt();
			get[t][x] = nextLong();
			tmax = Math.max(t,tmax);
		}

		long[][]dp = new long[tmax+1][5];
		
		for (int i=0;i < tmax;i++) {
			for (int j =0;j < 5;j++ ) {
				long a = get[i+1][j];
				if(i+1 < j) a=0;
				if (j-1>=0) dp[i+1][j] = Math.max(dp[i+1][j],dp[i][j-1] + a);
				dp[i+1][j] = Math.max(dp[i+1][j],dp[i][j] + a);
				if (j+1<5) dp[i+1][j] = Math.max(dp[i+1][j],dp[i][j+1] + a);
			}
		}
		long ans = Math.max(dp[tmax][0],Math.max(dp[tmax][1],Math.max(dp[tmax][2],Math.max(dp[tmax][3],dp[tmax][4]))));

		System.out.print(ans);
		
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
	long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) { array[i] = nextLong(); }
			return array;
	}


}
