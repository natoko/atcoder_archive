import java.util.*;
public class Main {
	static int mod = 998244353;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		long A = nextLong();
		long B = nextLong();
		long C = nextLong();
		long D = nextLong();
		long E = nextLong();
		long F = nextLong();

		long AB = ((A%mod)*(B%mod))%mod;
		long ABC = ((AB%mod)*(C%mod))%mod;
		long DE = ((D%mod)*(E%mod))%mod;
		long DEF = ((DE%mod)*(F%mod))%mod;

		long ans = (ABC-DEF)%mod;
		if(ans<0) ans = ans+mod;

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
